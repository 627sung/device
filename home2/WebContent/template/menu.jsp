<%@page import="home.beans.dto.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 메뉴 -->    
<!-- 
	링크 주소는 어떤 방식으로 작성해야 하는가?
	- 템플릿 페이지는 어느 페이지에서 실행될지 모르기 때문에 경로를 무조건 절대경로로 작성해야 한다
	- context path(프로젝트명으로 구성된 주소) 는 언제든지 바뀔 수 있다
		- 변하는 경로에 맞게 경로를 계산해내는 명령이 필요 : request.getContextPath()
 -->
 
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <c:set var="rootPath" value=${pageContext.request.contextPath} ></c:set>

<c:choose>
<c:when test="${uesrinfo.Member_auth()=='관리자'}">
<!-- 관리자가보는메뉴 -->

<ul class="menu">
    <li><a href="${rootPath}/index.jsp">홈으로</a></li>
    <li><a href="${rootPath}/member/logout.do">로그아웃</a></li>
    <li><a href="${rootPath}/admin/home.jsp">관리메뉴</a></li>
    <li><a href="${rootPath}/board/list.jsp">게시판</a></li>
</ul>
<!-- 회원이보는메뉴 -->

</c:when>
<c:when test="${userinfo!=null}">
<ul class="menu">
    <li><a href="${rootPath}/index.jsp">홈으로</a></li>
    <li><a href="${rootPath}/member/logout.do">로그아웃</a></li>
    <li><a href="${rootPath}/member/info.jsp">내정보</a></li>
    <li><a href="${rootPath}/board/list.jsp">게시판</a></li>
</ul>

</c:when>
<c:otherwise>
<!-- 비회원이보는메뉴 -->
<ul class="menu">
    <li><a href="${rootPath}/index.jsp">홈으로</a></li>
    <li><a href="${rootPath}/member/join.jsp">회원가입</a></li>
    <li><a href="${rootPath}/member/login.jsp">로그인</a></li>
    <li><a href="${rootPath}/board/list.jsp">게시판</a></li>
</ul>
 </c:otherwise>

</c:choose>







