package actividadFormativa2;

public class Ventana {

	private boolean abierta;
	private String colorTinte;
	
	public boolean isAbierta() {
		return abierta;
	}
	
	public String getColorTinte() {
		return colorTinte;
	}


	public Ventana(String colorTinte) {
		
		this.abierta = false;
		this.colorTinte = colorTinte;
	
	}

	public void ventanaAbrir() {
		
		if (!abierta) {
			System.out.println("Abriendo la ventana");
			this.abierta = true;
		}else {
			System.out.println("La ventana ya esta abierta");
		}
	}
	
	public void ventanaCerrar() {
		
		if (abierta) {
			System.out.println("Cerrando ventana");
			this.abierta = false;
		}else {
			System.out.println("La ventana ya esta cerrada");
		}
	}
	
}
