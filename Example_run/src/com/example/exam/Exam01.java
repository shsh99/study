package com.example.exam;

public class Exam01 {
    private int price;
    private String name;

    public Exam01(int price, String name) {
        this.price = price;
        this.name = name;
    }
    // 생성할 때 값을 넣어주고 값을 바꿀수 없으면 불변 클래스

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}

