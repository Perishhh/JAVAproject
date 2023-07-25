import java.util.Scanner;
import java.lang.Math;
public class bonus {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Input a score (up to two decimal places): ");
        Double score = kb.nextDouble();
        int level = (int)Math.floor(score/10);
        kb.close();
        switch(level){
            case 10:
            case 9:
                System.out.println("The grade is A");
                break;
            case 8:
            case 7:
                System.out.println("The grade is B");
                break;
            case 6:
            case 5:
                System.out.println("The grade is C");
                break;
            case 4:
                System.out.println("The grade is D");
                break;
            default:
                System.out.println("The grade is F");
        }
    }
}
