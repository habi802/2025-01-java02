package ch02.sec08;

public class CastingMethodExample {
    public static void main(String[] args) {
        double r1 = division(10, 3);
        System.out.println("r1: " + r1);
        System.out.println("r2: " + division(100, 32));
    }

    public static double division(int num1, int num2) {
        return (double) num1 / num2;
    }
}
