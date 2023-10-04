package com.dto;

import org.apache.ibatis.type.Alias;

@Alias("ChatMemberDTO")
public class ChatMemberDTO {
	private int CHATROOM_NUM;
	private int MEMBER_NUM;
	private String DIV_NAME;
	private String MEMBER_NAME;
	private String RANK;
	private String MEMBER_STATUS;
	
	public ChatMemberDTO() {
		super();
	}

	public ChatMemberDTO(int cHATROOM_NUM, int mEMBER_NUM, String dIV_NAME, String mEMBER_NAME, String rANK,
			String mEMBER_STATUS) {
		super();
		CHATROOM_NUM = cHATROOM_NUM;
		MEMBER_NUM = mEMBER_NUM;
		DIV_NAME = dIV_NAME;
		MEMBER_NAME = mEMBER_NAME;
		RANK = rANK;
		MEMBER_STATUS = mEMBER_STATUS;
	}

	public int getCHATROOM_NUM() {
		return CHATROOM_NUM;
	}

	public void setCHATROOM_NUM(int cHATROOM_NUM) {
		CHATROOM_NUM = cHATROOM_NUM;
	}

	public int getMEMBER_NUM() {
		return MEMBER_NUM;
	}

	public void setMEMBER_NUM(int mEMBER_NUM) {
		MEMBER_NUM = mEMBER_NUM;
	}

	public String getDIV_NAME() {
		return DIV_NAME;
	}

	public void setDIV_NAME(String dIV_NAME) {
		DIV_NAME = dIV_NAME;
	}

	public String getMEMBER_NAME() {
		return MEMBER_NAME;
	}

	public void setMEMBER_NAME(String mEMBER_NAME) {
		MEMBER_NAME = mEMBER_NAME;
	}

	public String getRANK() {
		return RANK;
	}

	public void setRANK(String rANK) {
		RANK = rANK;
	}

	public String getMEMBER_STATUS() {
		return MEMBER_STATUS;
	}

	public void setMEMBER_STATUS(String mEMBER_STATUS) {
		MEMBER_STATUS = mEMBER_STATUS;
	}
	
	
}
