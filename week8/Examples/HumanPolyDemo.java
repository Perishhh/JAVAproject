/**
	An example for illustrating polymorphism
*/
public class HumanPolyDemo {
	public static void main(String[] args) {
		HumanPoly pg1 = new PostGraduatePoly("Joe", "Male", "87654321", "Machine learning");
		
		// The line below causes error, why?
		//StudentPoly stu = new HumanPoly("Joe", "Male");
		
		// Uncomment the following two lines, the second line causes error, why?
		//HumanPoly human = new HumanPoly("Joe", "Male");
		//StudentPoly stuHuman = human;
		
		pg1.wakeUp();
		pg1.eat();
		
		// The line below causes error, why?
		//pg1.sleepy();
		
		// The line below causes error, why?
		//StudentPoly shallowStuPg1 = pg;

		System.out.println("---------------");

		PostGraduatePoly pg2 = new PostGraduatePoly("Jessica", "Abc", "12345678", "Machine learning");
		StudentPoly shallowStuPg2 = pg2;
		HumanPoly shallowHumanPg2 = pg2;
		pg2.wakeUp();
		shallowStuPg2.wakeUp();
		shallowHumanPg2.wakeUp();
		pg2.sleepy();
		shallowStuPg2.sleepy();
		
		// The line below causes error, why?
		//shallowHumanPg2.sleepy();
		
		pg2.eat();
		shallowStuPg2.eat();
		shallowHumanPg2.eat();
		
		System.out.println("---------------");
		HumanPoly humanStu = new StudentPoly("David", "Male", "11111111");
		humanStu.wakeUp();
		
	}
}