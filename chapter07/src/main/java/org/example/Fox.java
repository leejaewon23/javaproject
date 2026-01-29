package org.example;

public class Fox extends Animal1{
    @Override
    public Object eat(Animal1 obj) {
        System.out.println("Fox는 Swam, Rabit만 먹는다.");
        return  null;

    }
    @Override
    public void breathe() {
        System.out.println("Fox가 숨을 쉽니다.");
    }
}
