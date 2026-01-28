package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public final class Employee extends Person1 {
    @Override
    public void work() {
        System.out.println("제품을 생산합니다.");
    }
}
