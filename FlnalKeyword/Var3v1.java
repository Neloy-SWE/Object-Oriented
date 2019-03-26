package FlnalKeyword;

public class Var3v1 {
static int A;
{
	A=10;
	System.out.println(A);
}
 Var3v1(int a){
	System.out.println(A+a);
}
{
	A=20;
	System.out.println(A);
}
Var3v1(int a, int b){
	System.out.println(A+a+b);
}
{
	A=30;
	System.out.println(A);
}
Var3v1(int a, int b,int c){
	System.out.println(A+a+b+c);
}
public static void main(String[] args) {
	Var3v1 x= new Var3v1(100);
	Var3v1 y= new Var3v1(100,100);
	Var3v1 z= new Var3v1(100,100,100);
}
}
