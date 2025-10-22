package ch04.sec02;

import java.util.Scanner;

public class Mission03 {
    public static void main(String[] args) {
        // BMI 계산할 수 있는 프로그램
        // 체중(kg), 키(cm)로 입력받아서 BMI를 계산하여 출력해 주세요
        // 체중(kg)을 키(cm)의 제곱으로 나누는 것

        Scanner scanner = new Scanner(System.in);
        System.out.print("키(cm)을 입력해 주세요 > ");
        String cm = scanner.next();
        System.out.print("체중(kg)를 입력해 주세요 > ");
        String kg = scanner.next();

        double m = Double.parseDouble(cm) * 0.01;
        double bmi = Double.parseDouble(kg) / Math.pow(m, 2);
        System.out.printf("BMI: %.2f", bmi);
    }
}
