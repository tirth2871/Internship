import java.util.Scanner;
import java.util.*;

public class Welcome {
    public static void  main(String[] args) {

        // read inputs
        Scanner input = new Scanner(System.in);

        System.out.println("How much money do you need to retire? ");
        double goal = input.nextDouble();

        System.out.println("How much money will you contribute every year? ");
        double payment = input.nextDouble();

        System.out.println("Interest Rate will be ");
        double  interestRate = input.nextDouble();

        double balance = 0;
        int years=0;


        while (balance < goal) {
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            years++;
        }

        System.out.println("You can retire in " + years +  " years.");
    }
}
