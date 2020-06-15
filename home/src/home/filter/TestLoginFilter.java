package home.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.dao.MemberDao;
import home.beans.dto.MemberDto;
//등록은 web.xml에 할것이다.
public class TestLoginFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		//목표 서버를 구동하기만 하면 로그인이 되어있도록 구현하기 
		// 관리자로 하든 사용자로 하든 그것은 선택하여 구현하기 
		//주의 개발용이므로 서비스 배포시 반드시 제거 
		
		//계획 
		//1 현재 요청을 보낸 사용자의 로그인 여부를 조사한다. 
		//2 1번에서 로그인이 되어있다면 통과, 안되어있다면 로그인 처리를 수행한다. 
		// - DB에 아이다가 미리 있다면 그 아이디를 불러와서처리 
		// -DB에 아이디가 없다면 신규 가입 처리 후 처리 
		
		//2번에서 불러온 정보를  세션에 저장후 통과 
		
		//다운 캐스팅
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		
		MemberDto mdto = (MemberDto) req.getSession().getAttribute("userinfo");
		
		
		//2번코드 
		//로그인이 되어 있다면 통과시켜라 아니면 ....
		// 로그인이 안되어 있다면 ......
		
		try {
		if(mdto ==  null) {//로그인이 아니라면 
			//3번코드 
			MemberDao mdao =new 	MemberDao();
			MemberDto user = mdao.get("khacademy");//khacademy 아이디확인
					if(user ==null) {//찾는 아이디가 없으면
						//회원가입및 재조회 
					MemberDto newUser = new MemberDto();
					newUser.setMember_id("khacademy");
					newUser.setMember_pw("khacademy");
					newUser.setMember_nick("khacademy");
					newUser.setMember_birth("2000-01-01");
					newUser.setMember_phone("01011112222");
					mdao.join(newUser);
					
					
					user=mdao.get("khacademy");
					}//로그인
					req.getSession().setAttribute("userinfo", user);

	}
		chain.doFilter(request, response); //통과 
		
		
		}catch (Exception e){
			e.printStackTrace();
			resp.sendError(500);
			
		}
	}

}
