package ch02.sec01.method;

public class VariableUseMethodExample02 {
    public static void main(String[] args) {
        printTime(10, 20); // 10:20
        printTime(2, 9); // 02:09

        printTime(2, 9, 2); // 02:09:02
        printTime(12, 9, 22); // 12:09:22
    }

    public static String parseTime(int val) {
        return val < 10 ? "0" + val : String.valueOf(val);
    }

    public static void printTime(int hour, int min, int sec) {
        System.out.print(parseTime(hour) + ":");
        printTime(min, sec);
    }

    public static void printTime(int time1, int time2) {
        System.out.println(parseTime(time1) + ":" + parseTime(time2));
    }
}
