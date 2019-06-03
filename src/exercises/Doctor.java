package exercises;

public class Doctor {

	String name, title;
	
	public Doctor() {
		
	}
	
	public Doctor(String name) {
		this.name = name;
	}
	
	public Doctor(String name, String title) {
		this.name = name;
		this.title = title;
	}
	
	public void doMedicine() {
		System.out.println(name + " is casting some recovery magic on your hp... :D ");
	}
}
