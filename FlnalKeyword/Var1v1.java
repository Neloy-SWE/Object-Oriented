// initialize of instance final variables

package FlnalKeyword;

public class Var1v1 {
	final int A= 25; // final variable 
	final int B; // blank final variable
	 {
		B=10;
	}
	 Var1v1(int a){
		
		 System.out.println(a+B);
	 }
	 
	Var1v1(int a, int b){
		 
		 System.out.println(a+b+B);
	 }
	public static void main(String[] args) {
		Var1v1 x= new Var1v1(20);
		Var1v1 y =new Var1v1(20, 10);
	}
}
