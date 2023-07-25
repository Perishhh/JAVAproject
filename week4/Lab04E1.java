import java.io.*;
import java.util.Scanner;
import java.lang.Math;

public class Lab04E1 {
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
        Scanner kb = new Scanner(System.in);
        File file = new File("up.txt");
        Scanner inputfile = new Scanner(file);
        String U = inputfile.nextLine();
        String P = inputfile.nextLine();
        boolean status = true;
        do{
            System.out.println("Input username:");
            String userName = kb.nextLine();
            System.out.println("Input password:");
            String password = kb.nextLine();
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < 4; i++) {
                builder.append((int)(Math.random()*10));
            }
            String C = builder.toString();
            System.out.println("Input authentication code: "+C);
            String code = kb.nextLine();
            if(userName.equals(U) && password.equals(P) && code.equals(C)) {
                System.out.println("login success!");
                status = false;
            }else {
                System.out.println("username password pair or auth code is invalid.");
                Thread.sleep(2000);
            }
        }while(status);
        kb.close();
        inputfile.close();
    }
}
