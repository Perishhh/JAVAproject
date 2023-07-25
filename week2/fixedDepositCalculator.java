import java.lang.Math;
import java.util.Scanner;
public class fixedDepositCalculator {
    private static double interestRate = 0.0235482;
    private static double fixedDeposit;
    private static String name;
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        System.out.println("Java Lab 2: Fixed deposit calculator");
        System.out.print("How much for the fixed deposit? ");
        fixedDeposit = (double)(keyb.nextFloat());
        System.out.print("What is your name? ");
        keyb.nextLine();
        name = keyb.nextLine();
        System.out.println("Dear "+name+",");
        keyb.close();
        withdrawalMode();
        compoundMode();
    }

    public static void withdrawalMode(){
        System.out.println("In withdrawal mode: ");
        System.out.printf("You can receive $%,.4f per year\n",fixedDeposit*interestRate);
        System.out.printf("The total amount on completion is $%,.2f\n",(1+5*interestRate)*fixedDeposit);
    }
    public static void compoundMode(){
        System.out.println("In compond mode:");
        double deposit = fixedDeposit;
        for (int i = 1; i <= 5; i++) {
            double interest = Math.pow(1+interestRate,i-1)*fixedDeposit*interestRate;
            System.out.printf("The interest at year %d is $%,.4f\n",i,interest);
            deposit += interest;
        }
        System.out.printf("The total amount on completion is $%,.2f\n",deposit);
    }
}
