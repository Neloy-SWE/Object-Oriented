package Method;

public class Test {
public static void main(String[] args) {
	Teacher t1= new Teacher();
	System.out.println("Information for Teacher 1:");
	t1.Input();
	t1.DisplayInformation();
	
	Teacher t2=new Teacher();
	System.out.println("Information for Teacher 2:");
	t2.Input();
	t2.DisplayInformation();
	
	Teacher t3=new Teacher();
	System.out.println("Information for Teacher 3:");
	t3.Input();
	t3.DisplayInformation();
}
}
