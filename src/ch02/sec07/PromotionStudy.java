package ch02.sec07;

public class PromotionStudy {
    /*
    자동 타입 변환(promotion): 작은 타입이 큰 타입으로 대입될 때 발생

    byte < short, char < int < long < float < double

    (모든 타입 + String) 이 되면 모든 타입이 String으로 파싱된다.
     */
    public static void main(String[] args) {
        byte byteVal = 10;
        int intVal = byteVal;
        System.out.println("intVal: " + intVal);

        char charVal = '가';
        int intVal2 = charVal;
        System.out.println("intVal2: " + intVal2);
        System.out.printf("44032: %c\n", intVal2); // 44032 정수를 문자로 표시하라 > '가'

        int intVal3 = 50;
        long longVal = intVal3;
        System.out.println("longVal: " + intVal3);

        long longVal2 = 9_223_372_036_854_775_807L;
        float floatVal = longVal2;
        System.out.println("floatVal: " + floatVal);
        long longVal3 = (long)floatVal;
        System.out.printf("longVal3: %,d\n", longVal3);

        float floatVal2 = 100.4f;
        double doubleVal = floatVal2;
        System.out.println("doubleVal: " + doubleVal);
    }
}
