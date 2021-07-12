package Tarea08.ejercicio2;

public class Password {
	// Atributos
	private int longitud;
	private String contraseña;
	
	// Getters y setters
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	// Contructores
	public Password() {
		this.longitud = 8;
		this.contraseña = generarContraseña(longitud);
	}
	
	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña = generarContraseña(longitud);
	}
	
	// Metodo para generar contraseña aleatoria
	public String generarContraseña (int longitud) {
		String contraseña = "";
		int i, random;
		char caracter;
		
		// For para cada uno de los caracteres
		for (i = 0; i < longitud; i++) {
			random = (int) (Math.random()*72) + 48; // Genero un num random con este rango para caracteres alfanumericos
			caracter = (char) random; // Casteo ese num a char
			contraseña += caracter; // Lo guardo en el string
		}
		
		return contraseña;
	}
}
