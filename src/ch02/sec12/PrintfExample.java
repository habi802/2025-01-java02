package ch02.sec12;

public class PrintfExample {
    public static void main(String[] args) {
        int value = 12300;
        System.out.println("상품의 가격:" + value + "원");
        System.out.printf("상품의 가격:%d원\n", value);
        System.out.printf("상품의 가격:%,d원\n", value);

        String result = String.format("상품의 가격:%,d원\n", value);
        System.out.println(result);

        System.out.printf("상품의 가격:%9d원\n", value);
        System.out.printf("상품의 가격:%-9d원\n", value);
        System.out.printf("상품의 가격:%09d원\n", value);

        int year = 2025;
        int mon = 12;
        int day = 01;
        // 2025-09-04
        System.out.printf("%4d-%02d-%02d\n", year, mon, day);

        int radius = 10;
        double area = 3.14159 * radius * radius; // 반지름이 10인 원의 넓이
        System.out.printf("반지름이 %d인 원의 넓이: %f\n", radius, area);
        System.out.printf("반지름이 %d인 원의 넓이: %10.2f\n", radius, area);
        System.out.printf("반지름이 %d인 원의 넓이: %-10.2f\n", radius, area);
        System.out.printf("반지름이 %d인 원의 넓이: %010.2f\n", radius, area);

        String name = "123456789ABCDEFG";
        String job = "도적";
        System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
    }
}
