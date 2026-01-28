package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public sealed class Person1 permits Employee, Manager{
    //필드
    private String name; // setName, getName 생성

    //메소드
    public void work() {
        System.out.println("하는 일이 결정되지 않았습니다.");
    }

}
