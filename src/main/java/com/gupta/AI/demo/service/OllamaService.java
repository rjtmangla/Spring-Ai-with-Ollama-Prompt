package com.gupta.AI.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class OllamaService {

    private static final Logger logger = LoggerFactory.getLogger(OllamaService.class);
    private ChatClient chatClient;

    public OllamaService(ChatClient.Builder builder) {
        this.chatClient = builder.build();
    }

    public String askQuestion(String question) {
        long startTime = System.currentTimeMillis();
        String response = chatClient.prompt(question).call().content();
        logger.info("Found response for prompt. question={}, answer={}, timeTakenToComplete={}",
                question, response, (System.currentTimeMillis() - startTime));
        return response;
    }

}
