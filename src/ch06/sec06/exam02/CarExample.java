package ch06.sec06.exam02;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.company = "기아";

        System.out.println("제작 회사: " + myCar.company);
        System.out.println("모델명: " + myCar.model);
        System.out.println("최고 속도: " + myCar.maxSpeed);
        System.out.println("현재 속도: " + myCar.speed);
        myCar.speed = 20;
        System.out.println("현재 속도: " + myCar.speed);
    }
}
