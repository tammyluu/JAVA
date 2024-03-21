package org.example.springsecuritytodolist.dto;

public class BaseResponseDto {
    private Object message;
    private Object data;
    private Object userId;

    public BaseResponseDto(Object message, Object data, Object userId) {
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

    public Object getUserId() {
        return userId;
    }

    public void setUserId(Object userId) {
        this.userId = userId;
    }
}
