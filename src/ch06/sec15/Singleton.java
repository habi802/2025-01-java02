package ch06.sec15;

public class Singleton {
    private String name;

    private Singleton() {}

    private static Singleton singleton = null;
    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printMyName() {
        System.out.println("내 이름은 " + name + " 입니다!");
    }
}
