package org.example;

public class Tiger extends Animal1{
    @Override
    public Object eat(Animal1 obj) {
        System.out.println("Tiger 는 Rabbit만 먹는다.");
        return  null;
    }
    @Override
    public void breathe() {
        System.out.println("Tiger가 숨을 쉽니다.");
    }
}
