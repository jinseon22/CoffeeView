package com.coffeeview.review.entity;

import java.util.Date;

public class Review {

    private int id;
    private int coffee_id;
    private int user_id;
    private String content;
    private int score;
    private int recommendation;
    private Date regdate;
    private Date updatedate;
    private String filename_origin;
    private String filename_stored;

    public Review() {
    }

    public Review(int id, int coffee_id, int user_id, String content, int score,
            int recommendation, Date regdate, Date updatedate, String filename_origin,
            String filename_stored) {
        super();
        this.id = id;
        this.coffee_id = coffee_id;
        this.user_id = user_id;
        this.content = content;
        this.score = score;
        this.recommendation = recommendation;
        this.regdate = regdate;
        this.updatedate = updatedate;
        this.filename_origin = filename_origin;
        this.filename_stored = filename_stored;
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

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
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

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    public String getFilename_origin() {
        return filename_origin;
    }

    public void setFilename_origin(String filename_origin) {
        this.filename_origin = filename_origin;
    }

    public String getFilename_stored() {
        return filename_stored;
    }

    public void setFilename_stored(String filename_stored) {
        this.filename_stored = filename_stored;
    }

    @Override
    public String toString() {
        return "Review [id=" + id + ", coffee_id=" + coffee_id + ", user_id=" + user_id
                + ", content=" + content + ", score=" + score + ", recommendation="
                + recommendation + ", regdate=" + regdate + ", updatedate=" + updatedate
                + ", filename_origin=" + filename_origin + ", filename_stored="
                + filename_stored + "]";
    }

}
