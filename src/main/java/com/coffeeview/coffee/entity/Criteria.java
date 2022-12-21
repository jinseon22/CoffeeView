package com.coffeeview.coffee.entity;

public class Criteria {

    private int pageNum; // 현재 페이지
    private int amount; // 한 페이지 당 상품 개수
    private int skip; // 스킵 할 게시물 수: (pageNum-1)*amount

    // 기본 세팅: 1페이지 시작, 16개
    public Criteria() {
        this(1, 16);
        this.skip = 0;
    }

    public Criteria(int pageNum, int amount) {
        this.pageNum = pageNum;
        this.amount = amount;
        this.skip = (pageNum - 1) * amount;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
        this.skip = (pageNum - 1) * this.amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
        this.skip = (this.pageNum - 1) * amount;
    }

    public int getSkip() {
        return skip;
    }

    public void setSkip(int skip) {
        this.skip = skip;
    }

    @Override
    public String toString() {
        return "Criteria [pageNum=" + pageNum + ", amount=" + amount + ", skip=" + skip
                + "]";
    }

}
