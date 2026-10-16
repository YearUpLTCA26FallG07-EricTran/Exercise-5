package com.pluralsight;
import java.util.Scanner;

public class grosspay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Name
        System.out.println("Enter your name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter hours worked: ");
        float hoursWorked = scanner.nextFloat();

        System.out.println("Enter your pay rate: ");
        float payrate = scanner.nextFloat();

        double grossPay = (hoursWorked * payrate);
        System.out.println(firstName + " has a total gross pay of: " + grossPay);

    }
}
