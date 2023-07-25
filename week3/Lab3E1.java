import java.lang.Math;
import java.util.Scanner;
public class Lab3E1 {
    private static double Weight;
    private static double Height;
    private static double BMI;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Plz tell me your weight:(kg) ");
        Weight = kb.nextDouble();
        System.out.print("Plz tell me your height:(m) ");
        Height = kb.nextDouble();
        BMI = Weight/Math.pow(Height,2);
        if(BMI < 0){
            System.out.println("Invalid input");
        }else if(BMI < 18.5){
            System.out.println("You are underweight.");
        }else if(BMI >= 25){
            System.out.println("You are overweight.");
        }else {
            System.out.println("You are healthy");
        }
        kb.close();
    }
}