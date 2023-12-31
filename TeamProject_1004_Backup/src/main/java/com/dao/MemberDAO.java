package com.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dto.MemberDTO;

@Repository("MemberDAO")
public class MemberDAO {
	@Autowired
	SqlSessionTemplate session;

	// 로그인
	public MemberDTO login(HashMap<String, String> map) {
		MemberDTO dto = session.selectOne("login", map);
		return dto;	
	}

	// 마이페이지
	public MemberDTO myPage(int member_num) {
		MemberDTO dto = session.selectOne("myPage", member_num);
		return dto;
	}
	
	//주소록에 뿌려줄 모든 멤버 리스트
	public List<MemberDTO> selectAllMemberList() {
		List<MemberDTO> list = session.selectList("selectAllMemberList");
		return list;
	}

	public int pwCheck(String passwd) {
		int count = session.selectOne("MemberMapper.pwCheck", passwd);
		return count;
	}


}
