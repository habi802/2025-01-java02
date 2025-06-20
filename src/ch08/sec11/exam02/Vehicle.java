package ch08.sec11.exam02;

/*
    인터페이스는 인스턴스 멤버 필드를 가질 수 없다.
    static final 멤버 필드는 가질 수 있다.

    무조건 추상 메소드만 가질 수 있다.
    public abstract 생략 가능. 생략하면 자동으로 붙는다.

    인터페이스가 인터페이스를 상속 받을 땐 extends 사용
    인터페이스는 클래스를 상속 받을 수 없다.
    클래스가 인터페이스를 상속 받을 땐 implements 사용
 */

// 운송 수단
public interface Vehicle {
    void run();
    void stop();
}
