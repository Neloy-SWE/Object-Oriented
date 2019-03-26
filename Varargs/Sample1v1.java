package Varargs;

public class Sample1v1 {
void Add(int ... a){
	int sum=0;
	for(int x: a){
		sum=sum+x;
	}
	System.out.println("Sum is: "+sum);
}
public static void main(String[] args) {
	Sample1v1 obj=new Sample1v1();
	obj.Add(10, 20, 30);
	obj.Add(12);
	obj.Add(12,20,34,100);
	obj.Add(1);
}
}
