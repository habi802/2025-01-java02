package ch07.sec07.poly2;

public abstract class Product {
    // 제품의 가격 정보를 저장할 수 있다. (price)
    // 제품 구매 시 제공하는 보너스 점수 저장할 수 있다. (bonusPoint)
    // 캡슐화, immutable 을 하거라
    // 외부에 값을 보내줄 수 있다.
    // Product는 객체화 금지
    private final int price; // 단위는 만원 단위
    private final int bonusPoint;

    public Product(int price) {
        this.price = price;
        this.bonusPoint = (int)(price * 0.1); // 가격의 10%
    }

    public int getPrice() {
        return this.price;
    }

    public int getBounsPoint() {
        return this.bonusPoint;
    }
}
