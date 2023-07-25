/**
	An example for illustrating inheritance 
*/
public class HumanDemo {
	public static void main(String[] args) {
		Human h = new Human();
		Student1 s = new Student1();
		PostGraduate pg = new PostGraduate();
		s.setName("Jessica"); s.setGender("Female"); s.setStuId("12345678");
		h.setName("David"); h.setGender("Male");
		pg.setName("Joe"); pg.setGender("Male"); pg.setStuId("87654321"); pg.setResearchTopic("Machine learning");
		h.wakeUp();
		s.wakeUp();
		pg.wakeUp();
		System.out.println("-------------");
		s.sleepy();
	}
}