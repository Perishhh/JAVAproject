// Subclass of StudentPoly
public class PostGraduatePoly extends StudentPoly {
	private String researchTopic;
	
	public PostGraduatePoly(String name, String gender, String stuId, String rt) {
		super(name, gender, stuId);
		researchTopic = rt;
	}
	
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
	
	@Override
	public void eat() {
		System.out.println("Still researching during eating!");
	}
	
	@Override
	public void sleepy() {
		System.out.println("sleep with research!");
	}
}
