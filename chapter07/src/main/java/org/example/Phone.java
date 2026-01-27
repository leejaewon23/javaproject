package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Phone {

    public String model;
    public String color;

    public void bell() {
        System.out.println("벨이 울립니다.");
    }

    public void sendVoice(String message) {
        System.out.println("자기: " + message);
    }

    public void receiveVoice(String message) {
        System.out.println("상대방: " + message);
    }

    public void hangUp() {
        System.out.println("전화를 끊습니다.");
    }

    public Phone(String model, String color) {
        this.setModel(model);
        this.setColor(color);
        System.out.println("Phone(String model, String color) 생성자 실행");
    }
}
