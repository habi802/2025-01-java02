package ch06.sec09;

public class CarExample {
    public static void main(String[] args) {
        // 포르쉐, 벤츠 차 2개 객체 생성
        Car porsche = new Car("포르쉐");
        Car benz = new Car("벤츠");

        porsche.run();
        benz.run();
    }
}
