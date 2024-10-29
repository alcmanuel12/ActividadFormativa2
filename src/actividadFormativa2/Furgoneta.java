package actividadFormativa2;

public class Furgoneta {
	Motor motor1;
	Puerta puerta1;
	Puerta puerta2;
	Puerta puerta3;
	Puerta puerta4;
	Puerta puerta5;
	Rueda rueda1;
	Rueda rueda2;
	Rueda rueda3;
	Rueda rueda4;
	Ventana ventana1;
	Ventana ventana2;
	Ventana ventana3;
	Ventana ventana4;
	int velocidad;
	double presion;
	
	
	
	public Furgoneta() {
		this.motor1 = new Motor("Toyota", "3.000" );
		this.puerta1 = new Puerta("verde");
		this.puerta2 = new Puerta("verde");
		this.puerta3 = new Puerta("verde");
		this.puerta4 = new Puerta("verde");
		this.puerta5 = new Puerta("verde");
	    this.rueda1 = new Rueda(presion, "Michelin", "16");
	    this.rueda2 = new Rueda(presion, "Michelin", "16");
	    this.rueda3 = new Rueda(presion, "Michelin", "16");
	    this.rueda4 = new Rueda(presion, "Michelin", "16");
	    this.ventana1 = new Ventana("Tinte oscuro");
	    this.ventana2 = new Ventana("Tinte oscuro");
	    this.ventana3 = new Ventana("Tinte oscuro");
	    this.ventana4 = new Ventana("Tinte oscuro");		
		this.velocidad=0;
		this.presion=0.0;
		
	}
	
	public void AcelerarFurgoneta(int velocidad) {
		motor1.arrancar();
		this.velocidad=velocidad;
		System.out.println("Tu velocidad es de " + velocidad);
	}

	public void CerrarPuertas() {
		puerta1.cerrarPuerta();
		puerta2.cerrarPuerta();
		puerta3.cerrarPuerta();
		puerta4.cerrarPuerta();
		puerta5.cerrarPuerta();
		
		System.out.println("Se han cerrado todas las puertas");
			
	}
	
	public void AbrirPuertas() {
		puerta1.abrirPuerta();
		puerta2.abrirPuerta();
		puerta3.abrirPuerta();
		puerta4.abrirPuerta();
		puerta5.abrirPuerta();
		System.out.println("Se han abierto todas las puertas");
	}
	
	
	public void InflarRueda1(double presion) {	
		rueda1.inflar(presion);		
		
	}
	
	public void InflarRueda2(double presion) {
		rueda2.inflar(presion);
		
	}
	
	public void InflarRueda3(double presion) {
		rueda3.inflar(presion);
		
	}

	public void InflarRueda4(double presion) {
		rueda4.inflar(presion);
	
	}
	
	public void SubirVentanas() {
		
		ventana1.ventanaAbrir();
		ventana2.ventanaAbrir();
		ventana3.ventanaAbrir();
		ventana4.ventanaAbrir();
		
		
	}

	public void BajarVentanas() {
		
		ventana1.ventanaCerrar();
		ventana2.ventanaCerrar();
		ventana3.ventanaCerrar();
		ventana4.ventanaCerrar();
		
		
	}
	
	
	
	
	public static void main (String[] args) {
		Furgoneta furgoneta1 = new Furgoneta();
		furgoneta1.AcelerarFurgoneta(120);
		//furgoneta1.AbrirPuertas();
		//furgoneta1.InflarRueda1(3.4);
		//furgoneta1.SubirVentanas();
		//furgoneta1.BajarVentanas();
		
}
}