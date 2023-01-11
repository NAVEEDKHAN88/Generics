package com.generics;

import java.util.Scanner;

/*Given 3 Float find the maximum*/
public class FindMax {

    public static void compareTo(Float a, Float b, Float c) {
        Float max = a;

        if (b.compareTo(max)> 0) {
            max = b;

            if (c.compareTo(max) > 0) {
                max = c;

            }

            System.out.print("The maximum number is:" + max+"\n");
        }
    }

    public static void main(String[] args) {

       while (true){

           float a, b, c;

        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the value of a");
        a = sn.nextFloat();
        System.out.println("Enter the value of b");
         b = sn.nextFloat();
        System.out.println("Enter the value of c");
        c = sn.nextFloat();
        compareTo(a, b, c);

    }

}
}