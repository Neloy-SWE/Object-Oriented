package HidingInstance;

public class HI1v1 {
	int month, year;
	void cal(int month, int year){
		this.month=month;
		this.year=year;
	}
	void dis(){
		System.out.println("Number of month is: "+month);
		System.out.println("Year is: "+year);
	}
}
