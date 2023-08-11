package chapter3;

import java.util.Scanner;

/*
    *LOGICAL OPERATORS:
    * To qualify for a loan, a person must make at least $30000
    * and have been working at their current job for at least 2yrs.
 */
public class LogicalOperatorloanQualifier {

    public static void main (String[] args){

//        Initialize what we know
        int expectedIncome = 30000;
        int expectedExperience = 2;


//        Get what we don't
        System.out.println("What is you total income:");
        Scanner scanner = new Scanner(System.in);
        double annualIncome = scanner.nextDouble();

        System.out.println("How long have you been on your current job:");
        double actualExperience = scanner.nextDouble();
        scanner.close();


//        Make decision
        if ( annualIncome >= expectedIncome &&  actualExperience >= expectedExperience){

                System.out.println("Congrats! 🎉You qualify for a loan");
        }
        else{
            System.out.println("Sorry, you must have an annual income of $" + expectedIncome + ".");
        }

    }

}
