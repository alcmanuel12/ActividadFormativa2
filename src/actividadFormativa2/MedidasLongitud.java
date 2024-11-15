package actividadFormativa2;

import java.util.Scanner;

public class MedidasLongitud {

	private double metros;
	private double centimetros;
	private double milimetros;
	private double pulgadas;
	private double pies;
	private double yardas;
	private double num_scan;
	private double num_final;
	private double selec;
	
	
	public MedidasLongitud(double metros, double centimetros, double milimetros, double pulgadas, double pies, double yardas, double num_scan, double num_final, double selec ) {
		
		this.metros=metros;
		this.centimetros=centimetros;
		this.milimetros= milimetros;
		this.pulgadas=pulgadas;
		this.pies=pies;
		this.yardas=yardas;
		this.num_scan=num_scan;
		this.num_final=num_final;
		this.selec=selec;
		
	}
	
	public MedidasLongitud() {
		
		this.metros = 0;
		this.centimetros = 100;
		this.milimetros = 1000;
		this.pulgadas = 393701;
		this.pies = 0.3048;
		this.yardas = 1.0936;
		this.num_scan = 0;
		this.num_final = 0;
		this.selec = 0;
		
	}
	static MedidasLongitud MedidasLongitud1 = new MedidasLongitud();

	public double getMetros() {
		return metros;
	}

	public void setMetros(double metros) {
		this.metros = metros;
	}

	public double getCentimetros() {
		return centimetros;
	}

	public void setCentimetros(double centimetros) {
		this.centimetros = centimetros;
	}

	public double getMilimetros() {
		return milimetros;
	}

	public void setMilimetros(double milimetros) {
		this.milimetros = milimetros;
	}

	public double getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(double pulgadas) {
		this.pulgadas = pulgadas;
	}

	public double getPies() {
		return pies;
	}

	public void setPies(double pies) {
		this.pies = pies;
	}

	public double getYardas() {
		return yardas;
	}

	public void setYardas(double yardas) {
		this.yardas = yardas;
	}

	public double getNum_scan() {
		return num_scan;
	}

	public void setNum_scan(double num_scan) {
		this.num_scan = num_scan;
	}
	
	public double getSelec() {
		return selec;
	}

	public void setSelec(double selec) {
		this.selec = selec;
	}
	public double getNum_final() {
		return num_final;
	}

	public void setNum_final(double num_final) {
		this.num_final = num_final;
	}
	
	
	Scanner scanner = new Scanner(System.in);
	
	public void guardarNum() {
		
		System.out.println("Bienvenido al conversor de metros a otras medidas de longitud");
		System.out.println("Introduzca los metros que desee comvertir:                   ");
		double num_scan = scanner.nextDouble();
		metros = num_scan;
		
		if (metros < 0) {
			System.err.println("introduzca un numero valido");
		}else {
		
		MedidasLongitud1.selector();
	}
	
	}
	public void selector() {
		
		System.out.println("Indique como quiere convertir sus " + metros + " metros");
		System.out.println("-----------------------------------------------------");
		System.out.println("1º- DE METROS A CENTIMETROS");
		System.out.println("2º- DE METROS A MILIMETROS");
		System.out.println("3º- DE METROS A PULGADAS");
		System.out.println("4º- DE METROS A PIES");
		System.out.println("5º- DE METROS A YARDAS");
		System.out.println("----------------------------------------------------");
		System.out.println("(Introduzca un numero del 1 al 5 para elegir opcion)");
		double selec = scanner.nextDouble();
		
		if (selec == 1) {
			
			MedidasLongitud1.centimetros();
			
		} else if (selec == 2) {
			
			MedidasLongitud1.milimetros();
			
		} else if (selec == 3) {
			
			MedidasLongitud1.pulgadas();
			
		} else if (selec == 4) {
			
			MedidasLongitud1.pies();
			
		} else if (selec == 5) {
			MedidasLongitud1.yardas();
			
		} else {
			
			System.err.println("Introduzca un numero valido");
		}
	
	
	
	}
	
	public void centimetros() {
		num_final = metros * centimetros;
		System.out.println(metros + " metros a centimetros son " + num_final + " centimetros");
	}
	
	public void milimetros() {
		num_final = metros * milimetros;
		System.out.println(metros + " metros a milimetros son " + num_final + " milimetros");
	}
	public void pulgadas() {
		num_final = metros * pulgadas;
		System.out.println(metros + " metros a pulgadas son " + num_final + " pulgadas");
	}
	public void pies() {
		num_final = metros * pies;
		System.out.println(metros + " metros a pies son " + num_final + " pies");
	}
	public void yardas() {
		num_final = metros * yardas;
		System.out.println(metros + " metros a yardas son " + num_final + " yardas");
	}
	
	
	
	
	public static void main(String[] args) {
		
		MedidasLongitud1.guardarNum();
		
	
		
	}
	
	
	
}
	
