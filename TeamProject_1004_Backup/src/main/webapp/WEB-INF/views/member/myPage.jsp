<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="com.dto.MemberDTO"%>
 
 <% MemberDTO dto = (MemberDTO)session.getAttribute("login"); 
 int member_num = dto.getMember_num();
 String member_name = dto.getMember_name();
 String div_name = dto.getDiv_name();
 String rank = dto.getRank();
 String address = dto.getAddress();
 String phone = dto.getPhone();
 String mail = dto.getMail();
 String hire_date = dto.getHire_date();
 String retire_date = dto.getRetire_date();
 String ssn = dto.getSsn();
 String password = dto.getPassword();
 String gender = dto.getGender();
 String photo =dto.getPhoto();
 int annual_leave = dto.getAnnual_leave();
%>     
<meta charset="UTF-8">
<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="resources/css/main_style.css">
	<link rel="stylesheet" type="text/css" href="resources/css/mypage-Style.css">
	<link href="resources/css/pwchange.css" rel="stylesheet">
 <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
 <script type="text/javascript">

	$(function() {
		
		$(".close").click(function(){
			$("#pwchange").fadeOut(); /*클릭시, 모달창이 꺼짐*/
	    });//모달창위에 x
		
		
		$("#pw_change").click(function() {
	 		$("#pwchange").fadeIn(); /*클릭시, 모달창이 나옴*/
		});//클릭시 모달시작
	
		$("#pwd0").on("keyup",function(event){	//현재 비밀번호일치하는지 비동기로확인.
			 $.ajax({
					type : "GET",
					url : "/pwCheck",
					dataType : "text",
					data : {
						passwd : $("#pwd0").val()
					},
					success : function(responseData, status, xhr) {
					    $("#result").text(responseData);
					},
					error : function(xhr, status, error) {
						console.log("error");
					}
			});
		});
	   
		// "비밀번호 변경" 버튼 클릭 시 모달 창 닫기
	    $(".btn_btn-warning").close(function() {
	        $("#pwchange").fadeOut(); // 클릭 시 모달 창 숨김
	    });

	});//비밀번호 변경  모달끝

 </script>

<!-- 마이페이지 시작 -->
<h3>나의 정보</h3>
<form action="MemberUpdateServlet" method="post">
	<div class="mypage-section">
		<div class="mypage-image">
			<img src="resources/memberphoto/<%=dto.getMember_num()%>.png"
				width="300" height="300"><br> <br> 
				<a class="profile_pic" id="profile_pic">프로필사진변경</a><br> 
				<a class="pw_change" id="pw_change">비밀번호변경</a>
		</div>
		<div class="mypage-profile">

			<div class="horizontal-container">
				<h2 class="member-name"><%=dto.getMember_name()%></h2>
				&nbsp; <span class="rank"><%=dto.getRank()%></span>
			</div>
			<input type="hidden" value="<%=member_num%>" name="userid">
			사번&nbsp;&nbsp;<%=dto.getMember_num()%><br> 
			소속부서&nbsp;&nbsp;<%=dto.getDiv_name()%><br>
			주소&nbsp;&nbsp;<%=dto.getAddress()%><br> 
			휴대폰번호<input type="text" value="<%=phone%>" name="phone" id="phone"><br>
			메일주소<input	type="text" value="<%=mail%>" name="email" id="email"><br>
			입사일&nbsp;&nbsp;<%=dto.getHire_date()%><br> 잔여연차<%=dto.getAnnual_leave()%><br>
			<br> 
			<input type="submit" value="수정">
			<input type="reset" value="취소">
		</div>
	</div>
</form>


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
                     <td><input type="password" name="userPwd" id="pwd0"  required>
                     <span id="result"></span></td>
                  </tr>
                  <tr>
                     <td>변경할 비밀번호</td>
                     <td><input type="password" name="updatePwd" id="pwd1" required></td>
                  </tr>
                  <tr>
                     <td>변경할 비밀번호 확인</td>
                     <td><input type="password" name="checkPwd" id="pwd2" required>
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
<!-- 끝 -->


