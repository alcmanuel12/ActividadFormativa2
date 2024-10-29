package actividadFormativa2;

public class Puerta {

	private boolean puertaAbierta;
	private String color;
	
	
	public boolean isPuertaAbierta() {		
		return puertaAbierta;		
	}
	
	public String getColor() {
		return color;
	}



	public Puerta(String color) {
		this.puertaAbierta = false;
		this.color = color;
		
	}
	
	
	public void abrirPuerta() {
		
	if (!puertaAbierta) {
		System.out.println("Abriendo la puerta");
		this.puertaAbierta = true;
		
	}else {
		
		System.out.println("La puerta ya esta abierta");
	}
	}
	
	public void cerrarPuerta() {
	
		if (puertaAbierta) {
		
		System.out.println("Cerrando la puerta");
		this.puertaAbierta = false;
		
	}else {
		System.out.println("La puerta ya esta cerrada");
	}
	}
	
	
}
	


