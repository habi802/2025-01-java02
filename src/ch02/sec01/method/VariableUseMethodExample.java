package ch02.sec01.method;

public class VariableUseMethodExample {
    public static void main(String[] args) {
        printTime(10, 20); // 10:20
        printTime(2, 9); // 02:09

        printTime(2, 9, 2); // 02:09:02
        printTime(12, 9, 22); // 12:09:22
    }

    public static void printTime(int hour, int min) {
        String strHour = hour < 10 ? "0" + hour : String.valueOf(hour);
        String strMin = min < 10 ? "0" + min : String.valueOf(min);
        System.out.println(strHour + ":" + strMin);
    }

    public static void printTime(int hour, int min, int second) {
        String strHour = hour < 10 ? "0" + hour : String.valueOf(hour);
        System.out.print(strHour + ":");
        printTime(min, second);
//        String strMin = min < 10 ? "0" + min : String.valueOf(min);
//        String strSecond = second < 10 ? "0" + second : String.valueOf(second);
//        System.out.println(strHour + ":" + strMin + ":" + strSecond);
    }
}
