package Tarea08.ejercicio2;

public class Password {
	// Atributos
	private int longitud;
	private String contrase�a;
	
	// Getters y setters
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	// Contructores
	public Password() {
		this.longitud = 8;
		this.contrase�a = generarContrase�a(longitud);
	}
	
	public Password(int longitud) {
		this.longitud = longitud;
		this.contrase�a = generarContrase�a(longitud);
	}
	
	// Metodo para generar contrase�a aleatoria
	public String generarContrase�a (int longitud) {
		String contrase�a = "";
		int i, random;
		char caracter;
		
		// For para cada uno de los caracteres
		for (i = 0; i < longitud; i++) {
			random = (int) (Math.random()*72) + 48; // Genero un num random con este rango para caracteres alfanumericos
			caracter = (char) random; // Casteo ese num a char
			contrase�a += caracter; // Lo guardo en el string
		}
		
		return contrase�a;
	}
}
