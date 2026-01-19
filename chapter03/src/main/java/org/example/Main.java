package org.example;

public class Main {
    public static void main(String[] args) {
        Chapter03 c1 = new Chapter03();
        c1.Third01();
        c1.Third02();
        c1.Third03();
        c1.Third04();
        c1.Third05();
        c1.Third06();
        c1.Third07();
        c1.Third08();
        c1.Third09();
        c1.Third10();
        c1.Third11();

        System.out.println("2x + 8 = 0 의 해, x는 " + c1.EquationFirst(2, 8));
        System.out.println("5x - 30 = 0 의 해, x 는 " + c1.EquationFirst(5, -30));
        System.out.println("7x + 49 = 0 의 해, x 는 " + c1.EquationFirst(7, 49));
        System.out.printf("7x + 49 = 0 의 해, x는 %d/n", c1.EquationFirst(7, 49));

        Problems p1 = new Problems();
        p1.Pro1();
        p1.Pro2();
        p1.Pro3();
        p1.Pro4();
        p1.Pro5();
        p1.Pro6();
        p1.Pro7();
    }

}
