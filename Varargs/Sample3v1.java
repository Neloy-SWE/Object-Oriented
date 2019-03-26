package Varargs;

public class Sample3v1 {
static void Add(int b, double... a){
	System.out.println("Length of a is: "+a.length);
	double sum=0;
	for (double x : a) {
		sum=sum+x;
	}
	sum=sum+b;
	System.out.println("Sum is: "+sum);
}

static void Strng(int a, String...b){
	for(String x: b){
		System.out.print(x+ " ");	
	}
	System.out.println();
	System.out.println(a+100);
}
public static void main(String[] args) {
	Add(11, 12.5, 3.5, 10.6, 11.5);
	Strng(10, "My", "name", "is", "Neloy");
}
}
