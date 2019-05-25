package com.ngn.project.attendance.lib;

/**
 * ====================================================================
 * Created by DELL on 15/05/2019.
 * Description:
 * ====================================================================
 * Modified by:
 * Modified date:
 * Purpose:
 * ====================================================================
 */
public class ResponseMessage {
    private Integer status;
    private String message;
    private Object dto;

    public ResponseMessage() {
    }

    public ResponseMessage(Integer status, String message, Object dto) {
        this.status = status;
        this.message = message;
        this.dto = dto;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getDto() {
        return dto;
    }

    public void setDto(Object dto) {
        this.dto = dto;
    }
}
