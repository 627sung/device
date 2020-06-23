package study.servlet.filemanage;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@WebServlet(urlPatterns = "/filemanage/upload2.do")
public class FileUploadServlet2 extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
//			목표 : 원래 우리가 사용하던 것처럼 "이름"으로 접근하여 데이터를 추출 
			File baseDir = new File("D:/upload");//저장할 위치 
			baseDir.mkdirs();//없으면 만들어라! 
			
			int limit = 10 * 1024 * 1024;//10MB 최대 가능 용량 
			String charset ="UTF-8"; 
			
			//생성 
			DiskFileItemFactory factory = new DiskFileItemFactory();
			factory.setRepository(baseDir); //저장할 위치 설정
			factory.setSizeThreshold(limit); //용량설정
			factory.setDefaultCharset(charset); // 인코딩설정 
			
			//도구만들기
			//factory의 정보를 기반으로 도구를 생성하여 utility 라고 부른다.
			ServletFileUpload utility = new ServletFileUpload(factory);
			
		//	utility를 이용하여 요청을 분석 
			 Map<String ,List<FileItem>> map = utility.parseParameterMap(req);
			 System.out.println(map); 
			
		//파라미터는 일반적으로 1개의 데이터만 넘어온다 .
		String uploader = map.get("uploader").get(0).getString(); // 0번 위치에 있는걸 직접 꺼내온다 
		System.out.println("uploader = " + uploader);
			
		
		//파일은 multiple 옵션의 유무에 따라 전송형태가 달라진다 .
		// 둘다 여러개라고 생각하고 반복문으로 처리하는 것이 가장 좋다 .
		 List<FileItem> list  = map.get("f");
		 for( FileItem item : list) {
			 //item을 저장하면 된다 .(정보는 데이터베이스의 저장 ) 
			 //주의 파일 크기가 0 이라면 저장을 안한다. 
			 if(item.getSize()>0) {
				 //실제 파일 저장 코드 
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


