package ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        child.method1();
        child.method2();
        child.method3();

        Parent parent = child;
        // 타입은 알고 있는 메소드만 호출할 수 있다.
        parent.method1();
        parent.method2();
        //parent.method3(); // 호출할 수 없다.

        // method3() 메소드를 호출하고 싶다면??? 어떻게 해야할까???
        // method3() 메소드를 알고 있는 타입으로 형변환 해주면 된다.
        Child child2 = (Child) parent;
        child2.method3();
    }
}
