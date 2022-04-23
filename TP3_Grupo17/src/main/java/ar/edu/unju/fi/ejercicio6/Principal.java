package ar.edu.unju.fi.ejercicio6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Ingrese un valor: ");
			numeros.add(sc.nextInt());
		}
		
		for (int i = numeros.size()-1; i >= 0; i--) {
			System.out.println(numeros.get(i));
		}
		
		//Collections.reverse(numeros);
		//System.out.println(numeros);
		
	}

}
