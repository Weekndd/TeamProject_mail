package com.dto;

import org.apache.ibatis.type.Alias;

@Alias("ChatContentDTO")
public class ChatContentDTO {
	private int CHAT_CONTENT_NO;
	private int CHATROOM_NUM;
	private String CHAT_CONTENT;
	private int MEMBER_NUM;
	private String CAHT_DATE;
	public ChatContentDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChatContentDTO(int cHAT_CONTENT_NO, int cHATROOM_NUM, String cHAT_CONTENT, int mEMBER_NUM,
			String cAHT_DATE) {
		super();
		CHAT_CONTENT_NO = cHAT_CONTENT_NO;
		CHATROOM_NUM = cHATROOM_NUM;
		CHAT_CONTENT = cHAT_CONTENT;
		MEMBER_NUM = mEMBER_NUM;
		CAHT_DATE = cAHT_DATE;
	}
	public int getCHAT_CONTENT_NO() {
		return CHAT_CONTENT_NO;
	}
	public void setCHAT_CONTENT_NO(int cHAT_CONTENT_NO) {
		CHAT_CONTENT_NO = cHAT_CONTENT_NO;
	}
	public int getCHATROOM_NUM() {
		return CHATROOM_NUM;
	}
	public void setCHATROOM_NUM(int cHATROOM_NUM) {
		CHATROOM_NUM = cHATROOM_NUM;
	}
	public String getCHAT_CONTENT() {
		return CHAT_CONTENT;
	}
	public void setCHAT_CONTENT(String cHAT_CONTENT) {
		CHAT_CONTENT = cHAT_CONTENT;
	}
	public int getMEMBER_NUM() {
		return MEMBER_NUM;
	}
	public void setMEMBER_NUM(int mEMBER_NUM) {
		MEMBER_NUM = mEMBER_NUM;
	}
	public String getCAHT_DATE() {
		return CAHT_DATE;
	}
	public void setCAHT_DATE(String cAHT_DATE) {
		CAHT_DATE = cAHT_DATE;
	}
	
	
}
