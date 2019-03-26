package Method;

public class OV2v1 {

	static int a, b;
	static double d;

	static void sample(int x, int y) {
		a = x;
		b = y;
		System.out.println(a * b);
	}

	static double sample(double z) {
		d = z * 50;
		return d;
	}
}
