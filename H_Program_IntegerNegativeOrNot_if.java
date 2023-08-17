package java_studies;

import java.util.Scanner;

/* Exercise 11 - Make a program to read an integer, and then say if this number is negative 
or not.*/

/**
 *
 * @author Felipe
 */
public class H_Program_IntegerNegativeOrNot_if {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a number:");

        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("It isn't negative.");
        } else {
            System.out.println("It is negative.");
        }

        sc.close();

    }

}
