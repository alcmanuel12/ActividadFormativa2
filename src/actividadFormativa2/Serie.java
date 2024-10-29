package actividadFormativa2;

public class Serie {

	private String titulo;
	private String autor;
	private int actores;
	
	public Serie(String titulo, String autor) {
		this.titulo = titulo;
		this.autor= autor;
		this.actores = 0;
	}
	
	public Serie() {
		
		this.titulo = "";
		this.autor = "";
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getActores() {
		return actores;
	}

	public void setActores(int actores) {
		this.actores = actores;
	}
	
	
}
