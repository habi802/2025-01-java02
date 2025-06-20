package control.ioc;

import control.Tv;

public class Test {
    public static void main(String[] args) {
        TvFactory tvFactory = TvFactory.getInstance();

        //TvFactory tvFactory1 = new TvFactory(); // 막아라!
        Tv tv = tvFactory.factory(args[0], args[1]);
        tv.sound();
    }
}
