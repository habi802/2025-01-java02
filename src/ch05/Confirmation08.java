package ch05;

public class Confirmation08 {
    public static void main(String[] args) {
        int[][] array = {
            {95, 86},
            {83, 92, 96},
            {78, 83, 93, 87, 88}
        };

        int sum = 0;
        int totalLength = 0;
        for (int i = 0; i < array.length; i++) {
            totalLength += array[i].length;
            for (int k = 0; k < array[i].length; k++) {
                sum += array[i][k];
            }
        }
        double avg = (double) sum / totalLength;
        System.out.println("합계: " + sum);
        System.out.printf("평균: %.1f\n", avg);
    }
}
