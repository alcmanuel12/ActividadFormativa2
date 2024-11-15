package actividadFormativa2;

import java.util.Scanner;

public class Resta {

	private int valor1;
	private int valor2;
	private int valor3;
	private double valor4;
	private double valor5;
	private double valor6;
	private int resltint;
	private double result;
	
	public Resta(int valor1,int valor2,int valor3,double valor4,double valor5,double valor6,int resltint, double result ) {
		
		this.valor1 = valor1;
		this.valor2 = valor2;
		this.valor3 = valor3;
		this.valor4 = valor4;
		this.valor5 = valor5;
		this.resltint = resltint;
		this.result = result;
	}
	
	public Resta() {
		
		this.valor1=0;
		this.valor2=0;
		this.valor3=0;
		this.valor4=0.00;
		this.valor5=0.00;
		this.valor6=0.00;
		this.resltint = 0;
		this.result = 0.0;
		
	}
	
	
	Scanner scanner = new Scanner(System.in);
	

	public int getValor1() {
		return valor1;
	}

	public void setValor1(int valor1) {
		this.valor1 = valor1;
	}

	public int getValor2() {
		return valor2;
	}

	public void setValor2(int valor2) {
		this.valor2 = valor2;
	}

	public int getValor3() {
		return valor3;
	}

	public void setValor3(int valor3) {
		this.valor3 = valor3;
	}

	public double getValor4() {
		return valor4;
	}

	public void setValor4(double valor4) {
		this.valor4 = valor4;
	}

	public double getValor5() {
		return valor5;
	}

	public void setValor5(double valor5) {
		this.valor5 = valor5;
	}

	public double getValor6() {
		return valor6;
	}

	public void setValor6(double valor6) {
		this.valor6 = valor6;
	}
	
	
	public void dosEnteros() {
		
		System.out.println("Procederemos a restar los dos valores enteros que nos proporcione");
		System.out.println("Introduzca el primer valor (entero):    ");
		int valor1 = scanner.nextInt();
		System.out.println("Introduzca el segundo valor (entero):    ");
		int valor2 = scanner.nextInt();
		
		resltint = valor1 - valor2;
		
		System.out.println("El valor de la resta es de: " + resltint );
		
	}
	

	public void tresEnteros() {
		
		System.out.println("Procederemos a restar los tres valores enteros que nos proporcione");
		System.out.println("Introduzca el primer valor (entero):    ");
		int valor1 = scanner.nextInt();
		System.out.println("Introduzca el segundo valor (entero):    ");
		int valor2 = scanner.nextInt();
		System.out.println("Introduzca el tercer valor (entero):    ");
		int valor3 = scanner.nextInt();
		
		resltint = valor1 - valor2 - valor3;
		
		System.out.println("El valor de la resta es de: " + resltint );
		
	}
	
	public void dosDecimal() {
		
		System.out.println("Procederemos a restar los dos valores decimales que nos proporcione");
		System.out.println("Introduzca el primer valor (decimal):    ");
		double valor4 = scanner.nextDouble();
		System.out.println("Introduzca el segundo valor (decimal):    ");
		double valor5 = scanner.nextDouble();
		
		result = valor4 - valor5;
		
		System.out.println("El valor de la resta es de: " + resltint );
		
	}
	
	public void tresDecimal() {
		
		System.out.println("Procederemos a restar los tres valores decimales que nos proporcione");
		System.out.println("Introduzca el primer valor (decimal):    ");
		double valor4 = scanner.nextDouble();
		System.out.println("Introduzca el segundo valor (decimal):    ");
		double valor5 = scanner.nextDouble();
		System.out.println("Introduzca el tercer valor (decimal):    ");
		double valor6 = scanner.nextDouble();
		
		result = valor4 - valor5 - valor6;
		
		System.out.println("El valor de la resta es de: " + result );
		
	}


	public static void main(String[] args) {
		
		Resta Resta1 = new Resta();
		
		//Resta1.dosDecimal();
		//Resta1.tresDecimal();
		//Resta1.dosEnteros();
		//Resta1.tresEnteros();
		
	}
	
	
	
}
