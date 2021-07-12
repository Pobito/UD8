package Tarea08.ejercicio2;

public class ejercicio2App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Password contraseña1 = new Password();
		Password contraseña2 = new Password(10);
		
		System.out.println(contraseña1.toString());
		System.out.println(contraseña2.toString());
	}

}
