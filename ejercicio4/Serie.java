package Tarea08.ejercicio4;

public class Serie {

	// Atributos
	private String titulo;
	private int numTemps;
	private boolean entregado;
	private String genero;
	private String creador;
	
	// Getters i setters
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumTemps() {
		return numTemps;
	}

	public void setNumTemps(int numTemps) {
		this.numTemps = numTemps;
	}

	public boolean isEntregado() {
		return entregado;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}
	
	
	// Constructores
	public Serie() {
		this.numTemps = 3;
		this.entregado = false;
	}

	public Serie(String titulo, String creador) {
		super();
		this.titulo = titulo;
		this.creador = creador;
	}
	
	public Serie(String titulo, int numTemps, String genero, String creador) {
		super();
		this.titulo = titulo;
		this.numTemps = numTemps;
		this.genero = genero;
		this.creador = creador;
	}
	
}
