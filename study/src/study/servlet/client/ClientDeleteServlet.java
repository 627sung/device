package study.servlet.client;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import study.beans.client.ClientDao;
import study.beans.client.ClientDto;
@WebServlet(urlPatterns = "/client/delete.do"  )
public class ClientDeleteServlet extends HttpServlet{
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	try {
		ClientDto cdto = new ClientDto(); //로그인 메소드에서 	ClientDto cdto를 받는다 
		cdto.setClient_id(req.getParameter("client_id"));
		cdto.setClient_pw(req.getParameter("client_pw"));
		
		// 처리  로그인후 성공시에만 삭제 
		
		
		ClientDao cdao = new ClientDao(); //cdao에 있는 메소드 사용하려고 객체만듬
		ClientDto newDto =cdao.login(cdto); //새로운 저장공간(	ClientDto newDto)에 로그인 결과를 담는다. 
		
		if(newDto!=null) { //아이디만 줘도 되고 cdto를 줘도 된다. 자료형만 잘 보고 설정하시오 
		  
			cdao.delete(cdto.getClient_id());
		}
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/plain");
		
		if(newDto!=null) { //로그인 결과가 있다면 
			resp.getWriter().println("회원탈퇴 완료 이용해주셔서 감사링");
		} else { //로그인 조건에 일치하는 조건이없다면 
			resp.getWriter().println("로그인 정보가 맞지가 않음");
		}
		
		
		
		
		
	}catch(Exception e) {
		e.printStackTrace();
		resp.sendError(500);
	}
	
	
	
	
	
}
}
