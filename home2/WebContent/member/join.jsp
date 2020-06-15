<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="/template/header.jsp"></jsp:include>

<div align="center">
	<h2>회원가입</h2>


	<form action="/join.do">
		<table border="0">
			<tbody>
				<tr>
					<th>아이디</th>
					<td><input type="text" name="member_id" required
						placeholder="8~20 영문 또는 숫자">
					<td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td><input type="text" name="member_pw" required
						placeholder="8~16 영문 또는 숫자">
					<td>
				</tr>
				<tr>
					<th>닉네임</th>
					<td><input type="text" name="member_nick" required
						placeholder="한글 8자이내">
					<td>
				</tr>
				<tr>
					<th rowspan = "3">우편번호</th>
					<td><input type="text" name="POST" placeholder="우편번호" size="6"
						maxlength="6">
						
						<input type ="button" value ="우편번호찾기">
					<td>
				</tr>
				<tr>
					<td><input type="text" name="BASE_ADDR " placeholder="기본주소"
						size="50">
					<td>
				</tr>
				<tr>
					<td><input type="text" name="EXTRA_ADDR" placeholder="상세주소"
						size="50">
					<td>
				</tr>
				<tr>
					<th>전화번호</th>
					<td><input type="text" name="member_phone" placeholder="전화번호 _제외 " required>
					<td>
				</tr>
				<tr>
					<th>생년월일</th>
					<td><input type="date" name="member_birth" placeholder="생년월일 " required>
					<td>
				</tr>
				<tr>
					<th>자기소개</th>
					<td><textarea name = "member_intro" rows ="7" cols = "50" placeholder="욕설 비방 제제입니다."></textarea>
					<td>
				</tr>

			</tbody>
			<tr>
			</tr>


			<tfoot>
				<tr>
					<td align ="center" colspan="2"><input type="submit" value="가입" ></td>
				</tr>
			</tfoot>
			</form>





			<table border="1" width="500"></table>
			</div>
			<jsp:include page="/template/footer.jsp"></jsp:include>