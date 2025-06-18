package ch07.sec07.poly2;

public class Poly2Example {
    public static void main(String[] args) {
        // Buyer 객체화 해주셈
        Buyer buyer = new Buyer();
//        Tv tv = new Tv();
//        buyer.buy(tv);
//        buyer.buy(tv);
//        buyer.buy(tv);
        buyer.buy(new Tv());
        buyer.buy(new Tv());
        buyer.buy(new Tv());
        buyer.buy(new Tv());
        buyer.buy(new Computer());
        buyer.buy(new Computer());
        buyer.buy(new Computer());
        buyer.buy(new Computer());

        System.out.println("잔액: " + buyer.getMoney());
        System.out.println("뽀나스: " + buyer.getBounsPoint());
    }
}
