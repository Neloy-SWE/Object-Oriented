package SimpleTest;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	Scanner x= new Scanner(System.in);
	Teacher teacher1=new Teacher();
	System.out.println("Enter The Name: ");
	teacher1.name=x.nextLine();
	System.out.println("Enter The Gender: ");
	teacher1.gender=x.next();
	System.out.println("Enter The Age: ");
	teacher1.i=x.nextInt();
	
	System.out.println("       Here is the details for teacher:\n\n");
	
	System.out.println("Name: "+teacher1.name);
	System.out.println("Gender: "+teacher1.gender);
	System.out.println("Age: "+teacher1.i);
}
}
