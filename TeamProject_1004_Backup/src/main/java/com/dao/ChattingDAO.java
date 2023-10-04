package com.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dto.MemberDTO;
@Repository("ChattingDAO")
public class ChattingDAO {
	
	@Autowired
	SqlSessionTemplate session;

	public List<MemberDTO> searchValue(Map<String, String> map) {
		List<MemberDTO> list = session.selectList("searchValue", map);
		return list;
	}
	
}
