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
@WebServlet(urlPatterns = "/client/search.do")
public class ClientSearchServlet extends HttpServlet {
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub

	try {
		String keyword = req.getParameter("keyword");
		
		//처리
		ClientDao cdao = new 	ClientDao();
		List< ClientDto>list = cdao.search(keyword);
				
				
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/plain");
		
		if(!list.isEmpty()) {//리스트가 비어 있지 않다면
			resp.getWriter().println("검색결과는 총" +list.size()+"개 입니다.");
			for( ClientDto cdto : list) {
				resp.getWriter().print("회원아이디: "+cdto.getClient_id());
				resp.getWriter().print(",");
				resp.getWriter().print("회원권한: "+cdto.getClient_auth());
				resp.getWriter().println();
			}
				
		}else {
			resp.getWriter().println("검색결과가 없습니다.");
		}
		
	
		
	}catch (Exception e) {
		e.printStackTrace();
		resp.sendError(500);
	}






}
}
