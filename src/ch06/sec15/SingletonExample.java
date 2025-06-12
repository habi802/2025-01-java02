package ch06.sec15;

public class SingletonExample {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);

        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2);
        System.out.println(Singleton.getInstance());
    }
}
