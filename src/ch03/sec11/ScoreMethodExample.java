package ch03.sec11;

public class ScoreMethodExample {
    public static void main(String[] args) {
        int randomScore = getRandomValue(10, 100);
        //int randomScore2 = getRandomValue(1, 5);
        System.out.println(randomScore);
        //System.out.println(randomScore2);

        char grade = getGrade(randomScore);
        // 100점 초과 시 혹은 0점 미만 시 ' ' 리턴
        // 90점 이상 'A' 리턴
        // 80점 이상 'B' 리턴
        // 70점 이상 'C' 리턴
        // 나머지 'D' 리턴
        System.out.println(grade);
    }

    public static int getRandomValue(int from, int to) {
        return (int) (Math.random() * (double) (to - from + 1)) + from;
    }

    public static char getGrade(int score) {
        char grade = 'D';

        if (score > 100 || score < 0) {
            grade = ' ';
        } else if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        }

        return grade;
    }
}
