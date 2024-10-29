package actividadFormativa2;

public class Motor {

	private boolean encendido;
	private String marca;
	private String cilindrada;
	
	public Motor(String marca, String cilindrada) {
		this.encendido = false;
		this.marca = marca;
		this.cilindrada = cilindrada;
	}
	
	public boolean isEncendido() {
		return encendido;
	}
	public String getMarca() {
		return marca;
	}

	public String getCilindrada() {
		return cilindrada;
	}
	
	public void arrancar() {
		if (!encendido) {
			
			System.out.println("Arrancando el motor");
			this.encendido = true;
		} else {
			System.out.println("El motor ya esta arrancado");
		} 
	}
	
	public void apagar() {
		
		if (encendido) {
			System.out.println("Apagando el motor");
			this.encendido = false;
		}else {
			System.out.println("El motor ya esta apagado");
		}	
	}	
}
