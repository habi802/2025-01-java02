package blackjack;

import java.util.ArrayList;
import java.util.List;

public class Gamer {
    private List<Card> cards = new ArrayList<>();

    public void receiveCard(Card card) {
        cards.add(card);
    }

    public List<Card> openCards() {
        return this.cards;
    }

    public void showCards() {
        for (int i = 0; i < cards.size(); i++) {
            Card card = cards.get(i);
            System.out.println(card);
        }
    }
}
