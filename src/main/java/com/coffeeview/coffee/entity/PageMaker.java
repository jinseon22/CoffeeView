package com.coffeeview.coffee.entity;

public class PageMaker {

    private int startPage; // 현재 페이지 기준, 페이징의 시작 번호
    private int endPage; // 현재 페이지 기준, 페이징의 마지막 번호
    private boolean prev, next; // 이전&다음 페이지 존재 유무
    private int total; // 전체 커피 개수
    private Criteria cri; // 현재 페이지, 페이지당 커피 개수

    public PageMaker() {
        // TODO Auto-generated constructor stub
    }

    public PageMaker(Criteria cri, int total) {
        this.cri = cri;
        this.total = total;

        this.endPage = (int) (Math.ceil(cri.getPageNum() / 10.0)) * 10; // 10, 20, 30...
        this.startPage = this.endPage - 9; // 1, 11, 21...

        // 실제 마지막 페이지
        // (전체 개수÷한 페이지당 개수) 값을 double로 받기 위해 total에 *1.0
        int realEndPage = (int) (Math.ceil(total * 1.0 / cri.getAmount()));

        // 실제 마지막 페이지가 endPage보다 작은 경우 화면에 보이는 endPage 조정
        if (realEndPage < this.endPage) {
            this.endPage = realEndPage;
        }

        // 시작 페이지가 1보다 크면 true
        this.prev = this.startPage > 1;

        // 실제 마지막 페이지가 endPage보다 크면 true
        this.next = this.endPage < realEndPage;
    }

    public int getStartPage() {
        return startPage;
    }

    public void setStartPage(int startPage) {
        this.startPage = startPage;
    }

    public int getEndPage() {
        return endPage;
    }

    public void setEndPage(int endPage) {
        this.endPage = endPage;
    }

    public boolean isPrev() {
        return prev;
    }

    public void setPrev(boolean prev) {
        this.prev = prev;
    }

    public boolean isNext() {
        return next;
    }

    public void setNext(boolean next) {
        this.next = next;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Criteria getCri() {
        return cri;
    }

    public void setCri(Criteria cri) {
        this.cri = cri;
    }

    @Override
    public String toString() {
        return "PageMaker [startPage=" + startPage + ", endPage=" + endPage + ", prev="
                + prev + ", next=" + next + ", total=" + total + ", cri=" + cri + "]";
    }

}
