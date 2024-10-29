package actividadFormativa2;

public class Rueda {

	private double presion;
	private String marca;
	private String tama�o;

	public String getMarca() {
		return marca;
	}

	public String getTama�o() {
		return tama�o;
	}

	public Rueda(double presionInicial, String marca, String tama�o) {
        this.presion = presionInicial;
        this.marca = marca;
        this.tama�o = tama�o;
    }

    public void inflar(double cantidad) {
        presion += cantidad;
        System.out.println("La rueda se ha inflado. Presi�n actual: " + presion + " psi");
    }

    public void desinflar(double cantidad) {
        if (presion - cantidad >= 0) {
            presion -= cantidad;
            System.out.println("La rueda se ha desinflado. Presi�n actual: " + presion + " psi");
        } else {
            System.out.println("No se puede desinflar m�s de lo que est� inflada la rueda.");
        }
    }
    

} 
	




