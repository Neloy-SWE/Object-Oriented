package Mid;

public class test {
	public static void main(String[] args) {
		SBM t1 = new SBM(195, "Osthir App", "PC", "Daffodil");
		int x = t1.f(195);
		System.out.println("Method returnd = " + x);
		System.out.println(t1.prize("PC", 10));
	}
}
