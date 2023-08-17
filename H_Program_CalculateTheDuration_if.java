package java_studies;

import java.util.Scanner;

/* Exercise 09 - Read the start time and end time of a game. Then calculate the 
duration of the game, knowing that it can start on one day and end on another, 
with a minimum duration of 1 hour and a maximum duration of 24 hours.*/
/**
 *
 * @author Felipe
 */
public class H_Program_CalculateTheDuration_if {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("When did the game start?");

        int time1 = sc.nextInt();

        System.out.println("When did the game finished?");

        int time2 = sc.nextInt();

        int duration;

        if (time1 < time2) {
            duration = time1 - time2;
        } else {
            duration = 24 - time1 + time2;
        }

        System.out.println("The game lasted " + duration + " hours.");

        sc.close();

    }
}
