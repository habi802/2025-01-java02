package ch04.sec04.method;

public class Mission07Method {
    public static void main(String[] args) {
        int[] scores = { 90, 88, 100, 70, 60, 90 };

        double avg = getAverage(scores);
        System.out.printf("평균: %.1f\n", avg);
    }

    public static double getAverage(int[] scores) {
        int total = Mission05Method.addAllUpArray(scores);
        return (double) total / scores.length;
    }
}
