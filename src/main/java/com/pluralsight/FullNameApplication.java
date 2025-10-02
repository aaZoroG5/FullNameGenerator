package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    //creating a scanner using the static modifier makes it more flexible to use throughout the program
    public static Scanner nameScanner = new Scanner(System.in);

    public static void main(String[] args) {

        //print enter name
        System.out.print("Please enter your name");

        System.out.println();

        //ask the user for their first name
        System.out.print("First name: ");
        String firstName = nameScanner.nextLine().trim();

        //ask the user for their middle name
        System.out.print("Middle initial: ");
        String middleInitial = nameScanner.nextLine().trim();

        //ask the user for their last name
        System.out.print("Last name: ");
        String lastName = nameScanner.nextLine().trim();

        //ask the user for their suffix
        System.out.print("Suffix: ");
        String suffix = nameScanner.nextLine().trim();

        //create an if statement that goes through each scenario of inputs
        if(!middleInitial.isEmpty() && !suffix.isEmpty()){//we used the .isempty method to check if the inputs are empty
            System.out.println(firstName + " " + middleInitial + " " + lastName + "," + suffix);
        }
        else if(!middleInitial.isEmpty()){
            System.out.println(firstName + " " + middleInitial + " " + lastName);
        }
        else if(!suffix.isEmpty()){
            System.out.println(formatName(firstName, lastName) + ", " + suffix);
        }
        else{
            System.out.println(formatName(firstName, lastName));
        }

    }
    //create a method that calls first and last name
    static String formatName(String firstName, String lastName) {
        return firstName + " " + lastName;

    }
}
