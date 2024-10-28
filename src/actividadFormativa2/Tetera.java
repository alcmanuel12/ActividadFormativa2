package actividadFormativa2;

public class Tetera {

private String color;
private String material;
private int capacidadMaxima;
private int capacidadActual = 0;
private static  int taza = 250;

public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getMaterial() {
	return material;
}
public void setMaterial(String material) {
	this.material = material;
}
public int getCapacidadMaxima() {
	return capacidadMaxima;
}
public void setCapacidadMaxima(int capacidadMaxima) {
	this.capacidadMaxima = capacidadMaxima;
}
public int getCapacidadActual() {
	return capacidadActual;
}
public void setCapacidadActual(int capacidadActual) {
	this.capacidadActual = capacidadActual;
}
public int gettaza() {
	return taza;
}
public void settaza(int taza) {
	Tetera.taza = taza;
}

public Tetera(String color, String material, int capacidadMaxima, int capacidadActual) {

		this.color = color;
		this.material = material;
		this.capacidadMaxima = 1000;
		this.capacidadActual = capacidadActual;
			
}



public Tetera(int capacidadMaxima, int capacidadActual) {
	
		if(capacidadActual > capacidadMaxima ) {
			capacidadActual = capacidadMaxima;
		} else {
		
		}

}
		

		public void llenarTe() {
			
			capacidadActual = capacidadMaxima;
			System.out.println("Tu taza ha sido llenada ahora dispone de " + capacidadActual + "cc" );
			
		}
		
		
		public void servirTaza() {
			
			
			if(capacidadActual > taza){
				
				    capacidadActual = capacidadActual - taza;
				    System.out.println("Tu taza ha sido llenada");
			}else {
				
					taza = capacidadActual;
					System.out.println("Tu taza se a llenado " + taza + " cc debido a que no habia mas en la tetera");
					capacidadActual= 0;	
			}	
		}

		
		public void vaciarTe() {
			capacidadActual = 0;
			System.out.println("Tu tetera se a vaciado");
			
		}
		
		public void agregarCafe() {
			capacidadActual = capacidadActual + taza;
			System.out.println("Tu tetera se ha llenado con una taza, ahora dispone de " + capacidadActual + "cc");
		}


public static void main(String[] args) {
	
	Tetera miTetera = new Tetera("roja", "Porcelana", 1000,150);
	miTetera.agregarCafe();
	miTetera.agregarCafe();
	
	

	
}




}
