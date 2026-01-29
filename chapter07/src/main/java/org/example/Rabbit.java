package org.example;

public class Rabbit extends Animal1{

    @Override
    public Object eat(Animal1 obj) {
        System.out.println("Rabbit은 Swam만 먹는다.");
        return null;
    }
    @Override
    public void breathe() {
        System.out.println("Rabbit이 숨을 쉽니다.");

    }
}
