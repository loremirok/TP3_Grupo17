package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String palabra;
		
		
		System.out.print("Ingrese una palabra: ");
		palabra = scan.next();
		
		char[] word = new char[palabra.length()];
		int aux=0;
		
		for (int i = word.length; i > 0 ; i--) {	
			word[aux] = palabra.charAt(i-1);
			aux++;
		}
		for (int j = 0; j < word.length; j++) {
			System.out.print(word[j]);
		}
		
		
	}

}
