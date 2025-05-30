package ch05.sec09;

import java.util.Arrays;

public class ArrayCopyByForExample {
    public static void main(String[] args) {
        int[] oldIntArray = new int[3]; // 길이가 3인 배열 공간 생성

        // 1, 2, 3 대입해주세요.
        int num = 0;
        for (int i = 0; i < oldIntArray.length; i++) {
            oldIntArray[i] = ++num;
        }

        int[] newIntArray = new int[oldIntArray.length];
        for (int i = 0; i < oldIntArray.length; i++) {
            newIntArray[i] = oldIntArray[i];
        }
        System.out.println(Arrays.toString(oldIntArray));
        System.out.println(Arrays.toString(newIntArray));

        oldIntArray[0] = 10;
        System.out.println(Arrays.toString(oldIntArray));
        System.out.println(Arrays.toString(newIntArray));
    }
}
