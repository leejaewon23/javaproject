package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {
    // 필드 선언
    private String model;
    private int speed;

    // 생성자 선언
    public Car(String model) {
        this.model = model;
    }

    // 메소드 선언
    public void run() {
        this.speed = 100; // 시속을 100으로 설정
        System.out.println(this.model + "가 달립니다. (시속:" + this.speed + "km/h)");
    }
}