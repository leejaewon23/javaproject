package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Parent {
    //메소드 선언
    public void method1 () {
        System.out.println("Parent-method1()");
    }

    //메소드 선언
    public void method2 () {
        System.out.println("Parent-method2()");
    }
}
