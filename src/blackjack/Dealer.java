package blackjack;

public class Dealer extends Gamer {
    private final static int CAN_RECEIVE_POINT = 16; // 매직 넘버

    public boolean needMoreCard() {
        // 딜러가 가지고 있는 카드의 총 점수가 16점 이하면 true 리턴,
        // 17점 이상이면 false 리턴
        if (Rule.getScore(this.openCards()) <= CAN_RECEIVE_POINT) {
            return true;
        }

        return false;
    }
}
