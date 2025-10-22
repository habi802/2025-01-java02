package ch04.sec02;

public class MyMath {
    public static double pow(double a, double b) {
        double result = 1.0;
        double temp = b < 0 ? -b : b;

        for (int i = 0; i < temp; i++) {
            result *= a;
        }

        return b < 0 ? 1 / result : result;
    }
}
