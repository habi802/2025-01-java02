package ch15;

import java.util.Arrays;

public class MyArrayList {
    private String[] arr = new String[0];

    public int size() {
        return this.arr.length;
    }

    public void add(String item) {
        String[] temp = new String[this.size() + 1];
        temp[this.size()] = item;

        // 기존값 복사
        for (int i = 0; i < this.size(); i++) {
            temp[i] = this.arr[i];
        }

        this.arr = temp;
    }

    public void add(int index, String item) {
        String[] temp = new String[this.size() + 1];
        temp[index] = item;

        for (int i = 0; i < this.size(); i++) {
            temp[i < index ? i : i + 1] = arr[i];
        }

        this.arr = temp;
    }

    public String remove() {
        String[] temp = new String[this.size() - 1];
        String str = this.arr[temp.length];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = this.arr[i];
        }

        this.arr = temp;

        return str;
    }

    public String remove(int index) {
        String[] temp = new String[this.size() - 1];
        String str = this.arr[index];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = this.arr[i < index ? i : i + 1];
        }

        this.arr = temp;

        return str;
    }

    public String get(int index) {
        return this.arr[index];
    }

    public void checkValues() {
        System.out.println(Arrays.toString(this.arr));
    }
}
