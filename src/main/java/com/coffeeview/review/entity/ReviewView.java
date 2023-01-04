package com.coffeeview.review.entity;

import java.util.Date;

public class ReviewView {

    // review
    private int id;
    private int coffee_id;
    private String content;
    private int score;
    private int recommendation;
    private Date regdate;
    private String filename_stored;
    // user
    private int user_id;
    private String nickname;
    private String grade;

    public ReviewView() {
    }

    public ReviewView(int id, int coffee_id, String content, int score,
            int recommendation, Date regdate, String filename_stored, int user_id,
            String nickname, String grade) {
        super();
        this.id = id;
        this.coffee_id = coffee_id;
        this.content = content;
        this.score = score;
        this.recommendation = recommendation;
        this.regdate = regdate;
        this.filename_stored = filename_stored;
        this.user_id = user_id;
        this.nickname = nickname;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCoffee_id() {
        return coffee_id;
    }

    public void setCoffee_id(int coffee_id) {
        this.coffee_id = coffee_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(int recommendation) {
        this.recommendation = recommendation;
    }

    public Date getRegdate() {
        return regdate;
    }

    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }

    public String getFilename_stored() {
        return filename_stored;
    }

    public void setFilename_stored(String filename_stored) {
        this.filename_stored = filename_stored;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "CoffeeReviewView [id=" + id + ", coffee_id=" + coffee_id + ", content="
                + content + ", score=" + score + ", recommendation=" + recommendation
                + ", regdate=" + regdate + ", filename_stored=" + filename_stored
                + ", user_id=" + user_id + ", nickname=" + nickname + ", grade=" + grade
                + "]";
    }

}
