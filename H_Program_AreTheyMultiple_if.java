package java_studies;

import java.util.Scanner;

/* Exercise 08 - Read 2 integer values (A and B). Afterwards, the program 
should display a message "They are multiple" or "They are not Multiples", 
indicating whether the values read are multiples of each other. Attention: the 
numbers must be able to be typed in ascending or descending order.*/

/**
 *
 * @author Felipe
 */

public class H_Program_AreTheyMultiple_if {

    public static void main(String[] args) {

        System.out.println("Choose two numbers: ");

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        if (n1 % n2 == 0 || n2 % n1 == 0) {
            System.out.println("They are multiple.");
        } else {
            System.out.println("They aren't multiple.");
        }

        sc.close();

    }
}
