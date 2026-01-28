package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Student1 extends Person{
    //필드 선언
    private int studentNo;

    //생성자 선언
    public Student1(String name, int studentNo) {
        super(name);
        this.studentNo = studentNo;
    }

    //메소드 선언
    public void study() {
        System.out.println("공부를 합니다.");
    }
}
