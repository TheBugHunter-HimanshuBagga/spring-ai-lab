package com.springAi.HimanshuBagga.SpringAI.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class chatController {
/*
                WITH OPEN_ai_API_KEY
    private ChatClient chatClient; // all the functions that needs to connected to thee openAi

    public chatController(ChatClient.Builder builder){
        this.chatClient = builder.build();
    }

    @GetMapping("/chat")
    public ResponseEntity<String> chat(@RequestParam(value = "q" , required = true) String q){ // q is the question asked by the user
        var resultResponse = chatClient.prompt(q).call().content();
        return ResponseEntity.ok(resultResponse);
    }
*/

    private ChatClient chatClient;

    public chatController(ChatClient.Builder builder){
        this.chatClient=builder.build();
    }
    @GetMapping("/chat")
    public ResponseEntity<String> chat(@RequestParam(value = "q") String query){
        String content = chatClient.prompt(query).call().content();
        return ResponseEntity.ok(content);
    }


}
