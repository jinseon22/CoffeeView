package com.coffeeview.coffee.entity;

public class Coffee {

    private int id;
    private String name_kr;
    private String name_eng;
    private int category1;
    private int category2;
    private int brand;
    private double score_avg;
    private String description;
    private String thumbnail;

    public Coffee() {
    }

    public Coffee(int id, String name_kr, String name_eng, int category1, int category2,
            int brand, double score_avg, String description, String thumbnail) {
        super();
        this.id = id;
        this.name_kr = name_kr;
        this.name_eng = name_eng;
        this.category1 = category1;
        this.category2 = category2;
        this.brand = brand;
        this.score_avg = score_avg;
        this.description = description;
        this.thumbnail = thumbnail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName_kr() {
        return name_kr;
    }

    public void setName_kr(String name_kr) {
        this.name_kr = name_kr;
    }

    public String getName_eng() {
        return name_eng;
    }

    public void setName_eng(String name_eng) {
        this.name_eng = name_eng;
    }

    public int getCategory1() {
        return category1;
    }

    public void setCategory1(int category1) {
        this.category1 = category1;
    }

    public int getCategory2() {
        return category2;
    }

    public void setCategory2(int category2) {
        this.category2 = category2;
    }

    public int getBrand() {
        return brand;
    }

    public void setBrand(int brand) {
        this.brand = brand;
    }

    public double getScore_avg() {
        return score_avg;
    }

    public void setScore_avg(double score_avg) {
        this.score_avg = score_avg;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    @Override
    public String toString() {
        return "Coffee [id=" + id + ", name_kr=" + name_kr + ", name_eng=" + name_eng
                + ", category1=" + category1 + ", category2=" + category2 + ", brand="
                + brand + ", score_avg=" + score_avg + ", description=" + description
                + ", thumbnail=" + thumbnail + "]";
    }

}
