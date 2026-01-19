package org.example;

public class Problems {
    public void Pro1() {
        int x = 10;
        int y = 20;
        int z = (++x) + (y--);
        System.out.println("\n");
        System.out.println(z);
    }
    public void Pro2() {
        int score = 85;
        String result = (!(score>90)) ? "가" : "나";
        System.out.println(result);
    }
    public void Pro3() {
        int pencils = 534;
        int students = 30;
        int pencilsPerStudent = (pencils / students);
        System.out.println("학생 한 명이 가지는 연필 수: " + pencilsPerStudent);
        int pencilsLeft = (pencils - (students * pencilsPerStudent));
        System.out.println("남은 연필 수: " + pencilsLeft);
    }
    public void Pro4() {
        int value = 356;
        System.out.println((value/100) * 100);
    }
    public void Pro5() {
        int lengthTop = 5;
        int lengthBottom = 10;
        int height = 7;
        double area = ((lengthTop + lengthBottom) * height / 2.0);
        System.out.println(area);
    }
    public void Pro6() {
        int x = 10;
        int y = 5;
        System.out.println( (x>7) && (y<=5) );
        System.out.println( (x%3 == 2) || (y%2 != 1) );
    }
    public void Pro7() {
        double x = 5.0;
        double y = 0.0;
        double z = 5 % y;
        if(Double.isNaN(z)) {
            System.out.println("0.0으로 나눌 수 없습니다.");
        } else {
            double result = z + 10;
            System.out.println("결과: " + result);
        }
    }

}
