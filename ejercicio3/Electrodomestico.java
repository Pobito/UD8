package Tarea08.ejercicio3;

public class Electrodomestico {

	// Atributos
	protected int precioBase;
	protected String color;
	protected char consumoEnerg;
	protected int peso;
	
	// Valores por defecto en constantes
	final int PRECIO = 100;
	final String COLOR = "blanco";
	final char CONSUMO = 'F';
	final int PESO = 5;
	
	// Getters y setters	
	public int getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumoEnerg() {
		return consumoEnerg;
	}

	public void setConsumoEnerg(char consumoEnerg) {
		this.consumoEnerg = consumoEnerg;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	// Constructores
	public Electrodomestico() {
		super();
		this.precioBase = PRECIO;
		this.color = COLOR;
		this.consumoEnerg = CONSUMO;
		this.peso = PESO;
	}

	public Electrodomestico(int precioBase, int peso) {
		super();
		this.precioBase = precioBase;
		this.peso = peso;
	}
	
	public Electrodomestico(int precioBase, String color, char consumoEnerg, int peso) {
		super();
		this.precioBase = precioBase;
		this.color = comprovarColor(color);
		this.consumoEnerg = comprovarConsumo(consumoEnerg);
		this.peso = peso;
	}
	
	// Para comprovar el color
	public String comprovarColor (String color) {
		String colorF = COLOR;
		
		if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") ||color.equalsIgnoreCase("rojo")
				|| color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")) {
			colorF = color;
		}
		
		return colorF;
	}
	
	// Para comprovar el consumo energetico
	public char comprovarConsumo (char consumo) {
		
		switch (consumo) {
			case ('A'):
				break;
			case ('B'):
				break;
			case ('C'):
				break;
			case ('D'):
				break;
			case ('E'):
				break;
			case ('F'):
				break;
			default:
				consumo = 'F';
		}
		
		return consumo;
	}
	
}
