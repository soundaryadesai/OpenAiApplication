package com.example.controller;

import com.example.model.Request;
import com.example.service.OpenAIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/chat")
public class OpenAiController {
    @Autowired
    OpenAIService openAIService;

    @PostMapping("/embeddings")
    public String getEmbeddings(@RequestBody Request chatRequest) {
        String text = chatRequest.getPrompt();
        return openAIService.getEmbeddingsFromOpenAI(text);
    }

    @PostMapping("/gpt")
    public String chatWithGPT(@RequestBody Request chatRequest) {
        String prompt = chatRequest.getPrompt();
        return openAIService.chatGPT(prompt);
    }


}
