package ch07.sec07.poly2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Buyer2 {
    private int money;
    private int bonusPoint;
    private List<Product> purchasedProduct = new ArrayList<>();
    private Map<String, Integer> purchasedProductList = new HashMap<>();

    public Buyer2() {
        this.money = 1000;
        this.bonusPoint = 0;
    }

    public void buy(Product product) {
        if (this.money < product.getPrice()) {
            System.out.println("잔액이 부족합니다.");
            return;
        }

        this.money -= product.getPrice();
        this.bonusPoint += product.getBounsPoint();
        this.purchasedProduct.add(product);
        if (this.purchasedProductList.get(product.toString()) != null) {
            this.purchasedProductList.put(product.toString(), this.purchasedProductList.get(product.toString()) + 1);
        } else {
            this.purchasedProductList.put(product.toString(), 1);
        }
        System.out.println(product + "을/를 구입하였습니다.");
    }

    public int getMoney() {
        return this.money;
    }

    public int getBonusPoint() {
        return this.bonusPoint;
    }

    public void printPurchasedList() {
        String purchasedList = "";

        for (int i = 0; i < this.purchasedProduct.size(); i++) {
            purchasedList += this.purchasedProduct.get(i).toString();
            if (i != this.purchasedProduct.size() - 1) {
                purchasedList += ", ";
            }
        }

        System.out.println(purchasedList);
    }

    public void printPurchasedProduct() {
        int index = 0;
        for (String key : this.purchasedProductList.keySet()) {
            System.out.printf("%s %d대", key, this.purchasedProductList.get(key));
            index++;
            if (index != this.purchasedProductList.size()) {
                System.out.print(", ");
            }
        }
    }
}
