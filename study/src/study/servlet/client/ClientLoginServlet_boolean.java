package study.servlet.client;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import study.beans.client.ClientDao;
import study.beans.client.ClientDto;
@WebServlet(urlPatterns = "/client/login.do")
public class ClientLoginServlet_boolean extends HttpServlet {
 @Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	 
	 
	 try {
	//입력
		 String  cilent_id=req.getParameter("client_id");
		 String  cilent_pw=req.getParameter("client_pw");
		//처리 
		 ClientDao cdao = new 	 ClientDao();
		 boolean result = cdao.login(cilent_id,cilent_pw);
		 
		 //출력
		 resp.setCharacterEncoding("UTF-8");
		 resp.setContentType("text/plain");
		 
		 if(result) {
			 resp.getWriter().println("로그인성공");
		 }else {
			 resp.getWriter().println("로그인실패");

		 }
		 
		 
		 
	 }catch(Exception e){
		 e.printStackTrace();
		 resp.sendError(500);
		 
		 
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
}
