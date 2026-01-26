package org.example;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("포르쉐");
        Car yourCar = new Car("벤츠");//
        myCar.run();
        yourCar.run();//

        double result1 = 10 * 10 * Calculator.pi;
        int result2 = Calculator.plus(10, 5);
        int result3 = Calculator.minus(10, 5);

        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
        System.out.println("result3: " + result3);

        System.out.println(Television.info);

        Car2 myCar1 = new Car2();
        myCar1.speed = 200;
        myCar1.run();

        myCar1.speed = 60;
        myCar1.run();

        Korean k1 = new Korean("123456-1234567", "김자바");

        System.out.println(k1.nation);
        System.out.println(k1.ssn);
        System.out.println(k1.name);

        k1.name = "김자바";

        System.out.println("지구 반지름: " + Earth.EARTH_RADIUS + "km");
        System.out.println("지구의 표면적: " + Earth.EARTH_SURFACE_AREA + "km^2");

        Car3 myCar2 = new Car3();

        myCar2.setSpeed(-50);
        System.out.println("현재 속도: " + myCar2.getSpeed());

        myCar2.setSpeed(60);
        System.out.println("현재 속도: " + myCar2.getSpeed());

        if(!myCar2.isStop()) {
            myCar2.setStop(true);
        }
        System.out.println("현재 속도: " + myCar2.getSpeed());

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if(obj1 == obj2) {
            System.out.println("같은 Singleton 객체입니다.");
        } else {
            System.out.println("다른 Singleton 객체입니다.");
        }


    }
}
