package com.ThinkOn.ThinkOnAssesment.response;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse {
    private String message;
    private Object data;

    public ApiResponse(String message, Object data) {
        this.message = message;
        this.data = data; 
    }

    public String getMessage() {
        return message;
    }

    public Object getData() {
        return data;
    }
}
