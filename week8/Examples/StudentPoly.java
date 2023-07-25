// Subclass of HumanPoly
public class StudentPoly extends HumanPoly {
	private String stuId;
	
	public StudentPoly(String name, String gender, String id) {
		super(name, gender);
		stuId = id;
	}
	
	public void setStuId(String id) {
		stuId = id;
	}
	
	public String getStuId() {
		return stuId;
	}

	@Override
	public void wakeUp() {
		System.out.println(getName() + ", " + getGender() + ", " + stuId + ": Work on the course project!");
	}
	public void sleepy() {
		wakeUp();
		super.wakeUp();
	}
}