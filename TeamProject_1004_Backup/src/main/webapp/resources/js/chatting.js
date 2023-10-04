$(document).ready(function() {
	const checkboxes = $('input[name="memberCheckbox"]');
    const output = $('#selected');
	//채팅방 생성시 사용자 초대 뜨도록
    $("#create").click(function() {
        $(".invite").css("display", "flex");
    });

    // 체크박스
    $(".memberList").on("change", 'input[name="memberCheckbox"]', function() {
		var selectedValue = $(this).val();
		const checkedCheckboxes = checkboxes.filter(':checked');
		const checkedValues = checkedCheckboxes.map(function () {
	          return $(this).val();
	        }).get();
        
        // 체크박스가 선택된 경우
        if ($(this).is(':checked')) {
            // 값을 .selected 요소에 추가
            $('#selected').append("<p><span>"+selectedValue +"</span></p>");
        } else {
            // 값을 .selected 요소에서 제거
            $('#selected').find('p:contains("' + selectedValue + '")').remove();
        }
        
     
        // 출력된 값이 6개를 초과하면 스크롤 생성
        if (checkedValues.length > 6) {
          output.css('overflow-y', 'scroll');
        } else {
          output.css('overflow-y', 'auto');
        }
     });
    	
    	//사용자 초대 - 조건 검색
    	$(".searchValue").click(function(){
    		$(this).val('');
    	});
    	
    	$(".searchValue").keyup(function(e){
	    	var searchCondition = $(".searchCondition").val();
	    	var searchValue = $(".searchValue").val();
	    	if(e.keyCode==13){
	    		$("#selected").empty();
	    		$.ajax({
	                type: "post",
	                url: "searchValue",
	                data: JSON.stringify({ "searchCondition": searchCondition, "searchValue": searchValue }),
	                contentType: "application/json; charset=utf-8",
	                success: function(data, status, xhr) {
	                	var $ul = $("<ul></ul>");
	                    $.each(data, function(index, member) {
	                        var $li = $("<li></li>");
	                        $li.html(member.div_name + "&nbsp;" + member.member_name + "&nbsp;" + member.rank);
	                        $li.append('<input type="checkbox" name="memberCheckbox" value="' + member.div_name + "&nbsp;" + member.member_name + "&nbsp;" + member.rank + '">');
	                        $ul.append($li);
	                    });
	                    // 생성한 리스트를 페이지에 추가
	                    $(".memberList").empty().append($ul);	                	
	                }
	            });
	    	}//end keyCode
	    });
    
    	$("#chatTitle").click(function(){
    		$(this).val('');
    	});
    
    	//생성 버튼 클릭시
    	$("#create2").click(function(){
    		var chatTitle = $("#chatTitle").val();
    		if (chatTitle.length==0) {
				alert("한글자 이상 입력해주세요.");
			} else {
				$(".invite").css("display", "none");
				chatTitle.val('');
				
//				$.ajax({
//		            url: '',
//		            method: 'post',
//		            data: { title: chatTitle },
//		            success: function (response) {
//		                console.log("AJAX 요청 성공:", response);
//		            },
//		            error: function (error) {
//		                console.error("AJAX 요청 실패:", error);
//		            }
//		        });
			}//end if
    		
    	});

});//end document