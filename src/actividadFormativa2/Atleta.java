package actividadFormativa2;

public class Atleta {
	
	private int idAtleta;
	private String nombre;
	private static double tiempoPrueba;
	
	private static int ContAltleta = 0;
	private static String seleccion = "Francia";
	private static double tiempoEquipo = 0;
	
	
	public Atleta(int idAtleta,String nombre,double tiempoPrueba ) {
		
		this.idAtleta = Atleta.ContAltleta;
		this.nombre = nombre;
		Atleta.tiempoPrueba = tiempoPrueba;
	}
	
	
	public static void correr100() {
		
		Atleta.tiempoEquipo = tiempoPrueba + Atleta.tiempoEquipo;
		
	}
	
	public static void mostrarTiempo() {
		System.out.println("El tiempo del equipo es :" + Atleta.tiempoEquipo);
	}
	
	
	public static void nombreSeleccion() {
		System.out.println("Seleccion: "+ seleccion);
	}
	
	public static void crearSeleccionF() {
		new Atleta(001, "Manuel", 8.75);
		new Atleta(002, "Jose", 48.3);
		new Atleta(003, "Luis", 66.77);
		new Atleta(004, "Maximiliano", 109.68);	
	}
	
	

	
	
	public static void main(String[] args) {
		Atleta.crearSeleccionF();
		Atleta.nombreSeleccion();
		Atleta.correr100();
		Atleta.mostrarTiempo();
		
		
		
		
		
	}
}
