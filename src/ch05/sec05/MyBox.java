package ch05.sec05;

public class MyBox {
    private int num;
    public MyBox(int num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { return true; }
        else if (obj == null || !(obj instanceof MyBox)) { return false; }

        MyBox another = (MyBox) obj;
        return num == another.num;
    }
}
