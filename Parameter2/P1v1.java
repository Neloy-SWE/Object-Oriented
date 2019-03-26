package Parameter2;

import java.util.Scanner;

public class P1v1 {
	Scanner x=new Scanner(System.in);
String name, gender;
int age;
void input(){
	name=x.nextLine();
	gender=x.nextLine();
	age=x.nextInt();
}

void display(String a, String b, int c){
	System.out.println("Name = "+a);
	System.out.println("Gender = "+b);
	System.out.println("Age = "+c);
}
}
