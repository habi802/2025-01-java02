package ch15;

import blackjack.Card;

import java.util.*;

public class ArrayListStudy {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        //List<String> list = new ArrayList<>(); // 다형성 - 오로지 상속 관계만 가능
        // <String> 제네릭 (Generic), 제한을 건다.
        // 제한의 의미는 오로지 String 객체 주소값만 담을 수 있는 컬렉션
        Card card = new Card("", "");
        //list.add(card); 담기지 않는다.
        System.out.println("list.size(): " + list.size());
        list.add("가"); // 0번 방에 "가" 주소값 들어간다.
        list.add("나"); // 1번 방에 "나" 주소값 들어간다.
        System.out.println("list.size(): " + list.size());
        System.out.println("list.get(0): " + list.get(0));
        System.out.println("list.get(1): " + list.get(1));
    }
}
