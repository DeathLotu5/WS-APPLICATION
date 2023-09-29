package com.dcorp.hightech.chat.controllers.request;

import com.dcorp.hightech.chat.controllers.enums.MessageType;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChatMessage {

    String content;
    String sender;
    MessageType type;

}
