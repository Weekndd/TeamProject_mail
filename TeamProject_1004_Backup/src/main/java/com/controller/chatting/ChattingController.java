package com.controller.chatting;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dto.MemberDTO;
import com.service.ChattingService;
import com.service.MemberService;

@Controller
public class ChattingController {
	@Autowired
	MemberService service;
	@Autowired
	ChattingService chatService;
	
//	@RequestMapping("/chatting")
//	public String chatting(HttpSession session) {
//		List<MemberDTO> memberList = service.selectAllMemberList();
//		session.setAttribute("memberList", memberList);
//		return "chatting";
//	}
//
//	
//	@RequestMapping(value = "/searchValue", method = RequestMethod.POST)
//	@ResponseBody
//	public List<MemberDTO> searchValue(@RequestBody Map<String, String> map, HttpSession session) {
//		
//		List<MemberDTO> selectedList = chatService.searchValue(map);
//		return selectedList;
//	}
	@RequestMapping("chattingRoom")
	public String chattingRoom() {
		System.out.println("채팅방  열림");
		return "chattingRoom";
	}
	
//	@RequestMapping("/chatting")
//	public void chatting(Model model, HttpSession session) {
//		MemberDTO memberDTO = (MemberDTO)session.getAttribute("login");
//		
//	}
	
	
	
	
	
	
	
	
	
	
	
}
