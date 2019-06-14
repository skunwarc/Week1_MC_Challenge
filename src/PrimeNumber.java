/*

Write an application that will show a list of numbers and indicate whether or
not they are prime. There are two ways that you can achieve this.
Option 1:The user will have to input a number, and you will that number.
You will check if that number is prime and indicate that to the user.
 */

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check for the prime: ");
        int number = sc.nextInt();
        boolean isPrime =true;
        if(number ==1){
            System.out.println(number + " is neither a prime nor composite");
        }else {
            for (int i = 2; i <= number / 2; i++) {
                temp = number % i;
                if (temp == 0) {
                    isPrime = false;

                }
            }
            if(isPrime){
                System.out.println(number + " is a prime number");
            }else {
                System.out.println(number +" is not a prime number");
            }

        }

    }
}
