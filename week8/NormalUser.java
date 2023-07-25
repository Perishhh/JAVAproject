import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NormalUser extends Account {
	/*****************************
	 * ToDo 4: 
	 * Add a private field in the space below for storing the register date of a NormalUser instance.
	 ****************************/
	private String regDate;

	/*****************************
	 * ToDo 5:
	 * Add your code in the space below to override 
	 * the printAccInfo method. This method should 
	 * first print a message "This is normal user account.", 
	 * and then prints the name, gender, date of birth and 
	 * register date.
	 * Hint: Refer to the given printAccInfo method in SystemAdmin.java.
	 ****************************/
	@Override
	public void printAccInfo(){
		System.out.println("This is normal user account.");
		super.printAccInfo();
		System.out.println("Register date: "+regDate);
	}


	/*****************************
	 * ToDo 7:
	 * Add your code in the space below to override the performAction
	 * method. This method checks the given action number (integer)
	 * argument. 
	 * If the action number is 1, then print a line 
	 * "Perform user action one.". 
	 * If the action number is 2, then call the printAccInfo method for 
	 * printing the account info.
	 * We assume the user input is an integer, but the user input may not 
	 * be 1 or 2. This method returns true if the user input is 1 or 2. 
	 * Otherwise, return false.
	 ****************************/	
	@Override
	public boolean performAction(int i){
		switch(i){
			case 1:
				System.out.println("Perform user action one.");
				return true;
			case 2:
				printAccInfo();
				return true;
			default:
				return false;
		}
	}

	
	/*****************************
	 * ToDo 10: 
	 * Add your code in the space below to override the login 
	 * method. The method asks the user to 
	 * enter the username and passowrd (call enterUsernamePwd method), 
	 * then perform login authetication by reading the 
	 * account.txt file.
	 *
	 * The authetication may be done by a loop that
	 * reads three lines in each iteration, then 
	 * user the first two lines to create a Credential object 
	 * and compares with the Credential object from the user input.
	 * if username and password match, i.e.login success, 
	 * then set the user info (call setAccInfo method) and return true.
	 * If no account in account.txt file that matches the user input, 
	 * then return false.
	 ****************************/
	@Override
	public boolean login() throws FileNotFoundException{
		Credential c = enterUsernamePwd();
		File f = new File("accounts.txt");
		Scanner inputFile = new Scanner(f);
		while(inputFile.hasNext()){
			String user = inputFile.nextLine();
			String pwd = inputFile.nextLine();
			String accInfoLine = inputFile.nextLine();
			if(c.getUsername().equals(user)&&c.getPassword().equals(pwd)){
				inputFile.close();
				setAccInfo(user,accInfoLine);
				return true;
			}
		};
		inputFile.close();
		return false;
		
	}


	// A method that prints the Normal User action menu.
	@Override
	public void printMenu() {
		System.out.println("\nWelcome to our service.");
		System.out.println("1. User action one.");
		System.out.println("2. Print account info.");
	}
	
	// A method that sets the account information including
	// username, name, gender, date of birth and register date.
	// QUESTIONS: 
	//  1) Why we do not use @Override annotation?
	//  2) Why super is not needed when calling setAccInfo?
	// answer:
	//  1) Because two methods have different input data types.
	//  2) Because it is not an overriding method. Without method from parent class, setAccInfo can still run.
	public void setAccInfo(String username, String accInfoLine) {
		String[] accInfo = accInfoLine.split(",");
		setAccInfo(username, accInfo);
		regDate = accInfo[3];
	}
}
