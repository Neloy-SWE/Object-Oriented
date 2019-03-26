package Parameter;

public class P1 {

	String name;
	String gender ;
	int age;
	void input(String a, String b, int c){
		name=a;
		gender=b;
		age=c;
	}
	void display(){
		System.out.println("Name is = "+name);
		System.out.println("Gender = "+gender);
		System.out.println("Age = "+age);
	}
}
