package java_studies;

import java.util.Locale;
import java.util.Scanner;

/* Exercise 01 - Write a program to read the measurements of the width and 
length of a rectangular piece of land with one decimal place, as well as the 
value of the meter (m²). Then, the program should show the land area value, 
as well as the land price value.
 */
/**
 *
 * @author Felipe
 */
public class A_Program_MeasurementCalculationReader {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double width = sc.nextInt();
        double length = sc.nextInt();
        double m2 = sc.nextDouble();

        double area = width * length;
        double price = area * m2;

        System.out.println("Area = " + area + "m2");
        System.out.println("Price = $" + price);

        sc.close();

    }

}
