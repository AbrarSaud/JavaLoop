# Exercise (Loop) 
This repository has Exercises ( Loop ) questions with code solutions .

---
## Question 1
Write a program that prints the numbers from 1 to 100 such that:
<p>-If the number is a multiple of 3, you need to print "Fizz" instead of that
number. </p>
<p>-If the number is a multiple of 5, you need to print "Buzz" instead of that
number.</p>
<p>-If the number is a multiple of both 3 and 5, you need to print "FizzBuzz"
instead of that number.</p>

```java
         System.out.println("--- \"Fizz\" or \"Buzz\" ---");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }    
```
## Question 2
Write a Java program to reverse a string.
<p> <b>Test Data:</b>  </p>
  <p>Input a string: The quick brown fox </p>
  Expected Output: Reverse
string: xof nworb kciuq ehT 

```java
        System.out.println("--- Reverse a String ---");
        System.out.print("Please enter string: ");
        String str = input.nextLine();
        String reversed = ""; 
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }
        System.out.println("Reversed string: " + reversed);  
```
## Question 3
Write a program to find the factorial value of any number entered
through the keyboard. 
```java
        System.out.println("--- Factorial Value ---");
        System.out.print("Please enter number : ");
        int num = input.nextInt();
        int n = 1;
        int result_f = 1;
        while (n <= num) {
            result_f *= n;
            n++; 
        }
        System.out.println("the factorial of " + num + " is " + result_f);  
```
## Question 4
Two numbers are entered through the keyboard. Write a program to find
the value of one number raised to the power of another.<b> (Do not use Java
built-in method)</b> 
```java
        System.out.println("--- Powers ---");
        System.out.print("Please enter base: ");
        int base = input.nextInt();
        System.out.print("Please enter power: ");
        int power = input.nextInt();
        int result_p = 1;
        while (power > 0) {
            result_p = result_p * base;
            power--;  
        }
        System.out.println("the result :" + result_p);     
```
## Question 5
Write a program that reads a set of integers, and then prints the sum of
the even and odd integers. 
```java
       int number;
        int evenSum = 0, oddSum = 0;
        System.out.println("--- even or  odd number ---");
        do {
            System.out.print("Please enter  number  or 0 to exit : ");
            number = input.nextInt();
            if (number % 2 == 0) {
                evenSum += number;  
            } else {   
                oddSum += number; 
            }
        } while (number != 0);
        System.out.println(" The  sum of even number: " + evenSum);
        System.out.println(" The sum of odd number : " + oddSum);   
```
## Question 6
Write a program that prompts the user to input a positive integer. It
should then output a message indicating whether the number is a prime
number. 
```java
        System.out.println("--- Prime Check ---");
        System.out.print("Please enter a positive integer: ");
        int numPrime = input.nextInt();
        if (numPrime <= 1) {
            System.out.println(numPrime + " is NOT  prime number.");
        } else {
            boolean isPrime = true; 
            for (int i = 2; i < numPrime; i++) {
                if (numPrime % i == 0) { 
                    isPrime = false; 
                    break; // Stop checking
                }
            }
            if (isPrime) {
                System.out.println(numPrime + " is a Prime  number.");
            } else {
                System.out.println(numPrime + " is NOT a prime number.");
            }
        }

```
## Question 7
Use a for loop to print headings for four weeks <b>(Weeks 1 - 4)</b>.Then use
another for loop to print the days <b>(Days 1 -7)</b> for each week. 
```java
        System.out.println("--- Week and Day ---");
        for (int week = 1; week <= 4; week++) {
            System.out.println("Week " + week + ":"); 
            for (int day = 1; day <= 7; day++) {
                System.out.println("  Day " + day + " ."); 
            }
            System.out.println();
        }   
```
## Question 8
Write a program thats check if the word is a palindrome or not.
<p><b>hint: A</b> string is said to be a palindrome if it is the same if we start reading it from
left to right or right to left. </p>

```java
        System.out.println("--- Palindrome Checker ---");
        System.out.print("Please enter a word: ");
        input.nextLine();
        String word = input.nextLine();
        String reversedWord = ""; 
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord = reversedWord + word.charAt(i);
        }
        if (word.equalsIgnoreCase(reversedWord)) {
            System.out.println(word + " is  palindrome.");
        } else {
            System.out.println(word + " is NOT  palindrome.");
        }
     
```
