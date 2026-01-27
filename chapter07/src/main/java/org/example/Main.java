package org.example;

public class Main {
    public static void main(String[] args) {

        SmartPhone myPhone = new SmartPhone("갤럭시", "은색");

        System.out.println("모델: " + myPhone.model);
        System.out.println("색상: " + myPhone.color);

        System.out.println("와이파이 상태: " + myPhone.wifi);

        myPhone.bell();
        myPhone.sendVoice("여보세요.");
        myPhone.receiveVoice("안녕하세요! 저는 홍길동인데요.");
        myPhone.sendVoice("아~ 네, 반갑습니다.");
        myPhone.hangUp();

        myPhone.Wifi();
        myPhone.internet();

        int r = 10;
        Calculator calculator = new Calculator();
        System.out.println("원 면적: " + calculator.areaCircle(r));
        System.out.println();

        Computer computer = new Computer();
        System.out.println("원 면적: " + computer.areaCircle(r));

        SupersonicAirplane sa = new SupersonicAirplane();
        sa.takeOff();
        sa.fly();
        sa.setFlyMode(2);
        sa.fly();
        sa.land();

        //자식 객체 생성
        Child child = new Child();

        //자동 타입 변환
        Parent parent = child;

        //메소드 호출
        parent.method1();
        parent.method2();
//      parent.method3(); (호출 불가능)

        }
    }
