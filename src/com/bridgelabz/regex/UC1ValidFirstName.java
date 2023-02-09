package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class UC1ValidFirstName {
    static Pattern pattern = Pattern.compile("^([A-Z]?[a-z]{3,})$");
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        // Method To Check First Name With Regex Start With Cap And 3 Min. Character
        System.out.println("Enter the first Name: ");
        String firstName = scan.nextLine();

        if(Pattern.matches("^[A-Z][a-z]{2,}", firstName))
            System.out.println("First name is valid");
        else
            System.out.println("Entered first name is invalid");
    }
}
