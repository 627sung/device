package home.servlet.reply;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.dao.BoardDao;
import home.beans.dao.ReplyDao;
import home.beans.dto.BoardDto;
import home.beans.dto.MemberDto;
import home.beans.dto.ReplyDto;

@WebServlet(urlPatterns = "/board/reply_insert.do")

public class ReplyWitreServlet  extends HttpServlet{
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
//			목표 : 게시글 등록 후 상세 페이지로 이동
//			준비 : 말머리, 제목, 내용, 작성자
			
			//입력
			MemberDto mdto = (MemberDto) req.getSession().getAttribute("userinfo");
	
			
			ReplyDto rdto = new ReplyDto();
			rdto.setReply_writer(mdto.getMember_id());
			rdto.setReply_content(req.getParameter("reply_content"));
			rdto.setReply_origin(Integer.parseInt(req.getParameter("reply_origin"))); //reply_origin에 게시글 번호가 저장되어었다. 
			
			//처리
			ReplyDao rdao = new ReplyDao();
			rdao.write(rdto);//등록
			
			
			//댓글이 등록되었다면 개수르 다시 세도록 지시한다. 
			BoardDao bdao = new BoardDao();
			bdao.editReplycount(rdto.getReply_origin());
			
			
			
			
			//출력
			resp.sendRedirect("content.jsp?board_no="+ rdto.getReply_origin());
		
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);//--> 미리 등록된 에러 페이지 500번으로 연동
		}
	}
}

