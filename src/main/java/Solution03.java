/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Tyler King
 */

import java.util.Scanner;

public class Solution03 {
    public static void main(String[] args) {
        String quote, author;
        Scanner input = new Scanner(System.in);
        System.out.print("What is the quote? ");
        quote = input.nextLine();
        quote = "\"" + quote + "\"";
        System.out.print("Who said it? ");
        author = input.nextLine();
        System.out.print(author + " says, " + quote);
    }
}
