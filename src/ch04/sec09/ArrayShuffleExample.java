package ch04.sec09;

import java.util.Arrays;

public class ArrayShuffleExample {
    public static void main(String[] args) {
        int[] arr = new int[15];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));

        // 0~9 랜덤값 구한다.
        // 예를 들어 7이 나오면 0번 방과 7번 방을 스와핑한다.
        // 0~9 랜덤값 구한다.
        // 예를 들어 8이 나오면 1번 방과 8번 방을 스와핑한다.
        // 0~9 랜덤값 구한다.
        // 예를 들어 5이 나오면 2번 방과 5번 방을 스와핑한다.
        // ...
        // 0~9 랜덤값 구한다.
        // 예를 들어 3이 나오면 9번 방과 3번 방을 스와핑한다.
        for (int i = 0; i < arr.length; i++) {
            int num = (int) (Math.random() * arr.length);
            int temp = arr[i];
            arr[i] = arr[num];
            arr[num] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
