public class ArrayTest2 {
    // 배열 숙성 과제
    public void ArrayDouble(){
        // 1-1
        double[] dArray = new double[25];
        for(int i=0; i< dArray.length; i++){
            dArray[i] = Math.random() * 100;
            System.out.print(dArray[i] + ", ");
        }
        System.out.println();

        // 1-2
        int[] nArray = new int[25];
        int totalhap = 0;
        int totalavg = 0;
        for(int i=0; i< nArray.length; i++){
            nArray[i] = (int) dArray[i];
            System.out.print(nArray[i] + ", ");
            totalhap += nArray[i];
        }

        System.out.println();
        System.out.println("전체 합계: " + totalhap);
        totalavg = totalhap / nArray.length;
        System.out.println("전체 평균: " + totalavg);

        // 1-3
        String [] strArray = new String[25];
        for(int i=0; i<strArray.length; i++){
            strArray[i] = "" +  nArray[i];
            System.out.print("\"" + dArray[i] + " => "  + strArray[i] + "\"" + ", ");
        }

    }





}
