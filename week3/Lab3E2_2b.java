import java.util.Scanner;
public class Lab3E2_2b {
    public static void main(String[] args) {
        String input;
        Scanner kb = new Scanner(System.in);
        System.out.print("Input a string: ");
        input = kb.nextLine();
        kb.close();
        switch(input){
            case "Hello":
            case "hello":
                System.out.println("Nice to meet you");
                break;
            case "Bye":
            case "bye":
                System.out.println("Stay cool");
                break;
            default:
                System.out.println("I don't understand what you are saying");
        }
    }
}