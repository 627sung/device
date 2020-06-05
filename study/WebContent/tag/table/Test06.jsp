<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>구구단을 만들자</title>
</head>
<body>
	<table border="1">
		<thead>
			<tr>
				<th>2단</th>
				<th>3단</th>


			</tr>
		<tbody>

			<%
				for (int i = 1; i <= 9; i++) {
			%>
			<tr>
				<td>2X <%=i%> =<%=2 * i%>
				</td>
				<td>3X <%=i%> = <%=3 * i%>
				</td>
			</tr>
			<%
				}
			%>



		</tbody>





	</table>
</body>
</html>