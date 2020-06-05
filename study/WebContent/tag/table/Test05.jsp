-<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%for(int i = 1; i<=10; i++) {%>
	<h3>Hello <%out.print(i); %></h3>
 <%}%>


<%for(int i = 1; i<=10; i++) {%>
	<h3>Hello <%=(i)%></h3>
 <%}%>






