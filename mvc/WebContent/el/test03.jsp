<%@page import="mvc.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--
	EL에서의 객체(DTO) 접근
--%>

<%
	//서블릿에서 첨부하는 코드
	MemberDto mdto = new MemberDto();
	mdto.setId("admin");
	mdto.setPassword("admin1234");
	
	request.setAttribute("mdto", mdto);
%>

<!-- 출력 페이지 -->
<h1>아이디 : <%=((MemberDto)request.getAttribute("mdto")).getId()%></h1>
<h1>아이디 : ${requestScope.mdto.getId()}</h1>
<h1>아이디 : ${mdto.getId()}</h1>
<h1>아이디 : ${mdto.id}</h1>    
<h1>비밀번호 : ${mdto.password}</h1>

    