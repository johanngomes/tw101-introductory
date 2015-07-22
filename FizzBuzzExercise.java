package com.company;

/**
 * Created by jgomes on 7/21/15.
 */
public class FizzBuzzExercise {

    public static void fizzBuzz() {
        for (int n=1; n<=100; n++) {
            if ( (n % 3 == 0) && (n % 5 == 0) ) {
                System.out.println("FizzBuzz");
            } else {
                if (n % 3 == 0) {
                    System.out.println("Fizz");
                } else if (n % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(n);
                }
            }

        }
    }

    public static void main(String[] args) {
        fizzBuzz();
    }
}
