package Tarea08.ejercicio1;

public class ejercicio1App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona persona1 = new Persona();
		Persona persona2 = new Persona("Adrián", 20, 'H');
		Persona persona3 = new Persona("Manoli", 40, "48985300X", 'M', 55, 168);
		
		System.out.println(persona1.toString());
		System.out.println(persona2.toString());
		System.out.println(persona3.toString());
	}

}
