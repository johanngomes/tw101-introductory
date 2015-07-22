package com.company;

/**
 * Created by jgomes on 7/20/15.
 */
public class TriangleExercises {

    public static int numberOfAsterisks;
    public static int numberOfLines;
    public static char characterToPrint = '*';

    public static void easiestExerciseEver() {
        System.out.println(characterToPrint);
    }

    public static void drawHorizontalLine(int numberOfAsterisks) {
        for (int n=0; n<numberOfAsterisks; n++) {
            System.out.print(characterToPrint);
        }
    }

    public static void drawVerticalLine(int numberOfAsterisks) {
        for (int n=0; n<numberOfAsterisks; n++) {
            System.out.println(characterToPrint);
        }
    }

    public static void drawRightTriangle(int numberOfLines) {

        numberOfAsterisks = 1;

        for (int n=0; n<numberOfLines; n++) {
            for (int j=0; j<numberOfAsterisks; j++) {
                System.out.print(characterToPrint);
            }
            System.out.print("\n");
            numberOfAsterisks ++;
        }
    }

    public static void main(String[] args) {
        easiestExerciseEver();

        numberOfAsterisks = 3;

        System.out.println("\n\ndrawHorizontalLine");
        drawHorizontalLine(numberOfAsterisks);


        System.out.println("\n\ndrawVerticalLine");
        drawVerticalLine(numberOfAsterisks);


        numberOfLines = 3;

        System.out.println("\n\ndrawRightTriangle");
        drawRightTriangle(numberOfLines);
    }

}
