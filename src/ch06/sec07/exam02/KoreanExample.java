package ch06.sec07.exam02;

public class KoreanExample {
    public static void main(String[] args) {
        Korean korean = new Korean();

        System.out.println(korean.nation); // 대한민국
        System.out.println(korean.name); // 신사임당
        System.out.println(korean.ssn); // 901022-2754312

        Korean korean2 = new Korean("홍길동", "901123-1543123");

        System.out.println(korean2.nation); // 대한민국
        System.out.println(korean2.name); // 홍길동
        System.out.println(korean2.ssn); // 901123-1543123
    }
}
