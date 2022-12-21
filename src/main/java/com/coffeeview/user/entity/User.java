package com.coffeeview.user.entity;

import java.util.Date;

public class User {

    private int id;
    private String email;
    private String password;
    private String nickname;
    private int grade;
    private Date create_time;
    private boolean is_admin;

    public User() {
    }

    public User(int id, String email, String password, String nickname, int grade,
            Date create_time, boolean is_admin) {
        super();
        this.id = id;
        this.email = email;
        this.password = password;
        this.nickname = nickname;
        this.grade = grade;
        this.create_time = create_time;
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

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
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
                + ", nickname=" + nickname + ", grade=" + grade + ", create_time="
                + create_time + ", is_admin=" + is_admin + "]";
    }

}
