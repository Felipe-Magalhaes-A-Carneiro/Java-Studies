package java_studies;

import java.util.Scanner;

/* Exercise 05 - Make a program that reads the number of an employee, his 
number of hours worked, the amount they receive per hour and calculates the
salary of these employees. Next, show the employee's number and salary.
*/
/**
 *
 * @author Felipe
 */
public class E_Program_EmployeesAndSalaries {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int time = sc.nextInt();
        double paymentH = sc.nextDouble();

        double salaries = time * paymentH;

        System.out.println("Number = " + number);
        System.out.println("Salary = $" + salaries);

        sc.close();

    }
}
