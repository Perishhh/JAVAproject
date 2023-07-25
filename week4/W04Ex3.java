import java.util.Scanner;
import java.io.*;

public class W04Ex3 {
	public static void main(String[] args) throws IOException, InterruptedException{
		Scanner keyboard = new Scanner(System.in);
		boolean userNameMatch = false;
		boolean move = false;
		
		do {
			
			System.out.println("**Welcome to the contact list management system**");
			System.out.println("1. Show all contacts");
			System.out.println("2. Enquire for a contact");
			System.out.println("3. Add contact");
			System.out.println("4. Exit");
		
		
			System.out.print("Please select an action: ");
			String useInput = keyboard.nextLine();
			int useInput1 = Integer.parseInt(useInput);
			
			File accFile = new File("contact-list.txt");
			Scanner fileReader = new Scanner(accFile);
			
			
			
			if (useInput1 == 1){
				while (fileReader.hasNext()){
					System.out.println(fileReader.nextLine()); 	
				}
				
			}else if (useInput1 == 2){	
				System.out.print("Enter a contact name: ");
				String useInput2 = keyboard.nextLine();
				while (fileReader.hasNext() && !userNameMatch){
					String fileUserName = fileReader.nextLine();
					String fileNumber = fileReader.nextLine();
					userNameMatch = useInput2.equals(fileUserName);
					if (userNameMatch){
						System.out.println("Contact name: " + fileUserName + ", Phone number: " + fileNumber );
					}
				}	
				if (!userNameMatch){
					System.out.println("Contact doesn't exist");
				}
				userNameMatch = false;
			}else if (useInput1 == 3){
				FileWriter outputFile = new FileWriter (accFile, true);
				System.out.print("Enter a contact name: ");
				String useInput3 = keyboard.nextLine();
				System.out.print("Enter a new phone number: ");
				String useInput4 = keyboard.nextLine();
				outputFile.write(useInput3 + "\n");
				outputFile.write(useInput4 + "\n");
				outputFile.close();
			}else if (useInput1 == 4){
				System.exit(0);
			}
			
			
			
			System.out.print("Go back to main menu [Y/N]? ");
			String useInput5 = keyboard.nextLine();
			
			if (useInput5.equalsIgnoreCase("N") ) {
				move = true;
			}else if (useInput5.equalsIgnoreCase("Y")) {
				move = false;
			}else{
				System.out.print("Invalid input, please enter Y or N: ");
				String useInput6 = keyboard.nextLine();
				if (useInput6.equalsIgnoreCase("N") ) {
					move = true;
				}else if (useInput5.equalsIgnoreCase("Y")) {
					move = false;
				}
			}		
		}while (!move);
	}
}