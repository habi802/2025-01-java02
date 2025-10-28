package ch05.sec11;

public class Mission01 {
    public static void main(String[] args) {
        // args 이용하여 각 방에 있는 값들을 모두 더한 값을 출력
//        int sum = 0;
//        for (int i = 0; i < args.length; i++) {
//            sum += Integer.parseInt(args[i]);
//        }
//        System.out.println("합계: " + sum);

        // arguments: 75kg 180cm
        // BMI 계산
        double height = 0.0;
        double weight = 0.0;
        for (String item : args) {
            if (item.toLowerCase().contains("kg")) {
                weight = Double.parseDouble(item.toLowerCase().replace("kg", ""));
            } else if (item.toLowerCase().contains("cm")) {
                height = Double.parseDouble(item.toLowerCase().replace("cm", ""));
            }
        }

        if (height == 0.0 || weight == 0.0) {
            System.out.println("잘못된 입력입니다.");
        } else {
            double bmi = weight / Math.pow(height * 0.01, 2);
            System.out.printf("키: %.1fcm\n", height);
            System.out.printf("몸무게: %.1fkg\n", weight);
            System.out.printf("BMI: %.2f\n", bmi);
        }
    }
}
