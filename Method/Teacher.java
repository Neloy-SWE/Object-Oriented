package Method;

import java.util.Scanner;

public class Teacher {
	Scanner x= new Scanner(System.in);
String name;
String gender;
int i;
void Input(){
	System.out.println("Enter A Name: ");
	name=x.nextLine();
	System.out.println("Enter The Gender: ");
	gender=x.nextLine();
	System.out.println("Enter The Age: ");
	i=x.nextInt();
	System.out.println();
}

void DisplayInformation(){
	System.out.println("Name: "+name);
	System.out.println("Gender: "+gender);
	System.out.println("Age: "+i);
	System.out.println("\n");
}
}
