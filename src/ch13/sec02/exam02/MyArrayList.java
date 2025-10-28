package ch13.sec02.exam02;

public class MyArrayList<T> {
    private T[] arr;

    public MyArrayList() {
        this.arr = (T[]) new Object[0];
    }

    public int size() {
        return this.arr.length;
    }

    public void add(T item) {
        T[] temp = (T[]) new Object[this.size() + 1];
        temp[this.size()] = item;

        for (int i = 0; i < this.size(); i++) {
            temp[i] = this.arr[i];
        }

        this.arr = temp;
    }

    public void add(int index, T item) {
        T[] temp = (T[]) new Object[this.size() + 1];
        temp[index] = item;

        for (int i = 0; i < index; i++) {
            temp[i] = this.arr[i];
        }
        for (int i = index; i < this.size(); i++) {
            temp[i + 1] = this.arr[i];
        }

        this.arr = temp;
    }

    public T get(int index) {
        return this.arr[index];
    }

    public T pop() {
        T lastValue = this.arr[this.size() - 1];

        T[] temp = (T[]) new Object[this.size() - 1];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = this.arr[i];
        }

        this.arr = temp;

        return lastValue;
    }

    @Override
    public String toString() {
        String result = "[";

        for (int i = 0; i < this.size(); i++) {
            result += this.get(i);
            if (i != this.size() - 1) {
                result += ", ";
            }
        }

        result += "]";

        return result;
    }
}
