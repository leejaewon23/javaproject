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

        //추상 클래스
        SmartPhone1 smartphone1 = new SmartPhone1("홍길동");

        smartphone1.turnOn();
        smartphone1.internetSearch();
        smartphone1.turnOff();

        Car myCar = new Car();

        myCar.setTire(new Tire());
        myCar.run();

        myCar.setTire(new HankookTire());
        myCar.run();

        myCar.setTire(new KumhoTire());
        myCar.run();

        //Driver 객체 생성
        Driver driver = new Driver();

        //매개값으로 Bus 객체를 제공하고 driver() 메소드 호출
        Bus bus = new Bus();
        driver.drive(bus);

        //매개값으로 Taxi 객체를 제공하고 driver() 메소드 호출
        Taxi taxi = new Taxi();
        driver.drive(taxi);

        Person p1 = new Person("홍길동");
        personInfo(p1);

        System.out.println();

        Person p2 = new Student1("김길동", 10);
        personInfo(p2);

        System.out.println("-------------------------------");

        Dog dog = new Dog();
        dog.setName("누릉이");
        dog.setAge(5);

        Cat cat = new Cat();
        cat.setName("나비");
        cat.setAge(7);

        dog.breathe();
        dog.sound();

        cat.breathe();
        cat.sound();

        System.out.println("\n확인: " + dog.getName() + "는 " + dog.getAge() + "살입니다.");


        //매개변수의 다형성
        animalSound(new Dog());
        animalSound(new Cat());

        System.out.println("-------------------------------");

        Person1 p = new Person1();
        Employee e = new Employee();
        Manager m = new Manager();
        Director d = new Director();

        p.work();
        e.work();
        m.work();
        d.work();

    }
    public static void animalSound(Animal animal) {
        animal.sound();
    }
    public static void personInfo(Person person) {
        System.out.println("name: " + person.getName());
        person.walk();

        if (person instanceof Student1 student) {
            System.out.println("studentNo: " + student.getStudentNo());
            student.study();

        }
    }


    }
