<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/template/header.jsp"></jsp:include>


 <div align="center">
    <h2>게시판</h2>
    <form action="join.do" method="post">
		<table border="1">
			<tbody>
				<tr>
					<th>번호</th>
					<th>글머리</th>
					<th>제목</th>
					<th>작성자</th>
					<th>게시일</th>
					<th>조회수</th>
				</tr>
				
				
					<tr>
					<th>??</th>
					<th>?</th>
					<th>?</th>
					<th>?</th>
					<th>?</th>
					<th>?</th>
				</tr>
				
					
			</tbody>
			<tfoot>
				<tr>
					<th colspan="2">
					<a href="/home/board/write.jsp">글쓰기</a> 
					</th>
				</tr>
			</tfoot>
		</table>
	</form>
    </div>





<jsp:include page="/template/footer.jsp"></jsp:include>
