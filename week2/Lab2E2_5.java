import java.util.Scanner;

public class Lab2E2_5 {
    public static void main(String[] args) {
        float width,length,area;
        Scanner keyb = new Scanner(System.in);
        System.out.println("Please input the width:");
        width = keyb.nextFloat();
        System.out.println("Please input the length");
        length = keyb.nextFloat();
        area = width * length;
        System.out.printf("The area of given rectangle is: %.2f",area);
        keyb.close();
    }
    
}
