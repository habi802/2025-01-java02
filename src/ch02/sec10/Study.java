package ch02.sec10;

public class Study {
    public static void main(String[] args) {
        String str = new String("12345");

        char[] arr = new char[5];
        arr[0] = '1';
        arr[1] = '2';
        arr[2] = '3';
        arr[3] = '4';
        arr[4] = '5';

        char[] strArr = str.toCharArray();

        System.out.println(arr);
        System.out.println(str);
        System.out.println(strArr);
    }
}
