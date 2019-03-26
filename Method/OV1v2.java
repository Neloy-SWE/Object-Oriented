package Method;

public class OV1v2 {
	public static void main(String[] args) {
		OV1v1 obj = new OV1v1();
		obj.add(10, 20);
		System.out.println(obj.add(10, 20, 30));
		System.out.println(obj.add(15.00));
	}
}
