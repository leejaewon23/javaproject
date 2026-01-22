import java.util.Scanner;
public class ArrayTest2 {
    // 배열 숙성 과제
    public void ArrayDouble() {
        // 1-1
        double[] dArray = new double[25];
        for (int i = 0; i < dArray.length; i++) {
            dArray[i] = Math.random() * 100;
            System.out.print(dArray[i] + ", ");
        }
        System.out.println();

        // 1-2
        int[] nArray = new int[25];
        int totalhap = 0;
        int totalavg = 0;
        for (int i = 0; i < nArray.length; i++) {
            nArray[i] = (int) dArray[i];
            System.out.print(nArray[i] + ", ");
            totalhap += nArray[i];
        }

        System.out.println();
        System.out.println("전체 합계: " + totalhap);
        totalavg = totalhap / nArray.length;
        System.out.println("전체 평균: " + totalavg);

        // 1-3
        String[] strArray = new String[25];
        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = "" + nArray[i];
            System.out.print("\"" + dArray[i] + " => " + strArray[i] + "\"" + ", ");
        }
        System.out.println();
    }

    // 2-1
    public void ArrayNumber() {
        int number = 7;

        int[][] nArray = new int[number][number];
        for (int i = 0; i < nArray.length; i++) {
            for (int j = 0; j < nArray.length; j++) {
                nArray[i][j] = i + j + 1;
                System.out.print(nArray[i][j] + (j == nArray.length - 1 ? "" : ","));
            }
            System.out.println();
        }
    }

    //2-2
    public void printSquare() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int number = sc.nextInt();

        char[][] square = new char[number][number];

        System.out.println(number + "행 " + number + "열");

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                // 1. 네 꼭짓점 처리
                if (i == 0 && j == 0) {
                    square[i][j] = '┌';
                } else if (i == 0 && j == number - 1) {
                    square[i][j] = '┐';
                } else if (i == number - 1 && j == 0) {
                    square[i][j] = '└';
                } else if (i == number - 1 && j == number - 1) {
                    square[i][j] = '┘';
                }
                // 2. 가로 테두리 (첫 번째 줄과 마지막 줄)
                else if (i == 0 || i == number - 1) {
                    square[i][j] = '─';
                }
                // 3. 세로 테두리 (첫 번째 열과 마지막 열)
                else if (j == 0 || j == number - 1) {
                    square[i][j] = '│';
                }
                // 4. 내부 공간
                else {
                    square[i][j] = ' ';
                }

                // 대입된 문자 출력
                System.out.print(square[i][j]);
            }
            System.out.println(); // 한 행이 끝나면 줄바꿈
        }
    }
    //2-3
    public void Diamond() {
        int n = 7; // 반드시 홀수여야 예쁘게 나옵니다.
        int mid = n / 2;

        int space = mid; // 시작 줄의 공백 개수 (2개)
        int star = 1;    // 시작 줄의 별 개수 (1개)

        for (int i = 0; i < n; i++) {
            // 1. 공백 출력
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }

            // 2. 별 출력
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }

            System.out.println(); // 줄바꿈

            // 3. 변수 조절 (중앙 이전까지는 별 늘리고, 이후엔 줄이기)
            if (i < mid) {
                space -= 1; // 공백은 1개씩 감소
                star += 2;  // 별은 2개씩 증가
            } else {
                space += 1; // 공백은 1개씩 증가
                star -= 2;  // 별은 2개씩 감소
            }
        }
    }



}







