<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<jsp:include page="/template/header.jsp"></jsp:include>

<form action="login.do" method="post">

	<article class="w-40">
		<div class="row">
			<h2>로그인</h2>
		</div>
		<div class="row">
			<input class="form-input" type="text" name="member_id"
				placeholder="아이디" required>
		</div>
		<div class="row">
			<input class="form-input" type="password" name="member_pw"
				placeholder="비밀번호" required>
		</div>
		<div class="row">
			<input type="checkbox" id="save-id"> <label for="save-id">아이디
				기억하기</label>
		</div>
		<div class="row">

			<div class="row">
				<input class="form-btn" type="submit" value="로그인">
			</div>
			<a href="find_id.jsp">아이디가 기억나지 않습니다 </a>
		</div>
		<div class="row">
			<a href="#">비밀번호가 기억나지 않습니다</a>
		</div>
<%
	if (request.getParameter("error") != null) {
%>
		<div class="row center">
<h6>
	<font color="#FF0000">입력하신 로그인 정보가 맞지 않습니다</font>
</h6>
<%
	}
%>
		   
		</div>
	</article>
</form>




<!-- 오류 메시지는 페이지에 error라는 파라미터가 있을 경우만 출력 -->


<jsp:include page="/template/footer.jsp"></jsp:include>






