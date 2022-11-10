import java.util.Random;

public class Maths {
	public static double E = 2.718;
	public static double PI = 3.1415;
	private static Random randomNumberGenerator = new Random();

	
	//Constructor
	private Maths() {
		
	}
	
	//Getter
	public static int getRandomNumber () {
		int randomNumber = randomNumberGenerator.nextInt();
		return randomNumber;
	}
	
	//Functions
	public static int max(int num1, int num2) {
		return Math.max(num1, num2);
	}
	
	public static long max(long num1, long num2) {
		return Math.max(num1, num2);
	}
	
	public static double sin(double num1) {
		return Math.sin(num1);
	}
	
	public static double cos(double num1) {
		return Math.cos(num1);
	}
	
	public static double log(double num1) {
		return Math.log(num1);
	}
	
	public static double ceil(double num1) {
		return Math.ceil(num1);
	}
	
	public static double floor(double num1) {
		return Math.floor(num1);
	}
	
	public static double pow(double num1, double num2) {
		return Math.pow(num1, num2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Maths.getRandomNumber());
		System.out.println(Maths.max(4, 8));
		System.out.println(Maths.max(64,678));
		System.out.println(Maths.sin(4));
		System.out.println(Maths.cos(4));
		System.out.println(Maths.log(4));
		System.out.println(Maths.ceil(4.3));
		System.out.println(Maths.floor(4.3));
		System.out.println(Maths.pow(4, 2));
	}

}
