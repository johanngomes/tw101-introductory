package com.company;

/**
 * Created by jgomes on 7/20/15.
 */
public class DiamondExercises {

    public static int numberOfLines;
    public static char characterToPrint = '*';
    public static char spaceToPrint = ' ';
    public static String nameToPrint = "Johann";

    public static void isoscelesTriangle(int numberOfLines) {
        int numberOfSpaces = numberOfLines;
        int numberOfAsterisks = 1;
        for (int line=0; line<numberOfLines; line++) {
            for (int space=0; space<numberOfSpaces; space++) {
                System.out.print(spaceToPrint);
            }
            numberOfSpaces --;
            for (int asterisk=0; asterisk<numberOfAsterisks; asterisk++) {
                System.out.print(characterToPrint);
            }
            System.out.print("\n");
            numberOfAsterisks += 1;
        }
    }

    public static void diamond(int numberOfLines) {
        int numberOfSpaces = numberOfLines;
        int numberOfAsterisks = 1;

        for (int line=0; line<numberOfLines; line++) {
            for (int space=0; space<numberOfSpaces; space++) {
                System.out.print(spaceToPrint);
            }
            numberOfSpaces --;
            for (int asterisk=0; asterisk<numberOfAsterisks; asterisk++) {
                System.out.print(characterToPrint);
            }
            System.out.print("\n");
            numberOfAsterisks += 2;
        }

        for (int line=0; line<=numberOfLines; line++) {
            for (int space=0; space<numberOfSpaces; space++) {
                System.out.print(spaceToPrint);
            }
            numberOfSpaces ++;
            for (int asterisk=0; asterisk<numberOfAsterisks; asterisk++) {
                System.out.print(characterToPrint);
            }
            System.out.print("\n");
            numberOfAsterisks -= 2;
        }
    }

    public static void diamondWithName(int numberOfLines, String nameToPrint) {
        int numberOfSpaces = numberOfLines;
        int numberOfAsterisks = 1;

        for (int line=0; line<numberOfLines; line++) {
            for (int space=0; space<numberOfSpaces; space++) {
                System.out.print(spaceToPrint);
            }
            numberOfSpaces --;

            for (int asterisk=0; asterisk<numberOfAsterisks; asterisk++) {
                System.out.print(characterToPrint);
            }

            System.out.print("\n");
            numberOfAsterisks += 2;
        }

        boolean center = true;

        for (int line=0; line<=numberOfLines; line++) {
            for (int space=0; space<numberOfSpaces; space++) {
                System.out.print(spaceToPrint);
            }
            numberOfSpaces ++;
            if (center) {
                System.out.print(nameToPrint);
                center = false;
            } else {
                for (int asterisk=0; asterisk<numberOfAsterisks; asterisk++) {
                    System.out.print(characterToPrint);
                }
            }

            System.out.print("\n");
            numberOfAsterisks -= 2;
        }
    }

    public static void main(String[] args) {
        System.out.println("\n\nisoscelesTriangle\n\n");

        numberOfLines = 3;
        isoscelesTriangle(numberOfLines);

        System.out.println("\n\ndiamond\n\n");

        diamond(numberOfLines);

        System.out.println("\n\ndiamondWithName\n\n");

        diamondWithName(numberOfLines, nameToPrint);
    }
}
