package ch04.sec04;

public class Mission02 {
    public static void main(String[] args) {
        // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10

        // for문을 활용하여 위처럼 출력되게 해주세요.
        System.out.print(1);
        for (int i = 2; i <= 10; i++) {
            System.out.print(", " + i);
        }
    }
}
