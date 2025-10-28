package ch13.sec02.exam02;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();

        list.add("가");
        list.add("나");
        list.add("다");
        list.add("라");
        list.add("마");

        System.out.println(list.size());

        String item = list.get(2);
        System.out.println("item: " + item); // item: 다

        list.add(2, "카");

        String lastValue = list.pop(); // 사이즈는 한 칸 작아지게
        System.out.println("lastValue: " + lastValue);

        System.out.println(list); // [가, 나, 카, 다, 라]
    }
}
