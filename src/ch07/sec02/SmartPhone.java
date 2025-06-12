package ch07.sec02;

public class SmartPhone extends Phone {
    private boolean wifi;

//    public SmartPhone() {
//        //super();
//        super("", "");
//    }

    public SmartPhone(String model, String color) {
        //super();
        super(model, color);
        System.out.println("SmartPhone 생성자 호출!!");
//        this.model = model;
//        this.color = color;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public void internet() {
        System.out.println("인터넷에 연결합니다.");
    }

    public void bell() {
        System.out.println("스마트폰이 울린다!!");
    }
}
