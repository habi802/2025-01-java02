package ch02.sec10;

import java.util.Scanner;

public class Mission02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력해 주세요 > ");
        String str = scanner.next();

        // 입력한 숫자의 홀수 갯수, 짝수 갯수 출력해주세요.
        // 홀수: 2
        // 짝수: 3
//        char[] arr = str.toCharArray();
//        int[] evenOdd = new int[2];
//        for (char c : arr) {
//            evenOdd[Integer.parseInt(String.valueOf(c)) % 2]++;
//        }
//        System.out.printf("홀수: %d\n짝수: %d", evenOdd[1], evenOdd[0]);

        int num = Integer.parseInt(str);
        int[] evenOdd = new int[2];
        do {
            int digit = num % 10;
            evenOdd[digit % 2]++;
        } while ((num /= 10) > 0);
        System.out.printf("홀수: %d\n짝수: %d", evenOdd[1], evenOdd[0]);
    }
}
