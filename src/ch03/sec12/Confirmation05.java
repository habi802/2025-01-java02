package ch03.sec12;

public class Confirmation05 {
    public static void main(String[] args) {
        int lengthTop = 5;
        int lengthBottom = 10;
        int height = 7;
        double area1 = (lengthTop + lengthBottom) * height / 2.0;
        double area2 = (lengthTop + lengthBottom) * height * 1.0 / 2;
        double area3 = (double) (lengthTop + lengthBottom) * height / 2;
        double area4 = (double) ((lengthTop + lengthBottom) * height / 2);

        System.out.println("area1: " + area1);
        System.out.println("area2: " + area2);
        System.out.println("area3: " + area3);
        System.out.println("area4: " + area4);
    }
}
