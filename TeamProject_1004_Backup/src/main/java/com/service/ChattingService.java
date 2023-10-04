package com.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ChattingDAO;
import com.dto.MemberDTO;
@Service("ChattingService")
public class ChattingService {
	
	@Autowired
	ChattingDAO dao;
	
	public ChattingService() {
		dao = new ChattingDAO();
	}

	public List<MemberDTO> searchValue(Map<String, String> map) {
		List<MemberDTO> list = dao.searchValue(map);
		return list;
	}

}
