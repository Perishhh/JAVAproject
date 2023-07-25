import java.util.Random;
import java.util.Scanner;
public class SimpleBet {
    private static double balance = 10000.0;
    public static void roll(int result, int target) throws InterruptedException{
        String[] panel = new String[9];
        panel[0] = "|6-7-8-9[1]2-3-4-5|";
        panel[8] = "|5-6-7-8[9]1-2-3-4|";
        panel[7] = "|4-5-6-7[8]9-1-2-3|";
        panel[6] = "|3-4-5-6[7]8-9-1-2|";
        panel[5] = "|2-3-4-5[6]7-8-9-1|";
        panel[4] = "|1-2-3-4[5]6-7-8-9|";
        panel[3] = "|9-1-2-3[4]5-6-7-8|";
        panel[2] = "|8-9-1-2[3]4-5-6-7|";
        panel[1] = "|7-8-9-1[2]3-4-5-6|";
        int i = 0;
        int roll = result+4;
        roll = roll%9;
        String shout = "";
        boolean status = true;
        while(status){
            Thread.sleep(50);
            if((i%2==0&&i<40&&i>=0)||(i%4==0&&i<96&&i>=40)||(i%16==0&&i>=96)){
                roll += 1;
                roll = roll%9;
            }
            if((i%22==0&&i>=88)){
                shout += "\t"+ target +"!";
            }
            i++;
            System.out.print("\r");
            System.out.print(panel[roll]+shout);
            if(roll == result-1 && i >150){
                status = false;
                System.out.print("\n");
            }
        }
        
    }


    public static void main(String[] args) throws InterruptedException{
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        boolean status = true;
        System.out.println("$$Welcome to Simple Casion$$");
        System.out.println("You are given $10000 for gambling!");
        while(status){
            System.out.printf("Enter your bet amount [100 - %.1f]: $",balance);
            double bet = keyboard.nextDouble();
            keyboard.nextLine();
            while(bet>balance||bet<100){
                System.out.print("Invalid bet amount, please enter again: ");
                bet = keyboard.nextDouble();
                keyboard.nextLine();
            }
            System.out.print("Enter your target number [1-9]: ");
            int target = keyboard.nextInt();
            keyboard.nextLine();
            while(target>9||target<1){
                System.out.print("Invalid target number, please enter again: ");
                target = keyboard.nextInt();
                keyboard.nextLine();
            }
            int result = r.nextInt(9)+1;
            roll(result, target);
            if (target != result){
                System.out.printf("Oh... you lose $%.1f.\n",bet);
                balance -= bet;
            }else{
                System.out.printf("Wow! You won $%.1f\n",bet*8.0);
                balance += bet*8.0;
            }
            if(balance<100){
                System.out.print("The minimum bet amount $100, loan [Y/N]?");
                String loan_option = keyboard.nextLine();
                while(!loan_option.equalsIgnoreCase("y") && !loan_option.equalsIgnoreCase("n")){
                    System.out.print("Invalid input, please type again [Y/N]: ");
                    loan_option = keyboard.nextLine();
                }
                if(loan_option.equalsIgnoreCase("y")){
                    System.out.println("Don't addicted to gambling! Please call the \"Quit Gambling\" hotline!");
                    status = false;
                }else if(loan_option.equalsIgnoreCase("n")){
                    System.out.println("Congratulations! You successfully quit gambling!");
                    status = false;
                }
            }else{
                System.out.print("Play again [Y/N]? ");
                String input = keyboard.nextLine();
                while(!input.equalsIgnoreCase("y") && !input.equalsIgnoreCase("n")){
                    System.out.print("Invalid input, Please type again [Y/N]: ");
                    input = keyboard.nextLine();
                }
                if (input.equalsIgnoreCase("n")){
                    status = false;
                    if (balance>10000.0){
                        System.out.println("Quit After Win!!?? You are blacklisted!!");
                    }else{
                        System.out.println("Thank you for your money.");
                    }
                }
            }
            
        }
        keyboard.close(); 
    }
}
