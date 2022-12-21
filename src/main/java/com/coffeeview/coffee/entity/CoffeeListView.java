package com.coffeeview.coffee.entity;

public class CoffeeListView {
    private int id;
    private double rate;
    private String name;
    private String thumbnail;
    private String brand_kr;
    private String brand_eng;

    public CoffeeListView() {
    }

    public CoffeeListView(int id, double rate, String name, String thumbnail,
            String brand_kr, String brand_eng) {
        super();
        this.id = id;
        this.rate = rate;
        this.name = name;
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

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return "CoffeeListView [id=" + id + ", rate=" + rate + ", name=" + name
                + ", thumbnail=" + thumbnail + ", brand_kr=" + brand_kr + ", brand_eng="
                + brand_eng + "]";
    }

}
