import java.util.Scanner;
import java.io.*;
public class Lab04E3 {
    public static void main(String[] args) {
        File contactFile = new File("contact-list.txt");
        boolean status = true;
        Scanner kb = new Scanner(System.in);
        do{ 
            System.out.println("**Welcome to the contact list management system**");
            System.out.println("1. Show all contacts");
            System.out.println("2. Enquire for a contact");
            System.out.println("3. Add contact");
            System.out.println("4. Exit");
            System.out.print("\n");
            System.out.print("Please select an action: ");
            String action = kb.nextLine();
            if(action.equals("1")){
                try {
                    Scanner inputfile = new Scanner(contactFile);
                    while(inputfile.hasNext()){
                        System.out.println(inputfile.nextLine());
                    }
                    inputfile.close();
                } catch (Exception e) {
                    System.out.print("");
                }
            }else if(action.equals("2")){
                System.out.printf("Enter a contact name: ");
                String contact = kb.nextLine();
                boolean flag = true;
                try {
                    Scanner inputfile = new Scanner(contactFile);
                    while(inputfile.hasNext() && flag){
                        if(contact.equals(inputfile.nextLine())){
                            flag = false;
                            System.out.print("Contact name: "+contact);
                            System.out.println(", Phone number: "+inputfile.nextLine());
                        }else{
                            inputfile.nextLine();
                        }
                    }
                    inputfile.close();

                } catch (Exception e) {
                    flag = false;
                }
                if(flag){
                    System.out.println("Contact doesn't exist");
                }
            }else if(action.equals("3")){
                try {
                    FileWriter outputFile = new FileWriter(contactFile,true);
                    System.out.print("Enter a contact name: ");
                    outputFile.write(kb.nextLine()+"\n");
                    System.out.print("Enter a phone number: ");
                    outputFile.write(kb.nextLine()+"\n");
                    outputFile.close();
                } catch (Exception e) {
                    System.out.print("");
                }
            }else if(action.equals("4")){
                status = false;
            }
            if(status){
                System.out.print("Go back to main menu [Y/N]? ");
                String input = kb.nextLine();
                while(!input.equalsIgnoreCase("y") && !input.equalsIgnoreCase("n")){
                    System.out.print("Invalid input, please enter Y or N: ");
                    input = kb.nextLine();
                }
                if(input.equalsIgnoreCase("n")){
                    status = false;
                }
            } 
        }while(status);
        kb.close();
    }
}