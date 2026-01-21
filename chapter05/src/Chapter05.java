import java.io.PrintStream;

public class Chapter05 {
    public void ReFerence() {
        int[] arr1;
        int[] arr2;
        int[] arr3;

        arr1 = new int[] {1, 2, 3};
        arr2 = new int[] {1, 2, 3};
        arr3 = arr2;

        System.out.println(arr1 == arr2); //arr1과 arr2 변수가 같은 배열을 참조하는지 검사
        System.out.println(arr2 == arr3); //arr2와 arr3 변수가 같은 배열을 참조하는지 검사
    }

    public void NullPointer() {
        int[] intArray = null;
        //intArray[0] = 10; intArray 변수가 null을 가지고 있어 NullPointerException 예외가 뜬다.

        String str = null;
        //System.out.println("총 문자 수: " + str.length() ); 위와 동일하다.
    }

    public void Garbage() {
        String hobby = "여행";
        hobby = null; //"여행"에 해당하는 String 객체를 쓰레기로 만듦

        String kind1 = "자동차";
        String kind2 = kind1; // kind1 변수에 저장되어 있는 번지를 kind2 변수에 대입
        kind1 = null;
        System.out.println("kind2: " + kind2);
    }

    public void Equals() {
        String strVar1 = "홍길동";
        String strVar2 = "홍길동";

        if(strVar1 == strVar2) {
            System.out.println("strVar1과 strVar2는 참조가 같음");

        } else {
            System.out.println("strVar1과 strVar2는 참조가 다름");
        }
        if(strVar1.equals(strVar2)) {
            System.out.println("strVar1과 strVar2는 문자열이 같음");
        }

        String strVar3 = new String("홍길동");
        String strVar4 = new String("홍길동");

        if(strVar3 == strVar4) {
            System.out.println("strVar3과 strVar4는 참조가 같음");
        } else {
            System.out.println("strVar3과 strVar4는 참조가 다름");
        }

        if(strVar3.equals(strVar4)) {
            System.out.println("strVar3과 strVar4는 문자열이 같음");
        }
    }

    public void EmpptyString() {
        String hobby = "";
        if(hobby.equals("")) {
            System.out.println("hobby 변수가 참조하는 String 객체는 빈 문자열");
        }
    }

    public void CharAtLength() {
        String ssn = "9506241230123";
        char sex = ssn.charAt(6);
        switch (sex) {
            case '1':
            case '3':
                System.out.println("남자입니다.");
                break;
            case '2':
            case '4':
                System.out.println("여자입니다.");
                break;
        }
        int lenth = ssn.length();
        if(lenth == 13) {
            System.out.println("주민등록번호 자릿수가 맞습니다.");
        } else {
            System.out.println("주민등록번호 자릿수가 틀립니다.");
        }
    }

    public void Replace() {
        String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
        String newStr = oldStr.replace("자바", "JAVA");

        System.out.println(oldStr);
        System.out.println(newStr);
    }

    public void SubString() {
        String ssnn = "880815-1234567";

        String firstNum = ssnn.substring(0, 6);
        System.out.println(firstNum);

        String secondNum = ssnn.substring(7);
        System.out.println(secondNum);
    }

    public void IndexOf() {
        String subject = "자바 프로그래밍";

        int location = subject.indexOf("프로그래밍");
        System.out.println(location);
        String substring = subject.substring(location);
        System.out.println(substring);

        location = subject.indexOf("자바");
        if (location != -1) {
            System.out.println("자바와 관련된 책이군요.");
        } else {
            System.out.println("자바와 관련 없는 책이군요.");
        }

        boolean result = subject.contains("자바");
        if(result) {
            System.out.println("자바와 관련된 책이군요.");
        } else {
            System.out.println("자바와 관련 없는 책이군요.");
        }
    }

    public void Split() {
        String board = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";

        String[] tokens = board.split(",");

        System.out.println("번호: " + tokens[0]);
        System.out.println("제목: " + tokens[1]);
        System.out.println("내용: " + tokens[2]);
        System.out.println("성명: " + tokens[3]);
        System.out.println();

        for(int i = 0; i < tokens.length; i++) {
            System.out.println(tokens[i]);
        }
    }

    public void ArrayCreate() {
        String[] season = {"Spring", "Summer", "Autumn", "Winter"};

        System.out.println("season[0] : " + season[0]);
        System.out.println("season[1] : " + season[1]);
        System.out.println("season[2] : " + season[2]);
        System.out.println("season[3] : " + season[3]);

        season[1] = "여름";
        System.out.println("season[1] : " + season[1]);
        System.out.println();

        int[] scores = { 83, 90, 87};
        int sum = 0;
        for(int i = 0; i < 3; i++) {
            sum += scores[i];
        }
        System.out.println("총합: " + sum);
        double avg = (double) sum / 3;
        System.out.println("평균: " + avg);
    }

    public void ArrayCreate2() {
        int[] scores1;
        scores1 = new int[] { 83, 90, 87 };

        int sum1 = 0;
        for(int i = 0; i < 3; i++) {
            sum1 += scores1[i];
        }
        System.out.println("총합: " + sum1);

        printItem( new int[] { 83, 90, 87 } );


    }

    public static void printItem(int[] scores) {
        for(int i = 0; i < 3; i++) {
            System.out.println("score[" + i + "]: " + scores[i]);
        }
    }

    public void ArrayCreate3() {
        int[] arr1 = new int[3];

        for(int i = 0; i < 3; i++) {
            System.out.print("arr1[" + i + "]: " + arr1[i] + ", ");
        }
        System.out.println();

        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;

        for(int i = 0; i < 3; i++) {
            System.out.print("arr1[" + i + "]: " + arr1[i] + ", ");
        }
        System.out.println("\n");

        double[] arr2 = new double[3];
        for(int i = 0; i < 3; i++) {
            System.out.print("arr2[" + i + "]: " + arr2[i] + ", ");
        }
        System.out.println();

        arr2[0] = 0.1;
        arr2[1] = 0.2;
        arr2[2] = 0.3;
        for(int i = 0; i < 3; i++) {
            System.out.print("arr2[" + i + "]: " + arr2[i] + ", ");
        }
        System.out.println("\n");

        String[] arr3 = new String[3];
        for(int i = 0; i < 3; i++) {
            System.out.print("arr3[" + i + "]: " + arr3[i] + ", ");
        }
        System.out.println();

        arr3[0] = "1월";
        arr3[1] = "2월";
        arr3[2] = "3월";
        for(int i = 0; i < 3; i++) {
            System.out.print("arr3[" + i + "]: " + arr3[i] + ", ");
        }
    }

    public void ArrayLength() {
        int[] scores2 = { 84, 90, 96 };

        int sum2 = 0;
        for(int i = 0; i < scores2.length; i++) {
            sum2 += scores2[i];
        }
        System.out.println();
        System.out.println("총합: " + sum2);

        double avg2 = (double) sum2 / scores2.length;
        System.out.println("평균: " + avg2);
    }

    public void ArrayMultidimensional() {
        int[][] scores3 = {
                { 80, 90, 96 },
                { 76, 88 }
        };

        System.out.println("1차원 배열 길이(반의수): " + scores3.length);
        System.out.println("2차원 배열 길이(첫 번째 반의 학생 수): " + scores3[0].length);
        System.out.println("2차원 배열 길이(두 번째 반의 학생 수): " + scores3[1].length);

        System.out.println("scores[0][2]: " + scores3[0][2]);
        System.out.println("scores[1][1]: " + scores3[1][1]);

        int class1Sum = 0;
        for(int i = 0; i < scores3[0].length; i++) {
            class1Sum += scores3[0][i];
        }
        double class1Avg = (double) class1Sum / scores3[0].length;
        System.out.println("첫 번째 반의 평균 점수: " + class1Avg);

        int class2Sum = 0;
        for(int i = 0; i < scores3[1].length; i++) {
            class2Sum += scores3[1][i];
        }
        double class2Avg = (double) class2Sum / scores3[1].length;
        System.out.println("두 번째 반의 평균 점수: " + class2Avg);

        int totalStudent = 0;
        int totalSum = 0;
        for(int i = 0; i < scores3.length; i++) {
            totalStudent += scores3[i].length;
            for (int k = 0; k <scores3[i].length; k++) {
                totalSum += scores3[i][k];
            }
        }
        double totalAvg = (double) totalSum / totalStudent;
        System.out.println("전체 학생의 평균 점수: " + totalAvg);
    }

    public void ArrayMultidimensional2() {
        int[][] mathScores = new int[2][3];

        for(int i = 0; i < mathScores.length; i++) {
            for(int k = 0; k < mathScores[i].length; k++) {
                System.out.println("mathScores[" + i + "][" + k + "]: " + mathScores[i][k]);
            }
        }
        System.out.println();

        mathScores[0][0] = 80;
        mathScores[0][1] = 83;
        mathScores[0][2] = 85;
        mathScores[1][0] = 86;
        mathScores[1][1] = 90;
        mathScores[1][2] = 92;

        int totalStudent1 = 0;
        int totalMathSum = 0;
        for(int i = 0; i < mathScores.length; i++) {
            totalStudent1 += mathScores[i].length;
            for(int k = 0; k < mathScores[i].length; k++) {

                totalMathSum += mathScores[i][k];
            }
        }
        double totalMathAvg = (double) totalMathSum / totalStudent1;
        System.out.println("전체 학생의 수학 평균 점수; " + totalMathAvg);
        System.out.println();

        int[][] englishScores = new int[2][];
        englishScores[0] = new int[2];
        englishScores[1] = new int[3];

        for(int i = 0; i < englishScores.length; i++) {
            for(int k = 0; k < englishScores[i].length; k++) {

                System.out.println("englishScores[" + i + "][" + k + "]: " + englishScores[i][k]);
            }
        }
        System.out.println();

        englishScores[0][0] = 90;
        englishScores[0][1] = 91;
        englishScores[1][0] = 92;
        englishScores[1][1] = 93;
        englishScores[1][2] = 94;

        totalStudent1 = 0;
        int totalEnglishSum = 0;
        for(int i = 0; i < englishScores.length; i++) {
            totalEnglishSum += englishScores[i].length;
            for(int k = 0; k < englishScores[i].length; k++) {
                totalEnglishSum += englishScores[i][k];
            }
        }
        double totalEnglishAvg = (double) totalEnglishSum / totalStudent1;
        System.out.println("전체 학생의 영어 평균 점수: " +  totalEnglishAvg);
    }

}
