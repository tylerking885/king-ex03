/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution 03
 * Copyright 2021 Tyler King
 */

import java.util.Scanner;                                   // Import declaration for class scanner;

public class Solution03 {
    public static void main(String[] args) {                // Main method;
        String quote, author;                               // Declare String variables (quote and author);
        Scanner input = new Scanner(System.in);             // Enable program to read User data;
        System.out.print("What is the quote? ");            // Prompt user for a string variable (a quote);
        quote = input.nextLine();                           // Set string variable quote to user's input;
        quote = "\"" + quote + "\"";                        // Update user's quote with quotation marks;
        System.out.print("Who said it? ");                  // Prompt user for the author of the quote;
        author = input.nextLine();                          // Set string variable author to user's input;
        System.out.print(author + " says, " + quote);       // Print out author and quote in a message to user;
    }
}
