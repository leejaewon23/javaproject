package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public non-sealed class  Manager extends Person1 {
    @Override
    public void work() {
        System.out.println("생산 관리를 합니다.");
    }
}
