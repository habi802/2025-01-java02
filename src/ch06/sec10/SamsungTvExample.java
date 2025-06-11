package ch06.sec10;

public class SamsungTvExample {
    public static void main(String[] args) {
        SamsungTv.brand = "samsung";

        SamsungTv tv1 = new SamsungTv();
        tv1.model = "ABC";
        tv1.inch = 65;

        SamsungTv tv2 = new SamsungTv();
        tv2.model = "가나디";
        tv2.inch = 85;
        //tv2.brand = "삼성";

        tv1.printValues();
        tv2.printValues();
    }
}
