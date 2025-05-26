package ch03.sec01;

public class ArithmeticOperatorExample {
    // 산술 연산자
    public static void main(String[] args) {
        int v1 = 10, v2 = 4, v3 = 5;
        long v4 = 10L;

        int result1 = v1 + v2;
        System.out.println("result1: " + result1); // 14

        System.out.println("result2: " + ( v1 + v2 - v4 )); // 4

        System.out.println("result3: " + ( (double) v1 / v2 )); // 2.5가 나오게
    }
}
