import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
/*    Q1 .Write a program that prints the numbers from 1 to 100 such that:
    If the number is a multiple of 3, you need to print "Fizz" instead of that number */
        System.out.println("*************************");
        System.out.println("--- \"Fizz\" or \"Buzz\" ---");
//      This is a 'for' loop that starts from 1 to 100
        for (int i = 1; i <= 100; i++) {
//      This 'if' condition checks if the number(i) is  multiple of both 3 and 5 --> If true, it prints "FizzBuzz"
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
//      This 'if' condition checks if the number(i) is  multiple of  3  --> If true, it prints "Fizz"
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
//      This 'if' condition checks if the number(i) is  multiple of  5  --> If true, it prints "Fizz"
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
//      This 'else'  prints the numbers that are not  multiple of  3 and 5.
            } else {
                System.out.println(i);
            }
        }
////      Q2 Write a Java program to reverse a string.
        System.out.println("*************************");
        System.out.println("--- Reverse a String ---");
        System.out.print("Please enter string: ");
        String str = input.nextLine();
        String reversed = ""; // This lien used to store the reversed version of the string.
//      This 'for' loop starts from the end of the string and moves backward to the beginning.
        for (int i = str.length() - 1; i >= 0; i--) {
//      In each loop, we add the current letter (str.charAt(i)) to  'reversed' string.
            reversed = reversed + str.charAt(i);
        }
//      After the loop done, prints the reversed string.
        System.out.println("Reversed string: " + reversed);
////       Q3 Write a program to find the factorial value of any number entered through  keyboard.
        System.out.println("*************************");
        System.out.println("--- Factorial Value ---");
        System.out.print("Please enter number : ");
        int num = input.nextInt();
        int n = 1;
        int result_f = 1;
//      This is a 'while' loop that runs 'n' is less than or equal to 'num'.
        while (n <= num) {
            result_f *= n;//  'result' * 'n' in each loop to calculate the factorial.
            n++; // Increases 1
        }
        System.out.println("the factorial of " + num + " is " + result_f);
////     Q4 Write a program to find the value of one number raised to the power of another.
        System.out.println("*************************");
        System.out.println("--- Powers ---");
        System.out.print("Please enter base: ");
        int base = input.nextInt();
        System.out.print("Please enter power: ");
        int power = input.nextInt();
        int result_p = 1;
//      This loop runs as long as the power is greater than 0.
        while (power > 0) {
//      In each loop, it multiplies the current "result_p" by the base number.
            result_p = result_p * base;
            power--;   // Decreases  1
        }
        System.out.println("the result :" + result_p);
////        Q5  Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
        int number;
        int evenSum = 0, oddSum = 0;
        System.out.println("*************************");
        System.out.println("--- even or  odd number ---");
        do {
            System.out.print("Please enter  number  or 0 to exit : ");
            number = input.nextInt();
            // Checks if the number is even .
            if (number % 2 == 0) {
                evenSum += number;  // Add the even number to  "evenSum".
            } else {   // If the number is not even,number is odd.
                oddSum += number; // Add the even number to  "oddSum".
            }
        } while (number != 0);
        // Displays the  sum of even numbers and odd.
        System.out.println(" The  sum of even number: " + evenSum);
        System.out.println(" The sum of odd number : " + oddSum);
/*        Q6 Write a program that prompts the user to input a positive integer. It
        should then output a message indicating whether the number is a prime number. */
        System.out.println("*************************");
        System.out.println("--- Prime Check ---");
        System.out.print("Please enter a positive integer: ");
        int numPrime = input.nextInt();
        // Check if the number is less than or equal to 1. If true, numbers 0 and 1 are NOT prime numbers.
        if (numPrime <= 1) {
            System.out.println(numPrime + " is NOT  prime number.");
        } else {
            boolean isPrime = true; // // We start thinking the number is prime.
            // Check numbers from 2
            for (int i = 2; i < numPrime; i++) {
                if (numPrime % i == 0) { // If numPrime can be %  "i" with no remainder(0).
                    isPrime = false; // / is NOT a prime number
                    break; // Stop checking
                }
            }
            if (isPrime) {
                System.out.println(numPrime + " is a Prime  number.");
            } else {
                System.out.println(numPrime + " is NOT a prime number.");
            }
        }
/*       Q7 Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use
         another for loop to print the days (Days 1 -7) for each week. */
        System.out.println("*************************");
        System.out.println("--- Week and Day ---");
//       This is loop for weeks (1 to 4)
        for (int week = 1; week <= 4; week++) {
            System.out.println("Week " + week + ":"); // Print week number
//         This loop for days (1 to 7)
            for (int day = 1; day <= 7; day++) {
                System.out.println("  Day " + day + " ."); // Print day numbe
            }
            System.out.println();
        }
////     Q8 Write a program thas check if the word is a palindrome or not.
        System.out.println("*************************");
        System.out.println("--- Palindrome Checker ---");
        System.out.print("Please enter a word: ");
        input.nextLine();
        String word = input.nextLine();
        String reversedWord = ""; // // This lien used to store the reversed version of the string.
//      This 'for' loop starts from the end of the string and moves backward to the beginning.
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord = reversedWord + word.charAt(i);
        }
        // Check if "word" is the same as the reversed word (palindrome)
        if (word.equalsIgnoreCase(reversedWord)) {
            System.out.println(word + " is  palindrome.");
        } else {
            System.out.println(word + " is NOT  palindrome.");
        }
    }
}