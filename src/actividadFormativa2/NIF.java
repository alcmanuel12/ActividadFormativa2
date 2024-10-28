package actividadFormativa2;

import java.util.Scanner; 

public class NIF {

	private long dni_num;
	private char dni_letra;
	private static final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";
	
	public long getDni_num() {
		return dni_num;
	}
	public void setDni_num(long dni_num) {
		this.dni_num = dni_num;
	}
	public char getDni_letra() {
		return dni_letra;
	}
	public void setDni_letra(char dni_letra) {
		this.dni_letra = dni_letra;
	}
	public static String getLetras() {
		return LETRAS;
	}
	 
	
	public NIF() {
		
		this.dni_num = 0;
		this.dni_letra = ' ';	
		
	}
	public NIF(long dni_num) {
        this.dni_num = dni_num;
        this.dni_letra = calcularLetra();
    }
	
	Scanner scanner = new Scanner(System.in);
	 
	 public void leer() {
		 System.out.println("Introduzca su numero de DNI (sin letra): ");
		 long numerodni = scanner.nextLong();
		 this.dni_num = numerodni;
		 this.dni_letra = calcularLetra();
		 
	 }
	 
	 public String mostrarNIF() {
	        return String.format("%08d-%c", dni_num, dni_letra);
	    }
	 
	 private char calcularLetra() {
	        int resto = (int) (dni_num % 23);
	        return LETRAS.charAt(resto);
	    }
		   
		 public static void main(String[] args) {
		        NIF nif = new NIF();
		        nif.leer();
		        System.out.println("El NIF completo es: " + nif.mostrarNIF());
		    }
		





}
	 
	 

	
	
