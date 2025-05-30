package ch05.sec06;

import java.util.Arrays;

public class ArrayCreateByValueListExample2 {
    public static void main(String[] args) {
        //int[] scores = { 83, 90, 87 };
        int[] scores;
        scores = new int[]{ 83, 90, 87, 88, 100 };
        System.out.println("main: " + Arrays.toString(scores));
        printItem(scores);

        int[] arr = { 10, 20, 30, 400, 500 };
        printItem(arr);
    }

    //           리턴타입 메소드명 파라미터(매개변수)
    public static void printItem(int[] arr) {
        //System.out.println("printItem: " + Arrays.toString(arr));
        /*
        score[0]: 83
        score[1]: 90
        score[2]: 87
         */
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("score[%d]: %d\n", i, arr[i]);
        }
    }
}
