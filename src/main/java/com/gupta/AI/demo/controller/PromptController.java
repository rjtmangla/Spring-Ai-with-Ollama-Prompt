package com.gupta.AI.demo.controller;

import com.gupta.AI.demo.service.OllamaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PromptController {

    @Autowired
    private OllamaService ollamaService;

    @PostMapping("/prompt")
    public String getResponse(@RequestParam("question") String question, Model model) {
        String answer = ollamaService.askQuestion(question);
        model.addAttribute("question", question);
        model.addAttribute("answer", answer);
        return "index";
    }
}
