
public class dateType {
	private int dMonth;
	private int dDay;
	private int dYear;
	
	//Constructor
	public dateType (int dMonth, int dDay, int dYear) {
		this.dMonth = dMonth;
		this.dDay = dDay;
		this.dYear = dYear;
	}
	
	//Getters
	public final int getMonth() {
		return dMonth;
	}
	
	public final int getDay() {
		return dDay;
	}
	
	public final int getYear() {
		return dYear;
	}
	
	//Setter
	public final void setDate(int dMonth, int dDay, int dYear) {
		this.dMonth = dMonth;
		this.dDay = dDay;
		this.dYear = dYear;
	}
	
	//Printing Function
	public final void printDate() {
		System.out.println(dMonth + "/" + dDay + "/" + dYear);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dateType date = new dateType(1, 1, 1900);
		date.printDate();
	}

}
