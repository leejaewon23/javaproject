package org.example;

public class Chapter03 {
    public void Third01() {
        int x = -100;
        x = -x;
        System.out.println("x: " + x);

        byte b = 100;
        int y = -b;
        System.out.println("y: " + y);

        int x1 = 10;
        int y1 = 10;
        int z1;

        x1++;
        ++x1;
        System.out.println("x1: " + x1);

        System.out.println("---------------");
        y1--;
        --y1;
        System.out.println("y1: " + y1);

        System.out.println("---------------");
        z1 = x1++;
        System.out.println("z1: " + z1);
        System.out.println("x1= " + x1);

        System.out.println("----------------");
        z1 = ++x1;
        System.out.println("z1= " + z1);
        System.out.println("x1= " + x1);

        System.out.println("---------------");
        z1 = ++x1 + y1++;
        System.out.println("z1= " + z1);
        System.out.println("x1= " + x1);
        System.out.println("y1= " + y1);


    }
    public void Third02() {
        byte v1 = 10;
        byte v2 = 4;
        int v3 = 5;
        long v4 = 10L;

        int result1 = v1 + v2;
        System.out.println("result1: " + result1);

        long result2 = v1 + v2 - v4;
        System.out.println("result2: " + result2);

        double result3 = (double) v1 / v2;
        System.out.println("result3: " + result3);

        int result4 = v1 % v2;
        System.out.println("result4: " + result4);
    }
    public void Third03() {
        byte ver1 = 125;
        for(int i = 0; i<5; i++) {
            ver1++;
            System.out.println("ver1: " + ver1);
        }

        System.out.println("--------------------");

        byte ver2 = -125;
        for(int i = 0; i<5; i++) {
            ver2--;
            System.out.println("ver2: " + ver2);
        }
    }
    public void Third04() {
        int apple = 1;
        double pieceUnit = 0.1;
        int number = 7;

        double result = apple - number * pieceUnit;
        System.out.println("사과 1개에서 남은 양: " + result);

        int apple1 = 1;
        int totalPieces1 = apple1 * 10;
        int number1 = 7;

        int result1 = totalPieces1 - number1;
        System.out.println("10조각에서 남은 조각: " + result1);
        System.out.println("사과 1개에서 남은 양: " + result1/10.0);
    }
    //비교 연산자
    public void Third05() {
        int num1 = 10;
        int num2 = 10;
        boolean result2 = (num1 == num2);
        boolean result3 = (num1 != num2);
        boolean result4 = (num1 <= num2);
        System.out.println("resul2: " + result2);
        System.out.println("resul3: " + result3);
        System.out.println("resul4: " + result4);

        char char1 = 'A';
        char char2 = 'B';
        boolean result5 = (char1 < char2);
        System.out.println("result5: " + result5);

        float num5 = 0.1f;
        double num6 = 0.1;
        boolean result7 = (num5 == num6);
        boolean result8 = (num5 == (float)num6);
        System.out.println("result7: " + result7);
        System.out.println("result8: " + result8);

        String str1 = "자바";
        String str2 = "JAVA";
        boolean result9 = str1.equals(str2);
        boolean result10 = (! str1.equals(str2));
        System.out.println("result9: " + result9);
        System.out.println("result10: " + result10);
    }
    //논리 연산자
    public void Third06() {
        int charCode = 'A';

        if( (65 <= charCode) && (charCode <= 90) ) {
            System.out.println("대문자이군요.");
        }

        if((97 <= charCode) && (charCode <= 122) ){
            System.out.println("소문자이군요.");
        }

        if((48 <= charCode) && (charCode <= 57) ){
            System.out.println("0~9 숫자이군요");
        }

        int value = 6;

        if((value%2 == 0) || (value%3 == 0) ){
            System.out.println("2 또는 3의 배수이군요.");
        }

    }
    //비트 논리 연산자
    public void Third07() {
        System.out.println("45 & 25 = " + (45 & 25));
        System.out.println("45 | 25 = " + (45 | 25));
        System.out.println("45 ^ 25 = " + (45 ^ 25));
        System.out.println("~45 = " + (~45));
        System.out.println("-----------------------------");

        byte receiveData = -120;

        int unsignedInt1 = receiveData & 255;
        System.out.println("unsignedInt1: " + unsignedInt1);

        int unsignedInt2 = Byte.toUnsignedInt(receiveData);
        System.out.println("unsignedInt2: " + unsignedInt2);

        int test = 136;
        byte btest = (byte)test;
        System.out.println(btest);
    }
    //비트 이동 연산자
    public void Third08() {
        int num3 = 1;
        int result6 = num3 << 3;
        int result7 = num3 * (int) Math.pow(2, 3);
        System.out.println("result6: " + result6);
        System.out.println("result7: " + result7);

        int num4 = -8;
        int result8 = num4 >> 3;
        int result9 = num4 / (int) Math.pow(2, 3);
        System.out.println("result8: " + result8);
        System.out.println("result9: " + result9);
    }
    public void Third09() {
        int value1 = 772;

        byte byte1 = (byte) (value1 >> 24);
        int int1 = byte1 << 255;
        System.out.println("첫 번째 바이트 부호 없는 값: " + int1);

        byte byte2 = (byte) (value1 >> 16);
        int int2 = Byte.toUnsignedInt(byte2);
        System.out.println("두 번째 바이트 부호 없는 값: " + int2);

        byte byte3 = (byte) (value1 >> 8);
        int int3 = byte3 & 255;
        System.out.println("세 번째 바이트 부호  없는 값: " + int3);

        byte byte4 = (byte) (value1);
        int int4 = Byte.toUnsignedInt(byte4);
        System.out.println("네 번째 바이트 부호 없는 값: " + int4);
    }
    //대입 연산자
    public void Third10() {
        int result11 = 0;
        result11 += 10;
        System.out.println("result11: " + result11);
        result11 -= 5;
        System.out.println("result11: " + result11);
        result11 *= 3;
        System.out.println("result11: " + result11);
        result11 /= 5;
        System.out.println("result11: " + result11);
        result11 %= 3;
        System.out.println("result11: " + result11);
    }
    //삼항 연산자
    public void Third11() {
        int score = 85;
        char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
        System.out.println(score + "점은 " + grade + "등급입니다.");

    }

    public int EquationFirst(int a, int b) {
        return -b / a;
    }

}




