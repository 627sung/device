<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 파일을 업로드하기 위한 form 구성 
- GET으로 전송하면 파일명이 전송된다.
- POST로 전송하면?
-->


<h1>파일 업로드 화면</h1>
<form action="upload.do" method="get">
   <input type="text" name="uploader">
   <br><br>
   <input type="file" name="f">
   <br><br>
   <input type="submit" value="업로드">
</form>