package actividadFormativa2;

import java.util.Scanner;

public class Restaurante {
	
	private double primerPlato;
	private double segundoPlato;
	private double bebida;
	private double postre;
	private double opcion1;
	private double opcion2;
	private double opcion3;
	private int selector;
	
	
	
	public Restaurante(double primerPlato, double segundoPlato, double bebida, double postre, double opcion1, double opcion2, double opcion3, int selector ) {
		
		this.primerPlato = primerPlato;
		this.segundoPlato = segundoPlato;
		this.bebida = bebida;
		this.postre = postre;
		this.opcion1 = opcion1;
		this.opcion2 = opcion2;
		this.opcion3 = opcion3;
		this.selector = selector;
		
		
	}
	
	public Restaurante() {
		
		this.primerPlato = 12;
		this.segundoPlato = 10;
		this.bebida = 2.50; 
		this.postre = 6.75;
		this.opcion1 = 0;
		this.opcion2 = 0;
		this.opcion3 = 0;
		this.selector = 0;
		
	}
	
	Scanner scanner = new Scanner(System.in);
	static Restaurante restaurante1 = new Restaurante();
	
	
	public void menu1() {
		
		opcion1 = primerPlato + bebida;
		System.out.println("Has elegido la opcion de primer plato mas bebida. Su costo es de " + opcion1 + " euros");
		
		
	}
	
	public void menu2() {
		opcion2 = primerPlato + segundoPlato + bebida;
		System.out.println("Has elegido la opcion de primer plato, segundo plato y bebida. Su costo es de " + opcion2 + " euros");
		
	}
	
	public void menu3() {
		opcion3 = primerPlato + segundoPlato + postre + bebida;
		System.out.println("Has elegido la opcion de primer plato, segundo plato, bebida y postre. Su costo es de " + opcion3 + " euros");
		
	}
	
	
	
	
	public void selector(){
		

		
		System.out.println("Le ofrecemos 3 opciones de nuestro menu");
		System.out.println("1º- OPCION: Un primer plato y una bebida.");
		System.out.println("2º- OPCION: Un primer plato, un segundo plato y una bebida.");
		System.out.println("3º- OPCION: Un primer plato, un segundo plato, una bebida y un postre.");
		System.out.println("Ingrese un numero del 1 al 3 dependiendo que opcion quiera escoger:  ");
		int selector = scanner.nextInt();
		
		if (selector == 1) {
		
			restaurante1.menu1();
		
			
		} 
		else if (selector == 2){
			
			restaurante1.menu2();
		} else if (selector == 3) {
			
			restaurante1.menu3();
		}else {
			
			System.err.println("Introduzca un numero valido");
			
		}	
	}
	
	
	public static void main(String[] args) {
		restaurante1.selector();
		
		

	}
	

}
