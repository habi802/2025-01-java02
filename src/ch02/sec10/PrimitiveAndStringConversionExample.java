package ch02.sec10;

public class PrimitiveAndStringConversionExample {
    public static void main(String[] args) {
        int value1 = Integer.parseInt("10");
        System.out.println("value1: " + (value1 + 1));

        double value2 = Double.parseDouble("3.14"); // Wrapper Type Class
        System.out.println("value2: " + value2);

        boolean value3 = Boolean.parseBoolean("true");

        long value4 = Long.parseLong("100000");

        int intValue = 10;
        //String str1 = "" + intValue;
        String str1 = String.valueOf(intValue);
        System.out.println("str1: " + str1);
        String str2 = String.valueOf(value2);
        System.out.println("str2: " + str2);
    }
}
