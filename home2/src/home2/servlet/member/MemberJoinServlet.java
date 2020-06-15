package home2.servlet.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.dao.MemberDao;
import home.beans.dto.MemberDto;

//회원가입 흐름도(flow graph)에 의하면 주소는 http://localhost:8080/home/member/join.do 이다.
@WebServlet(urlPatterns = "/member/join.do")
public class MemberJoinServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			//입력 : join.jsp에서 넘어오는 9개의 데이터를 수신 ----> MemberDto 형태로 수신
			MemberDto mdto = new MemberDto();
			mdto.setMember_id(req.getParameter("member_id"));
			mdto.setMember_pw(req.getParameter("member_pw"));
			mdto.setMember_nick(req.getParameter("member_nick"));
			mdto.setPost(req.getParameter("post"));
			mdto.setBase_addr(req.getParameter("base_addr"));
			mdto.setExtra_addr(req.getParameter("extra_addr"));
			mdto.setMember_birth(req.getParameter("member_birth"));
			mdto.setMember_phone(req.getParameter("member_phone"));
			mdto.setMember_intro(req.getParameter("member_intro"));
			
			//처리 : MemberDao를 이용한 데이터베이스 등록
			MemberDao mdao = new MemberDao();
			mdao.join(mdto);
			
			//출력 : ????
			resp.getWriter().println("finish");
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}
