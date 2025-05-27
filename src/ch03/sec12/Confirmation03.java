package ch03.sec12;

public class Confirmation03 {
    public static void main(String[] args) {
        int penciles = 534;
        int sutdents = 30;

        int pencilesPerStudent = penciles / sutdents;
        System.out.println(pencilesPerStudent);

        int pencilesLeft = penciles % sutdents;
        System.out.println(pencilesLeft);
    }
}
