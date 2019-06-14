/*
Write an application that will show a list of numbers and indicate whether or
not they are prime. There are two ways that you can achieve this.

Option 1: Enter a number
The user will have to input a number, and you will that number.
You will check if that number is prime and indicate that to the user.

Option 2: Generate a random number
 */

import java.util.Random;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to generate a random number ? (Y/N");
        String userResponse = sc.next();
        Random rnd = new Random();
        if (userResponse.equalsIgnoreCase("y")) {
            for (int a = 1; a <= 250; ++a) {
                int randomInt = 1 + rnd.nextInt(a);
                boolean isPrime = true;
                if (randomInt == 1) {
                    System.out.println(randomInt + " is neither a prime nor composite");
                } else {
                    for (int i = 2; i <= randomInt / 2; i++) {
                        temp = randomInt % i;
                        if (temp == 0) {
                            isPrime = false;
                        }
                    }
                    if (isPrime) {
                        System.out.println(randomInt + " entered number  is prime");
                    } else {
                        System.out.println(randomInt + " is not a prime number");
                    }
                }
            }
        } else {
            System.out.println("Enter the number to check: ");
            int number = sc.nextInt();
            boolean isPrime = true;
            if (number == 1) {
                System.out.println(number + " is neither a prime nor composite");
            } else {
                for (int i = 2; i <= number / 2; i++) {
                    temp = number % i;
                    if (temp == 0) {
                        isPrime = false;
                    }
                }
                if (isPrime) {
                    System.out.println(number + " is a prime number");
                } else {
                    System.out.println(number + " is not a prime number");
                }
            }
        }
    }

    private static void output(String aMessage) {
        System.out.println(aMessage);
    }
}

