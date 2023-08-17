/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_studies;

import java.util.Scanner;

/*Exercise 13 - Exercise Based on the table below, write a program that reads 
the code of an item and the quantity of this item. A Next, calculate and 
display the amount of the account payable.
Hot Dog - $4.00; 
X - salad - $4.50; 
X - Bacon - $5.00; 
Plain Toast - $2.00; 
Soda - $1.50*/

/**
 *
 * @author Felipe
 */
public class J_Program_ProductsToBePaid_2_if {

    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What is the product code?");
        int code = sc.nextInt();
        System.out.println("Choose quantity: ");
        int amount = sc.nextInt();
        
        double total;
        
        if (code == 1){
            total = amount * 4.0;
        } else if (code == 2){
            total = amount * 4.5;
        } else if (code == 3){
            total = amount * 5.0;
        } else if (code == 4){
            total = amount * 2.0;
        } else {
            total = amount * 1.5;
        }
        
        System.out.println("Total: $" + total);
        
        sc.close();
        
    }
}
