<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<h1>a=<%=request.getParameter("a")%></h1>
	<h1>a=${param.a}</h1>
    
    <form action =test01.jsp>
    <input type="text" name ="a" value ="${param.a}">
    <input type="submit" value="전송">
    </form>