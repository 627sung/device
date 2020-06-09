<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="template/header.jsp"></jsp:include>

<div align="center">
	<h2>회원가입</h2>
	<form action="">
		<table border="0">
			<tbody>
				<tr>
					<th>아이디</th>
					<td>
					<input type = "text" name="member_id" required placeholder="8~20자 영문 또는 숫자">
					</td>
				</tr>

				<tr>
					<th>비밀번호</th>
					<td>
					<input type = "password" name="member_pw" required placeholder="8~16자 영문 또는 숫자">
					
					</td>
				</tr>

				<tr>
					<th>닉네임</th>
					<td>
				<input type = "text" name="member_nick" required placeholder="8자이내 한글">
					
					</td>
				</tr>

				<tr>
					<th rowspan = 3>주소</th>
					<td>
					<input type = "text" name = "post" placeholder ="우편번호" size="6" maxlength="6" >
					<input type ="button" value="우편번호 찾기">
					</td>
				</tr>

				<tr>
					<td>				
				<input type = "text" name = "base_addr" placeholder ="기본주소" size= "50"  >
					</td>
				</tr>

				<tr>
					<td>
				<input type = "text" name = "extra_addr" placeholder ="상세주소" size= "50"  >
				</td>
				</tr>

				<tr>
					<th>전화번호</th>
					<td>
			<input type = "text" name = "member_phone" placeholder ="번호입력  -제외" >
					
					
					</td>
				</tr>

				<tr>
					<th>생년월일</th>
					<td>
					<input type ="date" name = "member_birth" placeholder ="생년월일입력" required> 
					</td>
				</tr>

				<tr>
					<th>자기소개</th>
					<td>
				<textarea name = "member_intro" rows = "7" cols ="50" placeholder ="이쁘고 고운말만  쓰세요"></textarea>					
					</td>
				</tr>

			

			</tbody>



			<tfoot>
		<tr>
		<th colspan ="2">
		<input type = "submit" value = "가입">
		</tr>

			</tfoot>


		</table>


	</form>





</div>
<br><br>
<jsp:include page="template/footer.jsp"></jsp:include>