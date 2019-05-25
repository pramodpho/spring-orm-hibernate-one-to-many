package com.ngn.project.attendance.dto;

/**
 * ====================================================================
 * Created by DELL on 11/05/2019.
 * Description:
 * ====================================================================
 * Modified by:
 * Modified date:
 * Purpose:
 * ====================================================================
 */
public class UserDTO {
    private Integer userid;
    private String username;
    private String password;
    private Integer status;

    public UserDTO() {
    }

    public UserDTO(Integer userId, String username, String password, Integer status) {
        this.userid = userId;
        this.username = username;
        this.password = password;
        this.status = status;
    }

    public Integer getUserId() {
        return userid;
    }

    public void setUserId(Integer userId) {
        this.userid = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
