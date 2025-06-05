package ch04.sec04.method;

import ch03.sec11.ScoreMethodExample;

public class Mission03Method {
    public static void main(String[] args) {
        int star = ScoreMethodExample.getRandomValue(3, 7);
        System.out.println("star: " + star);

        // 콘솔에 출력
        // 5였다면 ***** (개행)
        // 3이라면 *** (개행)
        printSingleLine(star);

        System.out.println();

        printMultiLine(4);
        //****
        //****
        //****
        //****

        System.out.println();

        printMultiLine(6);
        //******
        //******
        //******
        //******
        //******
        //******

        System.out.println();

        printMultiLine(star);

        System.out.println();

        printTriangleLine(star);
        //*
        //**
        //***
        //****
    }

    public static void printSingleLine(int star) {
        for (int i = 0; i < star; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printMultiLine(int star) {
        for (int i = 0; i < star; i++) {
//            for (int k = 0; k < star; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
            printSingleLine(star);
        }
    }

    public static void printTriangleLine(int star) {
        for (int i = 0; i < star; i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
