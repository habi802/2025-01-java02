package ch06.sec08.exam02;

public class ComputerExample {
    public static void main(String[] args) {
        Computer com = new Computer();

        int result = com.sum(1, 2, 3);
        int result2 = com.sum(1, 2, 3, 4);
        int result3 = com.sum(1, 2, 3, 4, 5);
        int result4 = com.sum(new int[] {1, 2, 3, 4, 5, 6});

        System.out.println("result: " + result);
        System.out.println("result2: " + result2);
        System.out.println("result3: " + result3);
    }
}
