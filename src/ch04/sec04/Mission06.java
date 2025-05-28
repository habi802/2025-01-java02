package ch04.sec04;

public class Mission06 {
    /*
        1부터 몇까지 더하면 누적 합계가 100을 넘지 않는
        제일 큰 수가 무엇인지 알아내는 예제
     */
    public static void main(String[] args) {
        int sum = 0, num = 0;
        while (sum <= 100) {
            sum += ++num;
        }
        --num;
        System.out.println("num: " + num);
    }
}
