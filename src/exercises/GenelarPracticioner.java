package exercises;

public class GenelarPracticioner extends Doctor{

	public GenelarPracticioner(String name) {
		super(name);
	}
	
	public void makeHouseCalls() {
		System.out.println(name + " is callin patients at homes...");
	}
}
