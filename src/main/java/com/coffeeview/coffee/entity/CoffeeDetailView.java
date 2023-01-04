package com.coffeeview.coffee.entity;

public class CoffeeDetailView {

    private int id;
    private String name_kr;
    private String name_eng;
    private String category1;
    private String category2;
    private String category3;
    private boolean is_coldbrew;
    private boolean is_decaf;
    private double score_avg;
    private String description;
    private String thumbnail;
    private String brand_kr;
    private String brand_eng;

    public CoffeeDetailView() {
    }

    public CoffeeDetailView(int id, String name_kr, String name_eng, String category1,
            String category2, String category3, boolean is_coldbrew, boolean is_decaf,
            double score_avg, String description, String thumbnail, String brand_kr,
            String brand_eng) {
        super();
        this.id = id;
        this.name_kr = name_kr;
        this.name_eng = name_eng;
        this.category1 = category1;
        this.category2 = category2;
        this.category3 = category3;
        this.is_coldbrew = is_coldbrew;
        this.is_decaf = is_decaf;
        this.score_avg = score_avg;
        this.description = description;
        this.thumbnail = thumbnail;
        this.brand_kr = brand_kr;
        this.brand_eng = brand_eng;
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

    public String getCategory1() {
        return category1;
    }

    public void setCategory1(String category1) {
        this.category1 = category1;
    }

    public String getCategory2() {
        return category2;
    }

    public void setCategory2(String category2) {
        this.category2 = category2;
    }

    public String getCategory3() {
        return category3;
    }

    public void setCategory3(String category3) {
        this.category3 = category3;
    }

    public boolean isIs_coldbrew() {
        return is_coldbrew;
    }

    public void setIs_coldbrew(boolean is_coldbrew) {
        this.is_coldbrew = is_coldbrew;
    }

    public boolean isIs_decaf() {
        return is_decaf;
    }

    public void setIs_decaf(boolean is_decaf) {
        this.is_decaf = is_decaf;
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

    public String getBrand_kr() {
        return brand_kr;
    }

    public void setBrand_kr(String brand_kr) {
        this.brand_kr = brand_kr;
    }

    public String getBrand_eng() {
        return brand_eng;
    }

    public void setBrand_eng(String brand_eng) {
        this.brand_eng = brand_eng;
    }

    @Override
    public String toString() {
        return "CoffeeDetailView [id=" + id + ", name_kr=" + name_kr + ", name_eng="
                + name_eng + ", category1=" + category1 + ", category2=" + category2
                + ", category3=" + category3 + ", is_coldbrew=" + is_coldbrew
                + ", is_decaf=" + is_decaf + ", score_avg=" + score_avg + ", description="
                + description + ", thumbnail=" + thumbnail + ", brand_kr=" + brand_kr
                + ", brand_eng=" + brand_eng + "]";
    }

}
