package blackjack;

public class CardDeck {
    private String[] patterns = { "Spade", "Heart", "Dimanond", "Clover" };
    private Card[] cards = new Card[52]; // Card 객체 52개의 주소값을 저장한 친구한테 접근할 수 있다.
    private int selectedIdx = 0;

    // 기본 생성자 작성
    public CardDeck() {
        // 모든 방에 모두 다른 주소값을 넣는다.
        // 각 카드가 가지고 있는 값도 모두 달라야 한다.
        // 패턴: Spade, Heart, Diamond, Clover
        // 디놈: A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K
        // 13장 패턴은 모두 Spade
        // 다른 13장 패턴은 모두 Heart

//        for (int i = 0; i < cards.length; i++) {
//            String pattern = "";
//
//            switch (i / 13) {
//                case 0 -> pattern = "Spade";
//                case 1 -> pattern = "Heart";
//                case 2 -> pattern = "Diamond";
//                case 3 -> pattern = "Clover";
//            }
//
//            int number = i % 13 + 1;
//            String denomination = switch (number) {
//                case 1 -> "A";
//                case 11 -> "J";
//                case 12 -> "Q";
//                case 13 -> "K";
//                default -> String.valueOf(number);
//            };
//
//            this.cards[i] = new Card(pattern, denomination);
//        }

        int index = 0;
        for (int i = 0; i < patterns.length; i++) {
            for (int k = 1; k <= 13; k++) {
                String denomination = switch (k) {
                    case 1 -> "A";
                    case 11 -> "J";
                    case 12 -> "Q";
                    case 13 -> "K";
                    default -> String.valueOf(k);
                };
                cards[index++] = new Card(patterns[i], denomination);
            }
        }

        shuffle();
    }

    private void shuffle() {
        // 카드 객체 순서 쓰까주세요.
        for (int i = 0; i < cards.length; i++) {
            int r = (int) (Math.random() * cards.length);
            Card temp = cards[i];
            cards[i] = cards[r];
            cards[r] = temp;
        }
    }

    public void printAllCards() {
        for (Card card : cards) {
            //System.out.printf("%s (%s)\n", card.getPattern(), card.getDenomination());
            System.out.println(card);
        }
    }

    public Card getCard() {
        if (selectedIdx == cards.length) {
            return null;
        }
        Card c = cards[selectedIdx];
        cards[selectedIdx++] = null;
        return c;
    }

    @Override // 애노테이션
    public String toString() {
        return "나는 카드덱이야";
    }
}
