<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>내가만든 홈페이지</title>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/base.css">
    <style>
        main {
            width:1000px;
            margin:auto;
        }
    </style>
</head>
<body test>
    <main>
        <header>
            <h1 class="center">JSP 2주만에 뽀개기</h1>
        </header>        
        <nav>
            <jsp:include page="/template/menu.jsp"></jsp:include>
        </nav>
        <section>
            <div class="row-empty"></div>
            <div class="row-empty"></div>