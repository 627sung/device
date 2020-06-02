package study.servlet.client;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import study.beans.client.ClientDao;
import study.beans.client.ClientDto;
import study.beans.student.StudentDao;
@WebServlet(urlPatterns = "/client/regist.do")
public class ClientRegistServlet extends HttpServlet{
       @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	//   String client_id = req.getParameter("client_id");
    	  // String client_pw = req.getParameter("client_pw");

    	   try {
    	   
    		//입력   
    		ClientDto cdto = new   ClientDto ();
    	   cdto.setClient_id(req.getParameter("Client_id"));
    	   cdto.setClient_pw(req.getParameter("Client_pw"));
    	   
    	  //처리
    	   ClientDao cdao = new  ClientDao();
    	   cdao.regist(cdto);
    	   
    	   
    	   //출력
    		resp.setContentType("text/plain");
			resp.setCharacterEncoding("UTF-8");
			resp.getWriter().println("회원 등록이 완료되었습니다. ");
    	   
    	   
    	   }catch (Exception e) {
   			//오류가 생긴경웅 사용자에게 오류 발생을 알려준다 +서버에 기록을 남긴다. 
   			e.printStackTrace(); //오류의 기록을 남긴다. 
   			resp.sendError(500);
    	   
    	   
    }
  }

}
	

