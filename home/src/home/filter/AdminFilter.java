package home.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.dto.MemberDto;
//@WebFilter(urlPatterns = "/admin/*")
public class AdminFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		
		
		//다운캐스팅을 통래 필요한 객체 형태로 변환
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse resp = (HttpServletResponse)response;
		
		MemberDto mdto =(MemberDto) req.getSession().getAttribute("userinfo");
	
		
		
	boolean isLogin = mdto != null;   //mdto가 null이 아닌가요??? 
		

//	if(!isLogin) {
//		resp.sendRedirect(req.getContextPath()+"/member/login.jsp");
//		return;//중지(반환)
//	}
	
	if(mdto.getMember_auth().equals("관리자")) {
		chain.doFilter(request, response);
		
		
	}else { //관리자가 아니라면 
		resp.sendError(403); //권한없음 
	}
	
	
	
	
	
	}
}

