// Superclass of Student
public class Human {
	private String name;
	private String gender;
	
	public void setName(String n) {
		name = n;
	}
	
	public void setGender(String g) {
		if (!g.equals("Male") && !g.equals("Female")) {
			System.out.println("Invalid gender");
			return ;
		}
		gender = g;
	}
	
	public String getName() {
		return name;
	}
	
	public String getGender() {
		return gender;
	}
	
	// When the Student class successfully override this wakeUp method, 
	// try adding the final modifier.
	public void wakeUp() {
		System.out.println(name + ", " + gender + ": Sleepy~~Zzzzzz");
	}
	
	public void eat() {
		System.out.println("Yummy!");
	}
	
	public void humanWakeUp() {
		wakeUp();
	}
}