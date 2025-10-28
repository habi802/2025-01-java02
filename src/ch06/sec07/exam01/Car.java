package ch06.sec07.exam01;

public class Car {
    String model;
    boolean start;
    int speed;

    // 오버로딩 (Overloading): 똑같은 이름의 메소드를 여러 개 만들 수 있다.
    // 조건은 파라미터가 타입의 순서와 갯수가 달라야 한다. (매개변수명은 상관없음)
    public Car() {
//        this.model = "E클래스";
//        this.start = true;
//        this.speed = 40;
        this("E클래스", true, 40);
    }

    public Car(boolean bbb, int ccc, String aaa) {}

    public Car(String model, boolean start, int speed) {
        this.model = model;
        this.start = start;
        this.speed = speed;
    }
}
