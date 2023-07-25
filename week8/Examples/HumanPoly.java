// Superclass of StudentPoly
public class HumanPoly {
	private String name;
	private String gender;
	
	public HumanPoly(String n, String g) {
		name = n;
		setGender(g); // Why call setGender instead of gender = g;?
	}
	
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
	
	public void wakeUp() {
		System.out.println(name + ", " + gender + ": Sleepy~~Zzzzzz");
	}
	
	public void eat() {
		System.out.println("Yummy!");
	}
}