package Varargs;

public class Sample4v1 {
static void Add(int a, double... d ){
	double sum=0;
	System.out.println("Length of d is: "+d.length);
	for(double x: d){
		sum=sum+x;
	}
	sum=sum+a;
	System.out.println(String.format("%.1f", sum));
}
static void Add(double a, int...b){
	double sum=0;
	System.out.println("Length of b is: "+b.length);
	for(int x: b){
		sum=sum+x;
	}
	sum=sum+a;
	System.out.println(sum);
}
public static void main(String[] args) {
	Add(10, 11.1, 12.2, 13.3);
	Add(11.1, 12, 11, 13, 14, 16, 17, 100);
	
}
}
