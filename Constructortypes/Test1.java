package Constructortypes;

public class Test1 {
	String name, gender;
	int age;

	Test1(String a, String b, int c) {
		System.out.println("Name is " +a);
		System.out.println("Gender is " + b);
		System.out.println("Age is " + c);
		System.out.println("\n\n\n");
	}

	Test1(String a, String b) {
		System.out.println("Name is " +a);
		System.out.println("Gender is " + b);
		System.out.println("\n\n\n");
	}

	Test1() {
		System.out.println("No information\n");
	}
}
