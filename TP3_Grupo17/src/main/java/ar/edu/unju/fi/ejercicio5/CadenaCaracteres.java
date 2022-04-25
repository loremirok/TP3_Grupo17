package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class CadenaCaracteres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
	     String frase;
	     
	     System.out.println("Introduzca su frase:");
	     frase = sc.nextLine();

	     char[]invertir = frase.toCharArray();

	     for(int i = invertir.length-1; i !=-1; i--){
	    	 System.out.print(invertir[i]);
	        }
		
	}

}
