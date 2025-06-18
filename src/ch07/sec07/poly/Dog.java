package ch07.sec07.poly;

public class Dog extends Animal {
    @Override
    public void crying() {
        System.out.println("저는 개입니다.");
    }

    public void jump() {
        System.out.println("저는 점프를 했습니다.");
    }
}
