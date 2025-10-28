package ch06.sec07.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car("소나타", true, 30);

        System.out.println("모델명: " + car.model);
        System.out.println("시동 여부: " + car.start);
        System.out.println("현재 속도: " + car.speed);

        Car car2 = new Car();
        System.out.println("모델명: " + car2.model); // E클래스
        System.out.println("시동 여부: " + car2.start); // true
        System.out.println("현재 속도: " + car2.speed); // 40
    }
}
