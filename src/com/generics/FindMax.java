package com.generics;

import java.util.Scanner;

/*Given 3 integer find the maximum*/
public class FindMax {

    public static void compareTo(Integer a, Integer b, Integer c) {
        int max = a;

        if (b.compareTo(max)> 0) {
            max = b;

            if (c.compareTo(max) > 0)
                max = c;

            System.out.println("The maximum number is:" + max);
        }
    }

    public static void main(String[] args) {

        Integer a, b, c;

        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the value of a");
        a = sn.nextInt();
        System.out.println("Enter the value of b");
         b = sn.nextInt();
        System.out.println("Enter the value of c");
        c = sn.nextInt();

        compareTo(a, b, c);

    }

}