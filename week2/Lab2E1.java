import java.util.Scanner;
import java.lang.Math;
public class Lab2E1 {
    public static void main(String[] args) {
        double radius, perimeter, area, surfaceArea, volume;
        Scanner keyb = new Scanner(System.in);
        System.out.print("Plz input a radius: ");
        radius = (double)keyb.nextFloat();
        perimeter = 2 * Math.PI * radius;
        area = Math.PI * radius * radius;
        surfaceArea = 4 * Math.PI * radius * radius;
        volume = (4.0/3.0) * Math.PI *radius*radius*radius;
        System.out.println("The perimeter of circle is :" +perimeter);
        System.out.println("The area of circle is :" +area);
        System.out.println("The surface area of sphere is :" +surfaceArea);
        System.out.println("The volume of sphere is :" +volume);
        keyb.close();
    }
}
