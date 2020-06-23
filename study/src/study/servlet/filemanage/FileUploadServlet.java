package study.servlet.filemanage;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@WebServlet(urlPatterns = "/filemanage/upload.do")
public class FileUploadServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
//			파일 업로드를 위해서 먼저 정해두어야 할 사항
//			1. 파일이 저장될 위치(baseDir)
//			2. 파일의 최대 허용 용량(limit)
			
			File baseDir = new File("D:/upload");//파일이 저장될 폴더 객체
			baseDir.mkdirs();//없으면 만들어라!
			
			int limit = 10 * 1024 * 1024;//10MB
			
//			생성을 도와주는 도구 생성(factory) req로는 저장할수 없다. req에서 받은값을 파일형태로 받아줘야함 
			DiskFileItemFactory factory = new DiskFileItemFactory(limit, baseDir);
			ServletFileUpload utility = new ServletFileUpload(factory);
			
//			utility를 이용하여 multipart/form-data 요청을 해석
//			- FileItem 은 분석된 요청 데이터 1개를 의미
			List<FileItem> list = utility.parseRequest(req); //req(사용자의 요청으로) 들어온 데이터를 전부 해석
			
//			list에 들어있는 데이터를 분석
			for(FileItem item : list) {
				System.out.println(item.getFieldName());//파라미터 이름
				System.out.println(item.isFormField());//폼 입력항목인가?(파일이 아닌가?)
				if(item.isFormField()) {//파일이 아닌 경우 - 값만 출력
					System.out.println("파일이 아닙니다");
					System.out.println(item.getString());//값 추출
				}
				else {//파일인 경우 - 파일 정보를 출력(이름,유형,크기)
					System.out.println("파일입니다");
					System.out.println(item.getName());//파일이름
					System.out.println(item.getSize());//파일크기
					System.out.println(item.getContentType());//파일유형
					
					//저장 코드 : item.write(대상파일객체);
					File target = new File(baseDir, item.getName());
					item.write(target);
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}


