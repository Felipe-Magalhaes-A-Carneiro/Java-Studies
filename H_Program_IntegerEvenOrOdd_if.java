package java_studies;

import java.util.Scanner;

/* Exercise 10 - Write a program to read an integer and say whether this number 
is even or odd*/

/**
 *
 * @author Felipe
 */
public class H_Program_IntegerEvenOrOdd_if {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a number: ");

        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even.");
        } else {
            System.out.println("Odd.");
        }

        sc.close();

    }

}
