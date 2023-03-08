package com.sparta.snackback.dm.dto;

import com.sparta.snackback.dm.entity.DMMessage;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DmMessageDto {


        public enum MessageType{
        ENTER,TALK
    }

    private MessageType type;

    private Long dmId;
    private String user;
    private String message;

    public DmMessageDto(DMMessage message) {
//        this.user = message.getDmUser();
//        this.message = message.getDmMessage();
    }
    
}
