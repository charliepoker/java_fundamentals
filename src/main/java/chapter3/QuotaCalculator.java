package chapter3;

import java.util.Scanner;

/*
    *IF ELSE
    * All salespeople are expected to make at least 10 sales each week.
    * For those who do, they receive a congratulatory message.
    * For those who don't they are informed of how many sales they were short.
 */
public class QuotaCalculator {

    public static void main (String args[]){
//        Initialize values we know
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

//        Get unknown values
        System.out.println("How much sales did the employee make this week:");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

//        Make a decision on the path to take - Output

        if (sales >= quota){
            salary = salary + bonus;
            System.out.println("The employee's pay is $" + salary  + ". Congratualtions 🎉 you have met your quota.");
        }else {
            int salesShort = quota - sales;
            System.out.println("The employee's pay is $" + salary  + ". You did not make your quota. You were short by " + salesShort + " sales.");

        }
    }
}
