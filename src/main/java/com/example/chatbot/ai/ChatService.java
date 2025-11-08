package com.example.chatbot.ai;




import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.stereotype.Service;

@Service
public class ChatService {

    private final OllamaChatModel chatModel;

    public ChatService(OllamaChatModel chatModel) {
        this.chatModel = chatModel;
    }

    public String getResponse(String userMessage) {
        ChatResponse response = chatModel.call(new Prompt(userMessage));
        return response.getResult().getOutput().getText();
    }
}


