package org.example.springsecuritytodolist.dto;

import java.util.Map;

public class BaseResponseDto {
    private Object message;
    private Object data;
    private Long userId;

    public BaseResponseDto(Object message, Object data, Long userId) {
        this.message = message;
        this.data = data;
        this.userId = userId;
    }

    public BaseResponseDto(Object message) {
        this.message = message;
    }




    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
