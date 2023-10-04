package com.dto;

import org.apache.ibatis.type.Alias;

@Alias("ChatRoomDTO")
public class ChatRoomDTO {
	private int CHATROOM_NUM;
	private String CHATROOM_TITLE;
	private int CHATROOM_TYPE;
	
	public ChatRoomDTO() {
		super();
	}

	public ChatRoomDTO(int cHATROOM_NUM, String cHATROOM_TITLE, int cHATROOM_TYPE) {
		super();
		CHATROOM_NUM = cHATROOM_NUM;
		CHATROOM_TITLE = cHATROOM_TITLE;
		CHATROOM_TYPE = cHATROOM_TYPE;
	}

	public int getCHATROOM_NUM() {
		return CHATROOM_NUM;
	}

	public void setCHATROOM_NUM(int cHATROOM_NUM) {
		CHATROOM_NUM = cHATROOM_NUM;
	}

	public String getCHATROOM_TITLE() {
		return CHATROOM_TITLE;
	}

	public void setCHATROOM_TITLE(String cHATROOM_TITLE) {
		CHATROOM_TITLE = cHATROOM_TITLE;
	}

	public int getCHATROOM_TYPE() {
		return CHATROOM_TYPE;
	}

	public void setCHATROOM_TYPE(int cHATROOM_TYPE) {
		CHATROOM_TYPE = cHATROOM_TYPE;
	}
	
	
}
