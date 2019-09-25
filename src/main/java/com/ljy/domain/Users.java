package com.ljy.domain;

/**
 * @author lijingyu
 * @date 2019/9/23 12:36
 */
public class Users {

    private int id;
    private String username;
    private String password;
    private String status;
    private String phone;
    private String email;
    private Integer sign;



    public Users() {

    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", status='" + status + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getSign() {
        return sign;
    }

    public void setSign(Integer sign) {
        this.sign = sign;
    }

    public Users(int id, String username, String password, String status, String phone, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.status = status;
        this.phone = phone;
        this.email = email;
    }

}
