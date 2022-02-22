package ru.paraktikumbot.bot.main.common.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Message {

    @JsonProperty(value = "message_id")
    private Integer messageId;

    @JsonProperty(value = "text")
    private String text;

    @JsonProperty(value = "chat")
    private Chat chat;

    public Integer getMessageId() {
        return messageId;
    }

    public String getText() {
        return text;
    }

    public Chat getChat() {
        return chat;
    }
}