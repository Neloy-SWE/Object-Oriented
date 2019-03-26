package Varargs;

public class Sample2v1 {
	void Add(int ... a){
		int sum=0;
		for(int x:a){
			sum=sum+x;
		}
		System.out.println(sum);
	}
	
void Add(int a, double...b){
	double sum=0;
	for(double x:b){
		sum=sum+x;
	}
	sum=sum+a;
	System.out.println(sum);
	
}
public static void main(String[] args) {
	Sample2v1 obj=new Sample2v1();
	obj.Add(10, 20, 22);
	obj.Add(10, 1.2,1.4);
	
}
}
