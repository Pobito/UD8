package Tarea08.ejercicio1;

public class ejercicio1App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona persona1 = new Persona();
		Persona persona2 = new Persona("Adrián", 20, 'H');
		Persona persona3 = new Persona("Manoli", 40, "48985300X", 'M', 55, 168);
		
		// No sale nada porque es el constructor por defecto
		System.out.println(persona1.getNombre());
		// Sale adrian que es el nombre que le he pasado, pero lo demas (excepto edad y sexo) esta por defecto a 0/null
		System.out.println(persona2.getNombre());
		// Sale manoli porque es el nombre que le he pasado, lo demas saldria lo que le he pasado
		System.out.println(persona3.getNombre());
	}

}
