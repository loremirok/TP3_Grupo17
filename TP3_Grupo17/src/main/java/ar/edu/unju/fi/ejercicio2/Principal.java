package ar.edu.unju.fi.ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] multiplicador = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Scanner lectura = new Scanner(System.in);
		String resp;
		int numero, resultado;
		
		do {
			System.out.print("ingrese un número: ");
			try {
				numero = lectura.nextInt();
				if ((numero >= 1) && (numero <= 9)) {
					System.out.println("***********");
					for (int i = 0; i < multiplicador.length; i++) {
						resultado = numero * multiplicador[i];
						System.out.println(numero + "X" + multiplicador[i] + "=" + resultado);
					}
					System.out.println("***********");
					lectura.nextLine();
				} else {
					System.out.println("debe ingresar un numero entre [1,9]");
					lectura.nextLine();
				}		
			} catch (InputMismatchException ex) {
				System.out.println("Debe ingresar un número entero.");
				lectura.nextLine();
			}
			System.out.print("desea ingresar otro número (S/N): ");
			resp = lectura.nextLine();
		} while ((resp.charAt(0) == 's') || (resp.charAt(0) == 'S'));
		lectura.close();
		System.out.print("********FIN********");
	}

}
