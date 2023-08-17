package java_studies;

import java.util.Scanner;

/* Exercise 03 - Make a program to read the value of the radius of a circle, 
and then print the area value of this circle to four decimal places */

/**
 *
 * @author Felipe
 */
public class C_Program_ReadingRadius {
   
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        
        double radius = sc.nextDouble();
        double area = 3.14159 * (radius * 2);
        
        System.out.println("Area =" + area);
        
        sc.close();
        
        
    }  
    
}    
