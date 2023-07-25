import java.util.Scanner;
public class Lab3E2_2a {
    public static void main(String[] args) {
        String input;
        Scanner kb = new Scanner(System.in);
        System.out.print("Input a string: ");
        input = kb.nextLine();
        kb.close();
        if(input.equals("Hello") || input.equals("hello")){
            System.out.println("Nice to meet you");
        }else if(input.equals("Bye") || input.equals("bye")){
            System.out.println("Stay cool");
        }else{
            System.out.println("I don't know what you are saying");
        }
    }
}