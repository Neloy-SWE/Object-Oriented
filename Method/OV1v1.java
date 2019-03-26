package Method;

public class OV1v1 {
	int a, b, c;
	double d;

	void add(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println(a + b);
	}

	int add(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		return c + a - b;
	}
	double add(double d){
		this.d=d;
		return d*100;
	}
}
