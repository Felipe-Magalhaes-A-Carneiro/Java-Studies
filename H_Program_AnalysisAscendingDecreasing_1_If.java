/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_studies;

import java.util.Scanner;

/**
 *
 * @author Felipe
 */
public class H_Program_AnalysisAscendingDecreasing_1_If {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        if (X >= 5) {
            System.out.println("Ascending");
        } else {
            System.out.println("Decreasing");
        }

        sc.close();

    }
}
