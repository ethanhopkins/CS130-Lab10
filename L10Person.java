
public class L10Person {
	private String name;
	private int age;
	
	//Constructor
	public L10Person(String initialName, int age) {
		this.name = initialName;
		this.age = age;
	}
	
	//Print Function
	public void printPerson() {
		System.out.println("Name: " + name + "\nAge: " + age + "\n");
	}
	
	//Getters
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	//Setters
	/*public void setName(String name) {
		this.name = name;
	}
	*/
	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		L10Person p1 = new L10Person("Ethan", 18);
		p1.printPerson();
		
		L10Person p2 = new L10Person("Aung", 18);
		p2.printPerson();
		
		L10Person p3 = new L10Person("Ferdinand", 19);
		p3.printPerson();
	}

}
