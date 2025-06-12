package ch07.sec02;

public class Phone {
    private String model;
    private String color;

    //public Phone() {}

    public Phone(String model, String color) {
        //super();
        System.out.println("Phone 생성자 호출!!!!!!!");
        this.model = model;
        this.color = color;
    }

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

    public void bell() {
        System.out.println("벨이 울립니다.");
    }

    public void sendSms(String message) {
        System.out.println("본인: " + message);
    }

    public void recevieSms(String message) {
        System.out.println("상대방: " + message);
    }

    public void hangUp() {
        System.out.println("전화를 끊습니다.");
    }
}
