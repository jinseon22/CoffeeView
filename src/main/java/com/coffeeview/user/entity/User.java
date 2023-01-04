package com.coffeeview.user.entity;

import java.util.Date;

public class User {

    private int id;
    private String email;
    private String password;
    private String nickname;
    private int grade;
    private Date regdate;
    private boolean is_admin;

    public User() {
    }

    public User(int id, String email, String password, String nickname, int grade,
            Date regdate, boolean is_admin) {
        super();
        this.id = id;
        this.email = email;
        this.password = password;
        this.nickname = nickname;
        this.grade = grade;
        this.regdate = regdate;
        this.is_admin = is_admin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Date getRegdate() {
        return regdate;
    }

    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }

    public boolean isIs_admin() {
        return is_admin;
    }

    public void setIs_admin(boolean is_admin) {
        this.is_admin = is_admin;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", email=" + email + ", password=" + password
                + ", nickname=" + nickname + ", grade=" + grade + ", regdate="
                + regdate + ", is_admin=" + is_admin + "]";
    }

}
