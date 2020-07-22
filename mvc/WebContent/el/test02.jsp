<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--
	저장소별로 저장된 데이터에 접근하기 위한 EL 코드
		- request : requestScope 사용(생략 가능)
		- session : sessionScope 사용(생략 가능)
		- application : applicationScope 사용(생략 가능)
--%>

<%
	//서블릿이라 생각하고 첨부코드를 작성
	request.setAttribute("a", 100);

	//세션에 데이터를 추가
	session.setAttribute("id", "admin");
%>


<!-- 출력 -->
<h1>a = <%=request.getAttribute("a")%></h1>
<h1>a = ${requestScope.a}</h1>
<h1>a = ${a}</h1>

<h1>id = <%=session.getAttribute("id")%></h1>
<h1>id = ${sessionScope.id}</h1>
<h1>id = ${id}</h1>

<!-- 
만약 세션에 저장된 auth라는 항목이 "관리자"라면 true, 아니면 false 출력  
- 자바에서는 null인 경우를 고려하면서 식을 작성해야함
-->
<h1>권한 = <%=session.getAttribute("auth") != null && session.getAttribute("auth").equals("관리자")%></h1>
<h1>권한 = ${auth == "관리자"}</h1>






    