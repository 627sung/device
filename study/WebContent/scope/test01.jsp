<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- test01 -->



<%


//session.setAttribute("문자열", 아무거나);
//세션은 단골손님 수첩 
session.setAttribute("b",20);
int a = 10;

application.setAttribute("c", 30);

%>

<h2> a= <%=a%></h2>
<h2> b= <%=session.getAttribute("b")%></h2>

<h2>session id =<%=session.getId() %></h2>

<h2> c= <%=application.getAttribute("c")%></h2>
