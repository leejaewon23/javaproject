package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Cat extends Animal {
    //추상 메소드 재정의
    @Override
    public void sound() {
        System.out.println(this.getName() + "가 야옹합니다");
        System.out.println(this.getAge() + "살입니다.");
    }
}
