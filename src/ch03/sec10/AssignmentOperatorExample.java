package ch03.sec10;

public class AssignmentOperatorExample {
    public static void main(String[] args) {
        int result = 0;
        System.out.println("1. result: " + result);
        result = result + 10;
        System.out.println("2. result: " + result);
        result += 10;
        System.out.println("3. result: " + result);
        result -= 5;
        System.out.println("4. result: " + result);
        result *= 2;
        System.out.println("5. result: " + result);
        result /= 5;
        System.out.println("6. result: " + result);
        result %= 5;
        System.out.println("7. result: " + result); // 1
    }
}
