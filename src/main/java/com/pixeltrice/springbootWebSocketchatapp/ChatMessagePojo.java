package com.pixeltrice.springbootWebSocketchatapp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChatMessagePojo {

	 private MessageType type;
	    private String content;
	    private String sender;
	    private Integer idProposta;

	    public enum MessageType {
	        CHAT,
	        JOIN,
	        LEAVE
	    }
	}
