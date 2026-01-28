package org.example;

public class Phone1 {
    //필드 선언
    private String owner;

    //생성자 선언
    Phone1(String owner) {
        this.owner = owner;
    }

    //메소드 선언
    void turnOn() {
        System.out.println("폰 전원을 켭니다.");
    }
    void turnOff() {
        System.out.println("폰 전원을 끕니다.");
    }

}
