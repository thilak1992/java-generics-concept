package com.bridgelabz;

import java.util.Scanner;

public class JavaGenerics {
    public static <T extends Comparable<T>> T findMax(T a, T b, T c) {

        T max = a;

        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        UC1_Maximum mx = new UC1_Maximum();
        System.out.println("Welcome to Generic Practice Problem");
        mx.findMaxInteger();

    }

    public void findMaxInteger() {
        UC1_Maximum mx = new UC1_Maximum();
        System.out.println("Enter 3 integer numbers: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        System.out.println("Maximum integer number is: " + mx.findMax(num1, num2, num3));
    }

}
