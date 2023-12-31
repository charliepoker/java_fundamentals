package chapter5;

import java.util.Scanner;

/*
 * VARIABLE SCOPE
 * Write an 'instant credit check' program that approves
 * anyone who makes more than $25,000 and has credit score
 * of 700 or better. Reject all others
 */
public class InstantCreditCheck {

    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double salary = getSalary();
        int creditScore = getCreditScore();
        scanner.close();

        //   Check if the user is qualified
        boolean qualified =isUserQualified(creditScore, salary);

        //   Notify the user
        notifyUser(qualified);


    }



    public static double getSalary(){
        System.out.println("How much do you earn?");
        double salary = scanner.nextDouble();
        return salary;
    }

    public static  int getCreditScore(){
        System.out.println("Enter your credit score");
        int creditScore = scanner.nextInt();
        return creditScore;
    }

  public static boolean isUserQualified(int creditScore, double salary){
        if(creditScore >= requiredCreditScore && salary >= requiredCreditScore){
            return true;
        }else{
            return false;
        }

  }

  public static void notifyUser(boolean isQualified){
        if(isQualified){
            System.out.println("Congrats! Your have been approved");
        }else{
            System.out.println("Sorry. You have been declined");
        }
  }

}