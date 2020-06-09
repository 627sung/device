<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<jsp:include page="/template/header.jsp"></jsp:include>



<div align="center">

   <h2>로그인</h2>

   <form action="">
      <table border="0">
         <tbody>
            <tr>
               <th>아이디</th>
               <td><input type="text" name="member_id" required ></td>
            </tr>

            <tr>
               <th>비밀번호</th>
               <td><input type="password" name="member_pw" required >
               </td>
            </tr>

         </tbody>
         <tfoot>
            <tr align="center">
               <td colspan="2"><input type="submit" value="Login"></td>
            </tr>
            <tr align="center">
            <td colspan="2">
            <a href="#">아이디가 기억나지 않습니다</a>
            <br>
            <a href="#">비밀번호가 기억나지 않습니다</a>
            </td>
            </tr>
         </tfoot>
      </table>



   </form>


</div>






<jsp:include page="template/footer.jsp"></jsp:include>