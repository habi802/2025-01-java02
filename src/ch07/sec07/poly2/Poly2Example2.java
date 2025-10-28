package ch07.sec07.poly2;

public class Poly2Example2 {
    public static void main(String[] args) {
        Buyer2 buyer2 = new Buyer2();

        buyer2.buy(new Tv());
        buyer2.buy(new Tv());
        buyer2.buy(new Tv());

        buyer2.buy(new Computer());
        buyer2.buy(new Computer());

        buyer2.buy(new Tv());

        System.out.println("잔액: " + buyer2.getMoney());
        System.out.println("뽀나스: " + buyer2.getBonusPoint());

        buyer2.printPurchasedList(); // Tv, Tv, Computer
        buyer2.printPurchasedProduct(); // Tv 2대, Computer 1대
    }
}
