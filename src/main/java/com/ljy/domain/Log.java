package com.ljy.domain;

import java.util.Date;

/**
 * @author lijingyu
 * @date 2019/9/23 12:41
 */
public class Log {
    private String username;
    private Date createdate;
    private String operation;
    private Integer phone;

    public Log(String username, Date createdate, String operation, Integer phone) {
        this.username = username;
        this.createdate = createdate;
        this.operation = operation;
        this.phone = phone;
    }

    public Log() {
    }

    @Override
    public String toString() {
        return "Log{" +
                "username='" + username + '\'' +
                ", createdate=" + createdate +
                ", operation='" + operation + '\'' +
                ", phone=" + phone +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }
}
