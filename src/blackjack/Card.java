package blackjack;

public class Card {
    private String pattern; // 무늬 - Spade, Heart, Clover, Diamond
    private String denomination; // 값 - A, 2, 3, 4, 5, ... 9, 10, J, Q, K

    public Card(String pattern, String denomination) {
        this.pattern = pattern;
        this.denomination = denomination;
    }

    public String getPattern() {
        return this.pattern;
    }

    public String getDenomination() {
        return this.denomination;
    }

    @Override
    public String toString() {
        return this.pattern + " (" + this.denomination + ")";
    }
}
