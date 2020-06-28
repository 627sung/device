<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<jsp:include page="/template/header.jsp"></jsp:include>

<form action="join.do" method="post">
<article class="w-50">
	<!-- 제목 -->
	<div class="row">
		<h2>회원 가입</h2>
	</div>
	<!-- 아이디 입력창 -->
	<div class="row">
		<label>아이디</label>
		<input class="form-input" type="text" name="member_id" required placeholder="5~20자 영문 또는 숫자" autocomplete="off">
	</div>
	<!-- 비밀번호 입력창 -->
	<div class="row">
		<label>비밀번호</label>
		<input class="form-input" type="password" name="member_pw" required placeholder="8~16자 영문 또는 숫자">
	</div>
	<!-- 닉네임 입력창 -->
	<div class="row">
		<label>닉네임</label>
		<input class="form-input" type="text" name="member_nick" required placeholder="한글 8자 이내" autocomplete="off">
	</div>
	<!-- 우편번호 및 찾기버튼 -->
	<div class="row">
		<input class="form-input form-inline" type="text" name="post" size="6" maxlength="6" placeholder="우편번호">
		<input class="form-btn form-inline" type="button" value="우편번호 찾기">
	</div>
	<!-- 기본주소 -->
	<div class="row">
		<input class="form-input" type="text" name="base_addr" size="50" placeholder="기본주소">
	</div>
	<!-- 상세주소 -->
	<div class="row">
		<input class="form-input" type="text" name="extra_addr" size="50" placeholder="상세주소">
	</div>
	<!-- 전화번호 -->
	<div class="row">
		<label>전화번호</label>
		<input class="form-input" type="text" name="member_phone" required placeholder="- 제외">
	</div>
	<!-- 생년월일 -->
	<div class="row">
		<label>생년월일</label>
		<input class="form-input" type="date" name="member_birth" required>
	</div>
	<!-- 자기소개 -->
	<div class="row">
		<textarea class="form-input" rows="5" name="member_intro" placeholder="욕설 등은 자제하세요!"></textarea>
	</div>
	<!-- 가입버튼 -->
	<div class="row">
		<input class="form-btn" type="submit" value="가입">
	</div>
</article>
</form>





<jsp:include page="/template/footer.jsp"></jsp:include>


