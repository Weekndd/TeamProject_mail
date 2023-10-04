<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import="com.dto.MemberDTO"%>
      <% MemberDTO dto = (MemberDTO)session.getAttribute("login"); %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- 비밀번호 변경 클릭 시 -->
<!-- The Modal -->
<div class="pwchange" id="pwchange">
    <div class="modal-dialog">
        <div class="pwchange_modal-content">
        
            <!-- Modal Header -->
            <div class="pwchange_modal-header">
                <h4 class="modal-title">비밀번호 변경</h4>
            </div>

            <!-- Modal body -->
            <div class="pwchange_modal-body">
                <form id="pwchange_form" action="MemberPwUpdateServlet" method="POST">
                    <!-- 현재 비밀번호, 변경할 비밀번호, 비밀번호 확인 -->
                    <!-- 회원정보 식별할 회원 아이디도 데이터를 보내야한다. 
                  		       이때 hidden으로 처리(보여줄 필요가 없기 때문.) -->
                    <input type="hidden" name="userId" value="<%=dto.getMember_num()%>">
                    
                    <table>
                        <tr>
                            <td>현재 비밀번호</td>
                            <td><input type="password" name="userPwd" id="pwd0" required>
                            <span id="result"></span></td>
                        </tr>
                        <tr>
                            <td>변경할 비밀번호</td>
                            <td><input type="password" name="updatePwd" id="pwd1" required></td>
                        </tr>
                        <tr>
                            <td>변경할 비밀번호 확인</td>
                            <td><input type="password" name="checkPwd" id="pwd2" required></td>
                        </tr>
                    </table>
                    <br>
                    <button type="submit" class="btn_btn-warning">비밀번호 변경</button>
                    <button type="button" class="close" data-dismiss="modal">취소</button>
                </form>
            </div>
        </div>
    </div>
</div>
