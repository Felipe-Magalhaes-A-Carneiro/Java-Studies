package java_studies;

import java.util.Scanner;

/* Exercise 06 - Make a program to read the code of an product 1, the number of 
product 1, the unit value of each product 1, the code of an product 2, the 
product number 2 and the unit value of each product 2. Calculate and show the 
amount to be paid.
 */

/**
 *
 * @author Felipe
 */
public class F_Program_ProductsToBePaid {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int productCod1 = sc.nextInt();
        int productNum1 = sc.nextInt();
        double productPrice1 = sc.nextDouble();

        int productCod2 = sc.nextInt();
        int productNum2 = sc.nextInt();
        double productPrice2 = sc.nextDouble();

        double product1Total = productNum1 * productPrice1;
        double product2Total = productNum2 * productPrice2;

        double bePaid = product1Total + product2Total;

        System.out.println("The amount to be paid: $" + bePaid);

        sc.close();

    }
}
