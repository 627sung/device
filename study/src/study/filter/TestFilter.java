package study.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


//url패턴에 감시할 대상의 주소를 적는다. 
// /* 모든 주소를 의미한다 
@WebFilter(urlPatterns = "/index.jsp") 
public class TestFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		System.out.println("필터실행");
	
		chain.doFilter(request, response);
		
	}

	
}