<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/template/header.jsp"></jsp:include>
    
    <div align="center">
    <h2>게시글작성</h2>
    <form action="write.do" method="post">
		<table border="0">
			<tbody>
				
				<tr>
					<th>글머리</th>
					<td>
						<select name="board_head">
    			<option value=""> </option>
    			<option value="정보">정보</option>
    			<option value="공지">공지</option>
    			<option value="유머">유머</option>
					</select>
						
					</td>
				</tr>
				<tr>
					<th>글제목</th>
					<td>
						<input type="text" name="member_title" required placeholder="한글 100자 이내">
					</td>
				</tr>
				<tr>
				
					<th></th>
					<td>
						<!-- rows는 표시할 최소 줄 수, cols는 표시할 최소 칸 수 -->
						<textarea name="BOARD_CONTENT" rows="7" cols="50" placeholder="욕설 등은 자제하세요!"></textarea>
					</td>
				</tr>
			</tbody>
			<tfoot>
				<tr>
					<th colspan="2">
						<input type="submit" value="작성">
					</th>
				</tr>
			</tfoot>
		</table>
	</form>
    </div>
    
    
    
    
    
<jsp:include page="/template/footer.jsp"></jsp:include>
    