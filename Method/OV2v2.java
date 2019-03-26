package Method;

import java.util.*;

public class OV2v2 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int a, b;
		double d;
		a = x.nextInt();
		b = x.nextInt();

		OV2v1.sample(a, b);
		d = x.nextDouble();
		System.out.println(OV2v1.sample(d));
	}
}
