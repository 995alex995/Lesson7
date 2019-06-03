package exercises;

public class UML_Main {

	public static void main(String[] args) {
new Doctor("Aca", "pediatrition").doMedicine();
new Doctor("Clark", "oftamology").doMedicine();
new Doctor("Stifler", "cardiologist").doMedicine();

new GenelarPracticioner("Myke").doMedicine();
new GenelarPracticioner("Stella").makeHouseCalls();
new GenelarPracticioner("Rourke").makeHouseCalls();
	
new Surgeon("Anna").doMedicine();
new Surgeon("Steph").performSurgery();
new Surgeon("Joker").performSurgery();
	}

}
