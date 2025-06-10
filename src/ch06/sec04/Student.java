package ch06.sec04;

public class Student {
    //private String name;
    String name;

    public Student() {
        System.out.println("기본 생성자 호출!");
    }

    void introduce() {
        int num;
        System.out.printf("안녕 내 이름은 %s이라고 해\n", this.name);
    }
}
