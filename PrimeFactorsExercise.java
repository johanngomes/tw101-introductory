package com.company;

import java.util.ArrayList;

/**
 * Created by jgomes on 7/21/15.
 */
public class PrimeFactorsExercise {
    public static String generate(int numbers) {

        ArrayList<Integer> prime_factors = new ArrayList<Integer>();

        for (int number=1; number<=numbers; number++) {
            for (int n_to_compare=1; n_to_compare<=numbers; n_to_compare++) {
                if ( !((n_to_compare == 1) || (n_to_compare == number)) ) {
                    if (( number % n_to_compare == 0 )) {
                        break;
                    } else {
                        prime_factors.add(number);
                        break;
                    }
                }
            }
        }
        return prime_factors.toString();
    }

    public static void main(String[] args) {
        int number_range = 30;
        String output = String.format("The Prime Factors between 1 and %d: %s", number_range, generate(number_range));
        System.out.println(output);
    }
}
