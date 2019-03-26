package Constructor;

public class OV1 {
	String name, gender;
	int age;
	
OV1(){
	System.out.println("No information\n\n");
}
OV1(String a){
	System.out.println("Name is "+a);
	System.out.println("\n\n");
}

OV1(String a, String b){
	System.out.println("Name is "+a);
	System.out.println("Gender is "+b);
	System.out.println("\n\n");
}

OV1(String a, String b, int c){
	System.out.println("Name is "+a);
	System.out.println("Gender is "+b);
	System.out.println("Age is "+c);
	System.out.println("\n\n");
}

}
