package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dto.MemberDTO;
import com.service.MemberService;

@Controller
public class MemberController {
	@Autowired
	MemberService service;
	
	// 마이페이지
	@RequestMapping("/loginCheck/myPage")
	public String myPage(HttpSession session) {
		MemberDTO dto = (MemberDTO) session.getAttribute("login");
		dto = service.myPage(dto.getMember_num());
		System.out.println("mypage dto >>>>" + dto);
		session.setAttribute("login", dto);
		return "redirect:../myPage"; // servlet-context.xml -> myPage
	}

	
	@RequestMapping("/loginCheck/pwCheck")
    @ResponseBody
    public String memberPwCheck(@RequestParam("passwd") String passwd) {
        System.out.println(passwd); // 현재 패스워드 확인

        int count = service.pwCheck(passwd); //다를경우 비동기로 출력하게 해야하는데.. ㅠㅜ(9/14진행중)
        String mesg = "비밀번호 다름";
        if (count == 1) {
            mesg = "비밀번호 동일";
        }
        return mesg;
	}
	
		
	
	
}//MemberController
