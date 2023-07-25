import java.util.Scanner;
import java.lang.Math;
public class Lab3E3 {
    public static void main(String[] args) {
        double weightOfpackage, shippingDistance;
        int yearOfOrder, monthOfOrder;
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the weight, in pounds: ");
        weightOfpackage = kb.nextDouble();
        kb.nextLine();
        System.out.print("Enter the distance, in miles: ");
        shippingDistance = kb.nextDouble();
        kb.nextLine();
        System.out.print("Enter the year of the shipping order: ");
        yearOfOrder = kb.nextInt();
        kb.nextLine();
        if(yearOfOrder < 1000 || yearOfOrder > 3000){
            System.out.println("Invalid year");
            System.exit(0);
        }
        System.out.print("Enter the month of the shipping order: ");
        monthOfOrder = kb.nextInt();
        kb.nextLine();
        if(monthOfOrder < 1 || monthOfOrder > 12){
            System.out.println("Invalid month");
            System.exit(0);
        }

        if(weightOfpackage <= 2.0){
            System.out.printf("The shipping charges are $%.2f",1.1*Math.floor(shippingDistance/500));
        }else if(weightOfpackage <= 6.0){
            System.out.printf("The shipping charges are $%.2f",2.2*Math.floor(shippingDistance/500));
        }else if(weightOfpackage <= 10.0){
            if(monthOfOrder==2 && isLeapYear(yearOfOrder)){
                System.out.printf("The shipping charges are $%.2f",0.9*3.7*Math.floor(shippingDistance/500));
            }else{
                System.out.printf("The shipping charges are $%.2f",3.7*Math.floor(shippingDistance/500));
            }
            
        }else{
            if(monthOfOrder==2 && isLeapYear(yearOfOrder)){
                System.out.printf("The shipping charges are $%.2f",0.8*4.8*Math.floor(shippingDistance/500));
            }else{
                System.out.printf("The shipping charges are $%.2f",4.8*Math.floor(shippingDistance/500));
            }
        }
        kb.close();
        
    }

    public static boolean isLeapYear(int year){
        if(year%400==0 || (year%4==0 && year%100!=0)){
            return true;
        }else{
            return false;
        }
    }
}
