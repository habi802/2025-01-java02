package ch05.sec06;

import java.util.Arrays;

public class Mission01 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40 };

        // 메소드 호출하면서 아규먼트로 arr를 보낸다.
        doubleArray(arr);

        System.out.println(Arrays.toString(arr)); // [20, 40, 60, 80]
    }

    public static void doubleArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
    }
}
