package ch02.sec08;

public class Mission02 {
    public static void main(String[] args) {
        double pi = 3.141592;

        //double shortPi = Double.parseDouble(String.valueOf(pi).substring(0, 5));
        double shortPi = (int) (pi * 1000) * 0.001;

        System.out.println("shortPi: " + shortPi); // 3.142, 3.141
    }
}
