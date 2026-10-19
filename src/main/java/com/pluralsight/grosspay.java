package com.pluralsight;
import java.util.Scanner;

public class grosspay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Name
        System.out.print("Enter your name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter hours worked: ");
        float hoursWorked = scanner.nextFloat();

        System.out.print("Enter your pay rate: ");
        float payrate = scanner.nextFloat();

        double grossPay = grossPay(hoursWorked, payrate);
        System.out.println(firstName + " has a total gross pay of: " + grossPay);

    }
    public static double grossPay(float hoursWorked, float payrate) {
        return hoursWorked * payrate;

    }

}
