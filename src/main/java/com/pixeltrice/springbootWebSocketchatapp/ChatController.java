package com.pixeltrice.springbootWebSocketchatapp;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @MessageMapping("/chat.sendMessage/{idProposta}")
    @SendTo("/topic/public/{idProposta}")
    public ChatMessagePojo sendMessage(@Payload ChatMessagePojo chatMessagePojo) {
        return chatMessagePojo;
    }

    @MessageMapping("/chat.addUser/{idProposta}")
    @SendTo("/topic/public/{idProposta}")
    public ChatMessagePojo addUser(@Payload ChatMessagePojo chatMessagePojo, 
                               SimpMessageHeaderAccessor headerAccessor) {
        // Add username in web socket session
        headerAccessor.getSessionAttributes().put("username", chatMessagePojo.getUsername());
        headerAccessor.getSessionAttributes().put("idProposta", chatMessagePojo.getIdProposta());
        return chatMessagePojo;
    }

}