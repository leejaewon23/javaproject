package org.example;

public class Car2 {
    int speed;

    void run() {
        System.out.println(speed + "으로 달립니다.");
    }

    static void simulate() {
        Car2 myCar1 = new Car2();
        myCar1.run();
    }

    public static void main(String[] args) {

        simulate();

        Car2 myCar1 = new Car2();
        myCar1.speed = 60;

    }
}
