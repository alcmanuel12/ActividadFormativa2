package actividadFormativa2;

public class RevistaDeportiva {

	private String nombre_articulo;
	private String autor;
	private String palabras_clave;
	private String nombre_publicacion;
	private int anyo;
	private String resumen;
	
	public RevistaDeportiva(String nombre_articulo, String autor) {
		
		this.nombre_articulo = nombre_articulo;
		this.autor = autor;	
	}
	
	public RevistaDeportiva(String nombre_articulo, String autor, String palabras_clave, String nombre_publicacion, int anyo) {
        this(nombre_articulo, autor); // A si se llama al primer constructor 
        this.palabras_clave = palabras_clave;
        this.nombre_publicacion = nombre_publicacion;
        this.anyo = anyo;
	}
	
	public RevistaDeportiva(String nombre_articulo, String autor, String palabras_clave, String nombre_publicacion, int anyo, String resumen) {
        this(nombre_articulo, autor, palabras_clave, nombre_publicacion, anyo); // Llamamos al segundo constructor
        this.resumen = resumen;
    }
	
	 public void imprimir() {
	        System.out.println("Nombre: " + nombre_articulo);
	        System.out.println("Autor: " + autor);
	        System.out.println("Palabras clave: " + palabras_clave);
	        System.out.println("Publicación: " + nombre_publicacion);
	        System.out.println("Año: " + anyo);
	        System.out.println("Resumen: " + resumen);
	    }
	
	 public static void main(String[] args) {
	       
		 RevistaDeportiva articulo = new RevistaDeportiva("El entrenamiento de alta intensidad", "Juan Pérez", "entrenamiento, alta intensidad, rendimiento", "Revista de Ciencias del Deporte", 2023, "Este artículo analiza los beneficios del entrenamiento de alta intensidad...");
	        articulo.imprimir();
	    }
	
}
