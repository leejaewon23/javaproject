import java.util.Arrays;


public class ArrayTest {
    public void ArrayBoolean() {
        boolean[] boolArray = new boolean[10];
        for (int i = 0; i < boolArray.length; i++) {
            if (i % 2 == 0) {
                boolArray[i] = true;
            } else {
                boolArray[i] = false;
            }
            System.out.print(boolArray[i] + ", ");
        }
        System.out.println();
    }

    public void ArrayInt() {
        int[] intArray = new int[30];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i;
            System.out.print(intArray[i] + ", ");
        }
        System.out.println();
    }

    public void ArrayChar() {
        char[] charArray = new char[20];
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = 'A';
            System.out.print(charArray[i] + ", ");
        }
        System.out.println();
    }


    public void ArrayBoolean1() {
        boolean[][] boolArray1 = new boolean[3][4];
        for (int i = 0; i < boolArray1.length; i++) {
            for (int j = 0; j <= boolArray1.length; j++) {
                boolArray1[i][j] = true;
                System.out.print(boolArray1[i][j] + ", ");
            }
        }
    }

    public void ArrayString() {
        String[] stringArray = new String[50];
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = ("empty");
            System.out.print(stringArray[i] + ", ");
        }
        System.out.println();
    }

    public void ArraySquare() {
        int[][] intArray = {
                {0, 0, 1, 1, 0, 0},
                {1, 0, 0, 1, 0, 0},
                {0, 1, 0, 1, 0, 0},
                {0, 0, 1, 1, 0, 1},
                {1, 0, 0, 0, 1, 0}
        };
        int totalZero = 0;
        int totalOne = 0;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray.length; j++) {
                if (intArray[i][j] == 0) {
                    totalZero++;
                } else {
                    totalOne++;
                }
            }
        }
        System.out.println("0의 갯수는: " + totalZero + "개, " + "1의 갯수는: " + totalOne + "개.");
    }

    public void ArrayInputOutput() {
        char[][] chInput = {
                {'*', ' ', '*', '*', ' '}
                , {'*', '*', ' ', ' ', ' '}
                , {'*', ' ', '*', ' ', '*'}
                , {' ', '*', '*', ' ', '*'}
                , {'*', ' ', '*', ' ', '*'}
                , {' ', ' ', '*', '*', '*'}
        };

        for (int i = 0; i < chInput.length; i++) {
            for (int j = 0; j < chInput[i].length; j++) {
                System.out.print(chInput[i][j]);
            }
            System.out.println();
        }
        System.out.println("----------------------");

        int k = chInput.length;
        int z = chInput[0].length;
        char[][] chOutput = new char[z][k];

        for (int i = 0; i < chInput.length; i++) {
            for (int j = 0; j < chInput[i].length; j++) {
                // 원본의 (i, j)를 새 배열의 (j, i) 위치에 저장
                chOutput[j][i] = chInput[i][j];
            }
        }

        for (int i = 0; i < chOutput.length; i++) {
            for (int j = 0; j < chOutput[i].length; j++) { // chOutput[i].length로 수정
                System.out.print(chOutput[i][j]);
            }
            System.out.println(); // 행이 끝나면 줄바꿈 추가
        }
    }


}








