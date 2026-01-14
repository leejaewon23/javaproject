public class GuGuDan {
    public static void main(String[] args) {

        for (int i = 2; i < 10; i += 3) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 3; k++) {
                    int dan = i + k;
                    if (dan > 9) break; // 10단 이상 출력 방지

                    if (j == 0) {
                        System.out.print("  " + dan + "단\t\t"); // 탭으로 간격 조정
                    } else {
                        // 문자열을 더해서 출력
                        System.out.print(dan + " * " + j + " = " + (dan * j) + "\t");
                    }
                }
                System.out.println();
            }
            System.out.println(); // 단 묶음 사이 줄바꿈
        }
        }
    }

