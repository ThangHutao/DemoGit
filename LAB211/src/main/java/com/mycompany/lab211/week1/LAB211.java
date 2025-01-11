package com.mycompany.lab211.week1;

import java.util.Map;
import java.util.Scanner;

public class LAB211 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WordCounter wordCounter = null;

        while (true) {
            System.out.println("===== Word and Character Counter Menu =====");
            System.out.println("1. Input a string");
            System.out.println("2. Count words");
            System.out.println("3. Count characters");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    System.out.print("Enter your content: ");
                    String input = scanner.nextLine();
                    wordCounter = new WordCounter(input);
                    System.out.println("Input has been set.");
                    break;

                case 2:
                    if (wordCounter == null) {
                        System.out.println("Please input a string first (Option 1).");
                    } else {
                        Map<String, Integer> wordCount = wordCounter.countWord();
                        System.out.println("Word Count: " + wordCount);
                    }
                    break;

                case 3:
                    if (wordCounter == null) {
                        System.out.println("Please input a string first (Option 1).");
                    } else {
                        Map<Character, Integer> charCount = wordCounter.countCharacter();
                        System.out.println("Character Count: " + charCount);
                    }
                    break;

                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
