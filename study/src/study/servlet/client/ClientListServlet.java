package study.servlet.client;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import study.beans.client.ClientDao;
import study.beans.client.ClientDto;
@WebServlet(urlPatterns = "/client/list.do")
public class ClientListServlet extends HttpServlet {

		
		@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	
		
		try {
			ClientDao  cdao  = new 	ClientDao();
			List<ClientDto>list = 	cdao.getList();
			
			resp.setCharacterEncoding("UTF-8");
			resp.setContentType("text/plain");
			
			for(ClientDto cdto : list) {
				resp.getWriter().print(cdto.getClient_id()) ;
				resp.getWriter().print("/") ;
				resp.getWriter().print(cdto.getClient_auth()) ;
				resp.getWriter().println() ;

			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
			
		}
			
		}

}
