package FlnalKeyword;

public class Var2v1 {
 final int A;
 Var2v1(){
	 A=10;
	 System.out.println("Final A for 1st constructor: "+A);
	 System.out.println("No passed value");
 }
 
 Var2v1(int a){
	 A=20;
	 System.out.println("Final A for 1st constructor: "+A);
	 System.out.println("passed value is: "+a);
	 System.out.println(A+a);
 }
 Var2v1(int a, int b){
	 A=30;
	 System.out.println("Final A for 1st constructor: "+A);
	 System.out.println("passed value "+a+" & "+b);
	 System.out.println(A+a+b);
 }
public static void main(String[] args) {
	Var2v1 x=new Var2v1();
	Var2v1 y= new Var2v1(10);
	Var2v1 z= new Var2v1(10, 20);
}
 
}
