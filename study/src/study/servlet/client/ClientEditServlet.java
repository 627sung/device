package study.servlet.client;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import study.beans.client.ClientDao;
import study.beans.client.ClientDto;
import sun.print.resources.serviceui;
@WebServlet(urlPatterns = "/client/edit.do")
public class ClientEditServlet extends HttpServlet {
 
 @Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	 
	 
	 try {
		 
		 ClientDto  cdto  = new ClientDto();
		 cdto.setClient_id(req.getParameter("client_id"));
		 cdto.setClient_pw(req.getParameter("client_pw"));
		 
		 ClientDao cdao = new ClientDao();
		 ClientDto newDto = cdao.login(cdto); //newDto에 로그인 결과가 들어간다. 
		 
		 if(newDto !=null) {//로그인 성공이라면 
			 cdto.setClient_pw(req.getParameter("new_pw"));
			 cdao.edit(cdto); //비밀번호변경
		 }
		 
		 //출력 
		 resp.setCharacterEncoding("UTF-8");
		 resp.setContentType("text/plain");
		 
		 if( newDto !=null) { //로그인성공시 
			resp.getWriter().println("정보수정이 완료가 되었습니다.");
		 }else {
			 resp.getWriter().println("로그인 정보가 맞지 않습니다.");
		 }
		 
		 
		 
		 
		 
		 
		 
		 
	 }catch(Exception e) {
		 e.printStackTrace();
		 resp.sendError(500);
	 }
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
	    
	
}
