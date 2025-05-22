package ch02.sec01;

public class VariableExchangeExample {
    public static void main(String[] args) {
        int x = 3, y = 5;
        System.out.printf("x: %d, y: %d\n", x, y);
        
        // 스와핑으로 처리
        int temp = x;
        x = y;
        y = temp;

        // x: 5, y: 3 이렇게 출력되게 해주세요.
        System.out.printf("x: %d, y: %d\n", x, y);
    }
}
