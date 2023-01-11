package com.generics;

import java.util.Scanner;

/*Purpose to find maximum string among three strings using findMax method*/
public class FindMax {

    public static void compareTo(String a, String b, String c) {
        String max = a;

        if (b.compareTo(max)> 0) {
            max = b;
        }

            if (c.compareTo(max) > 0) {
                max = c;

            }

            System.out.print("The maximum number is:" + max+"\n");
        }


    public static void main(String[] args) {

       while (true){

           String a, b, c;

        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the value of a");
        a = sn.next();
        System.out.println("Enter the value of b");
         b = sn.next();
        System.out.println("Enter the value of c");
        c = sn.next();
        compareTo(a, b, c);

    }

}
}