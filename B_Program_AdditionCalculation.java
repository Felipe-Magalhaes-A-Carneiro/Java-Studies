package java_studies;

import java.util.Scanner;

/*Exercise 02 - Make a program to read two integer values, and then show on the 
screen the sum of these numbers with an explanatory message, as examples.*/

/**
 *
 * @author Felipe
 */
public class B_Program_AdditionCalculation {
     
    public static void main(String[] args) {
    
     Scanner sc = new Scanner(System.in);
     
     int n1 = sc.nextInt();
     int n2 = sc.nextInt();
     
     int addition = n1 + n2;
     
     
     System.out.println("Result = " + addition);
    
    sc.close();
         
    }
    
}