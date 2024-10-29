package actividadFormativa2;

public class Rueda {

	private double presion;
	private String marca;
	private String tamaño;

	public String getMarca() {
		return marca;
	}

	public String getTamaño() {
		return tamaño;
	}

	public Rueda(double presionInicial, String marca, String tamaño) {
        this.presion = presionInicial;
        this.marca = marca;
        this.tamaño = tamaño;
    }

    public void inflar(double cantidad) {
        presion += cantidad;
        System.out.println("La rueda se ha inflado. Presión actual: " + presion + " psi");
    }

    public void desinflar(double cantidad) {
        if (presion - cantidad >= 0) {
            presion -= cantidad;
            System.out.println("La rueda se ha desinflado. Presión actual: " + presion + " psi");
        } else {
            System.out.println("No se puede desinflar más de lo que está inflada la rueda.");
        }
    }
    

} 
	




