package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public abstract class Animal {
    private String name;
    private int age;

    public void breathe() {
        System.out.println("숨을 쉽니다.");
    }

    //추상 메소드 선언
    public abstract void sound();
}
