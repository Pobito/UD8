package Tarea08.ejercicio3;

public class ejercicio3App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Electrodomestico ele1 = new Electrodomestico(100, "verde", 'P', 5);
		
		System.out.println(ele1.getPeso());
		System.out.println(ele1.getConsumoEnerg());
		System.out.println(ele1.getPrecioBase());
		System.out.println(ele1.getColor());
	}

}
