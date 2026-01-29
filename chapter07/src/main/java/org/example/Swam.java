package org.example;

public class Swam extends Animal1{
    @Override
    public Object eat(Animal1 obj) {
        System.out.println("Swam은 Animal을 먹지 못한다.");
        return  null;

    }

    @Override
    public void breathe() {
        System.out.println("Swam이 숨을 쉽니다.");
    }

}
