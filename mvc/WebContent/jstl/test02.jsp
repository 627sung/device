<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:if test="${param.a!=null}">
<h1>a:${param.a}</h1>
</c:if>

<c:if test="${empty param.a}">
<h1>a는 없습니다 .</h1>
</c:if>

<c:choose>
<c:when test="${not empty param.a}">
a:${param.a}
</c:when>
<c:otherwise>
a는 없습니다.
</c:otherwise>
</c:choose>