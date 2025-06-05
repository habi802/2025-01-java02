package ch02.sec03;

public class CharMethodExample {
    public static void main(String[] args) {
        printCharToInt('#');

        int val = getCharToInt('c');
        System.out.println("val: " + val);
    }

    public static void printCharToInt(char c) {
        System.out.printf("%c: %d\n", c, (int) c);
    }

    public static int getCharToInt(char c) {
        return c;
    }
}
