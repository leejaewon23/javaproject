package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class SmartPhone1 extends Phone1{
    //생성자 선언
    SmartPhone1(String owner) {
        super(owner);
    }

    //메소드 선언
    void internetSearch() {
        System.out.println("인터넷 검색을 합니다.");
    }

}
