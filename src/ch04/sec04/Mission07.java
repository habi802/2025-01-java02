package ch04.sec04;

public class Mission07 {
    public static void main(String[] args) {
        int[] scores = { 90, 88, 100, 70, 60 };

        // 어떤 학생이 받은 점수이다.
        // 평균 점수를 구하라.
        int sum = 0;
        int length = scores.length;
        for (int i = 0; i < length; i++) {
            sum += scores[i];
        }
        double avg = (double) sum / length;
        System.out.printf("평균 점수: %.1f점\n", avg);
    }
}
