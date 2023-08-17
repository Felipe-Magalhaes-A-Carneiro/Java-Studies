package java_studies;

import java.util.Scanner;

/* Exercise 04 - Make a program to read four integer values A, B, C and D. Next,
calculate and show the difference of the product of A and B by the product of C 
and D according to the formula: DIFFERENCE = (A * B - C * D)*/

/**
 *
 * @author Felipe
 */

public class D_Program_ComparisonValues {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        int difference = (A * B - C * D);

        System.out.println("Difference = " + difference);

        sc.close();

    }

}
