import java.util.Scanner;

public class Lab05E2_3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Plz input a paragraph:");
        String userInput = kb.nextLine();
        String[] sen = userInput.split("\\.");
        for (int i = 0; i < sen.length; i++) {
            System.out.print(sen[i]);
            if(i<sen.length-1){
                System.out.println(".");
            }
        }
        kb.close();
    }
}
