package ch06.sec06.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();

        System.out.println("모델명: " + car.model);
        System.out.println("시동 여부: " + car.start);
        System.out.println("현재 속도: " + car.speed);

        Car car2 = new Car();

        System.out.println("모델명2: " + car2.model);
        System.out.println("시동 여부2: " + car2.start);
        System.out.println("현재 속도2: " + car2.speed);
    }
}
