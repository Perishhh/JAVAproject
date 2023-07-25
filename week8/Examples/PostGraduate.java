// Subclass of Student
public class PostGraduate extends Student1 {
	private String researchTopic;
	
	public void setResearchTopic(String r) {
		researchTopic = r;
	}
	
	public String getResearchTopic() {
		return researchTopic;
	}
	
	@Override
	public void wakeUp() {
		System.out.println(getName() + ", " + getGender() + ", " + getStuId() + ", " + researchTopic + ": Work on research!");
	}
}
