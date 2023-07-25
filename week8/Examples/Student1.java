// Subclass of Human
public class Student1 extends Human {
	private String stuId;
	
	public void setStuId(String id) {
		stuId = id;
	}
	
	public String getStuId() {
		return stuId;
	}

	// Trial 1: Try to change the method name from wakeUp to wakeup with and without @override
	// Trial 2: Try to change public to private
	@Override
	public void wakeUp() {
		System.out.println(getName() + ", " + getGender() + ", " + stuId + ": Work on the course project!");
	}
	
	public void sleepy() {
		wakeUp();
		super.wakeUp();
	}
}