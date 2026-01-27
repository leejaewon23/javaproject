package org.example1;

import org.example.Aaa;

public class Ddd extends Aaa{
    public Ddd() {
        super();
    }

    public void method1() {
        this.field = "value";

        this.method1();
    }

    //직접 객체 생성해서 사용하는 것은 안됨
//    public void method2() {
//        Aaa a = new Aaa();
//        a.filed = "value";
//        a.method();
//
//    }
}
