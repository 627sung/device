<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--
	JSTL(Jsp Standard Tag Library)
	- JSP 표준 태그 모음
	- JSP에서 꼭 필요한 프로그래밍 코드를 태그화 시켜둔 것(if, for, 등...)
	- 총 5개의 종류가 있음
		- core : 필수 프로그래밍 코드
		- format : 형식 변환 코드
		- sql : 데이터베이스 코드
		- xml : xml 문서 관련 코드
		- function : 문자열 처리 코드
	- jstl-1.2.jar 파일 필요
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- int a = 10; -->
<c:set var="a" value="10"></c:set>
<%-- <h1>a : <%=pageContext.getAttribute("a")%></h1> --%>
<h1>a : ${a}</h1>

<!-- a의 값을 5 증가시키고 싶다면 -->
<!-- a = a + 5; -->
<c:set var="a" value="${a+5}"></c:set>
<h1>a : ${a}</h1>

<!-- String b = "hello"; -->
<c:set var="b" value="hello"></c:set>