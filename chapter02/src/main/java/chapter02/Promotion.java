package chapter02;

public class Promotion {
    public void usePromotion() {
        //자동 타입 변환
        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println("intValue:" + intValue);

        char charValue = '가';
        intValue = charValue;
        System.out.println("가의 유니코드:" + intValue);

        intValue = 50;
        long longValue = intValue;
        System.out.println("longValue:" + longValue);

        longValue = 100;
        float floatValue = longValue;
        System.out.println("floatValue:" + floatValue);

        floatValue = 100.5F;
        double doubleValue = floatValue;
        System.out.println("doubleValue:" + doubleValue);


    }
    //강제 타입 변환
    public void usePromotion2() {
        int var1 = 10;
        byte var2 = (byte) var1;
        System.out.println(var2);

        long var3 = 300;
        int var4 = (int) var3;
        System.out.println(var4);

        int var5 = 65;
        char var6 = (char) var5;
        System.out.println(var6);

        double var7 = 3.14;
        int var8 = (int) var7;
        System.out.println(var8);
    }
}
