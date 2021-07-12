package Tarea08.ejercicio4;

public class ejercicio4App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Serie serie1 = new Serie();
		Serie serie2 = new Serie("Vikingos", "Netflix");
		Serie serie3 = new Serie("La casa de papel", 4, "Acción", "Netflix");
		
		System.out.println(serie1.toString());
		System.out.println(serie2.toString());
		System.out.println(serie3.toString());
	}

}
