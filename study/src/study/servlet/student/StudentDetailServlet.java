package study.servlet.student;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import study.beans.student.StudentDao;
import study.beans.student.StudentDto;
@WebServlet(urlPatterns = "/student/detail")
public class StudentDetailServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
		try {
			
			//입력 : 번호 (student_no);
			int student_no = Integer.parseInt(req.getParameter("student_no"));
			
			//처리
			StudentDao sdao = new StudentDao();
			StudentDto sdto  = sdao.get(student_no);
			
			resp.setContentType("text/plain; charset = UTF-8");

			
			
			
			if(sdto == null ) {
				resp.getWriter().println("없는데요...");
				
				
			}else {//sdto !=null 
				resp.getWriter().print("상세정보");
				resp.getWriter().print(sdto.getStudent_no());
				resp.getWriter().print(sdto.getStudent_name());
				resp.getWriter().print(sdto.getStudent_score());
				resp.getWriter().print(sdto.getStudent_create ());

			}
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
			resp.sendError(500);
			
		}
		
		
		
		
		
		
		
		
		
		
		
	
	}
	
	
	
	
	
	
	
	
	
}
