package ch06.sec09;

public class StaticCarExample {
    public static void main(String[] args) {
        StaticCar.model = "벤츠";
        StaticCar.setSpeed(200);
        StaticCar.run();

        StaticCar car1 = new StaticCar("BMW");
        car1.setSpeed(100);
        car1.run();

        StaticCar.run();
    }
}
