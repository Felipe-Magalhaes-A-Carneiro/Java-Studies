/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_studies;

import java.util.Scanner;
/*Exercise 12*/

/**
 *
 * @author Felipe
 */
public class I_Program_WhatTimeIsIt_if {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("What time is it?");

        int time = sc.nextInt();

        if (time < 12) {
            System.out.println("Good morning!");

        } else if (time < 18) {
            System.out.println("Good afternoon!");

        } else {
            System.out.println("Good evening!");
        }

        sc.close();
    }
}
