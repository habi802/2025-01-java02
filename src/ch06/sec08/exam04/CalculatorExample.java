package ch06.sec08.exam04;

public class CalculatorExample {
    public static void main(String[] args) {
        // 한 변의 길이가 40인 정사각형의 넓이를 구하고 싶으다.
        Calculator calc = new Calculator();
        System.out.println("정사각형 넓이: " + calc.areaRectangle(40));

        // 가로 40, 세로 50인 직사각형의 넓이를 구하고 싶소.
        System.out.println("직사각형 넓이: " + calc.areaRectangle(40, 50));
    }
}
