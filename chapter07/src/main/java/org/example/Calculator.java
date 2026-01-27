package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Calculator {
    public double areaCircle(double r) {
        System.out.println("Calculator 객체의 areaCircle() 실행");
        return 3.141599 * r * r;
    }
}
