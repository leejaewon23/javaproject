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

        // 1. 과목 준비
        Subject java = new Subject("Java 프로그래밍", 3);
        Subject spring = new Subject("Spring Framework", 3);

        // 2. 학생 등록
        Student student = new Student("2022261050", "이재원");

        // 3. 수강 신청
        student.takeCourse(java);
        student.takeCourse(spring);

        // 4. 학기 종료 후 성적 입력 (Setter 활용)
        // 첫 번째 수강 과목(Java)에 A+ 입력
        student.getGrades().get(0).setScore("A+");
        // 두 번째 수강 과목(Spring)에 A0 입력
        student.getGrades().get(1).setScore("A0");

        // 5. 성적표 확인 (Getter 활용)
        student.showReportCard();

        }
    }
