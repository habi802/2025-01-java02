package ch05.sec05;

public class MyBoxTest {
    public static void main(String[] args) {
        MyBox myBox1 = new MyBox(10);
        MyBox myBox2 = new MyBox(10);
        MyBox myBox3 = new MyBox(11);

        System.out.println(myBox1.equals(myBox2)); // true
        System.out.println(myBox1.equals(myBox3)); // false
        System.out.println(myBox1.equals(myBox1)); // true
    }
}
