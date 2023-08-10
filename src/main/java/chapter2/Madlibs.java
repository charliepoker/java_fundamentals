package chapter2;

import java.util.Scanner;

public class Madlibs {

    public static void main (String args[]){

//        1. Ask the user for the season of the yr
        System.out.println("What is the season of the year?");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

//        2. Assign a variable
        System.out.println("Enter a number");
        int number = scanner.nextInt();

//        3. Assign an adjective to a variable
        System.out.println("Enter an Adjective");
        String adjective = scanner.next();

//        4. Output the result

        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + number + " coffee."   );

    }
}
