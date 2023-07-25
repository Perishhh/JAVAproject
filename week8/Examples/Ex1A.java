// Superclass of Ex1B
public class Ex1A {
	private String priData = "Private field";
	public String pubData = "Public field";

	public String getPriData() {
		return priData;
	}

	private void privateMethod() {
		System.out.println("Private method");
	}

	public static void main(String[] args) {
		Ex1B obj = new Ex1B();
		obj.printData();
	}
}