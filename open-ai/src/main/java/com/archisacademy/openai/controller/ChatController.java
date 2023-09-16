package com.archisacademy.openai.controller;

import com.archisacademy.openai.service.ChatService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class ChatController {

    private final ChatService chatService;

    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @PostMapping("/prompt")
    public String promptPlace(@RequestBody String prompt){
        return chatService.chatResponse(prompt);
    }

}
