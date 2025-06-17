package ch15;

public class MyArrayListExample {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        int length = list.size();
        System.out.println("length: " + length);
        list.checkValues();
        list.add("가");
        list.checkValues();
        list.add("나");
        list.checkValues();

        String str = list.get(0);
        System.out.println("list.get(0): " + str);
        System.out.println("list.get(1): " + list.get(1));
        list.add("다");
        list.add("라");
        list.checkValues();
        list.add(1, "크");
        list.checkValues();

        String str2 = list.remove();
        System.out.println("str2: " + str2); // 라
        list.checkValues(); // [가, 크, 나, 다]

        String str3 = list.remove(1);
        System.out.println("str3: " + str3); // 크
        list.checkValues(); // [가, 나, 다]
    }
}
