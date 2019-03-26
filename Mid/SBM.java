package Mid;

public class SBM {
	int softID;
	String softName;
	String platfromName;
	String companyName;

	SBM(int a, String b, String c, String d) {
		softID = a;
		softName = b;
		platfromName = c;
		companyName = d;
		System.out.println(softID);
		System.out.println(softName);
		System.out.println(platfromName);
		System.out.println(companyName);
	}

	int f(int a) {
		if (a > 0 && a <= 100) {
			System.out.println("Mobile app");
			return 1;
		} else if (a >= 101 && a <= 200) {
			System.out.println("PC app");
			return 2;
		} else {
			System.out.println("Web app");
			return 3;
		}
	}

	int prize(String platfromName, int numberofsoft) {

		if (platfromName == "Mobile") {
			return numberofsoft * 50;
		} else if (platfromName == "PC") {
			return numberofsoft * 100;
		} else {
			return numberofsoft * 200;
		}
	}

}