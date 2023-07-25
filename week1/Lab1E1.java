import java.util.Scanner;

// this is a comment
public class Lab1E1 {
    public static void main(String[] args) {
        System.out.print("First Try:");
        System.out.print(
            "These lines will be "
        );
        System.out.print("printed on");
        System.out.print(" the same line");
        System.out.println();
        System.out.println("Now Second Try: ");
        System.out.println("These lines will be printed on ");
        System.out.println("two separate lines");
        System.out.print("\nRight now is month: \n");
        System.out.println(01);
        System.out.println("This month has: \"031\tdays\"\n");
        System.out.println("  ^U^  ");
        System.out.println("  <|>  ");
        System.out.println("  / \\ ");
        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.println("input a int:");
            int i = keyboard.nextInt();
            System.out.println(i);
        }
    }
}
