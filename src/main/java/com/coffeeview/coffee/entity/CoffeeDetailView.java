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
    private double rate;
    private String description;
    private String thumbnail;
    private String brand_kr;
    private String brand_eng;

    public CoffeeDetailView() {
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

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
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
                + ", is_decaf=" + is_decaf + ", rate=" + rate + ", description="
                + description + ", thumbnail=" + thumbnail + ", brand_kr=" + brand_kr
                + ", brand_eng=" + brand_eng + "]";
    }

}
