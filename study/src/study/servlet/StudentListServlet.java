package study.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import study.beans.student.StudentDao;
import study.beans.student.StudentDto;
@WebServlet(urlPatterns = "/student/list.do")
public class StudentListServlet extends HttpServlet {
 @Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


	
	
	try {
		StudentDao sdao = new StudentDao();
		List<StudentDto> list =sdao.getList();
		
	
	//출력
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/plain");
		
		//list의 모든 내용을 sdto에 순서대로 전달합니다 
		
		for(StudentDto sdto : list) {
			resp.getWriter().println(sdto.getStudent_name());
		}
		
		
		
	}
	catch(Exception e) {
		e.printStackTrace();
		resp.sendError(500);
	}
	
}
}
 
 
