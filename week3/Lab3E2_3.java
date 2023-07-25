import java.util.Scanner;
public class Lab3E2_3 {
    public static void main(String[] args) {
        int width, length;
        Scanner kb = new Scanner(System.in);
        System.out.print("Input a width: ");
        width = kb.nextInt();
        System.out.print("Input a length: ");
        length = kb.nextInt();
        if (width <= 0 || length <= 0){
            System.out.println("Invalid width or length.");
        }else if(width == length){
            System.out.println("This is a square with area "+width*length);
        }else {
            System.out.println("This is a rectangle with perimeter "+2*(width+length));
        }
        kb.close();
    }
}