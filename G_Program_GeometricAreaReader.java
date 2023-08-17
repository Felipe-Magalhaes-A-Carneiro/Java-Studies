package java_studies;

import java.util.Scanner;

/* Exercise 07 - Make a program that reads three values with double precision floating point:
A, B, and C. Then calculate and show:

a) Find the area of the right triangle that has A as its base and C as its height.
b) the area of the circle of radius C. (pi = 3.14159)
c) an area of the trapezoid that has A and B for bases and C for height.
d) the area of the square that has side B.
e) the area of the rectangle that has sides A and B.
 */

/**
 *
 * @author Felipe
 */
public class G_Program_GeometricAreaReader {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float A = sc.nextFloat();
        float B = sc.nextFloat();
        float C = sc.nextFloat();

        float tri = (A * C) / 2;
        float cir = (float) (3.14159 * (C * C));
        float trap = ((A + B) * C) / 2;
        float squa = B * B;
        float rect = A * B;

        System.out.println("Triangle: " + tri);
        System.out.println("Circle: " + cir);
        System.out.println("Trapezoid: " + trap);
        System.out.println("Square: " + squa);
        System.out.println("Rectangle: " + rect);
        
        
        sc.close();

    }

}
