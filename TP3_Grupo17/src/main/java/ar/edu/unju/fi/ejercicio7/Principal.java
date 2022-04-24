package ar.edu.unju.fi.ejercicio7;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		ArrayList<String> frutas = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		
		boolean response = false;
		
		do {
			System.out.println("Ingrese una fruta: "); 
			frutas.add(scan.next());
			
			System.out.print("¿Desea ingresar más datos? (S/N)");
			
			switch (scan.next()) {
			case "S","s":
				response= true; 
				break;
			case "N","n":
				response= false; 
				break;

			default:
				System.out.println("Opcion invalida, vuelva a intentarlo más tarde)");
				response= false; 
				break;
			}
			
		}while(response);
		
		System.out.println("--------------------------------------");
		
		for (String fruta : frutas) {
			if(frutas.indexOf(fruta)%2==0 && frutas.indexOf(fruta)!=0) {
				System.out.println(fruta);
			}
		}
		
		System.out.println("--------------------------------------");
		
		System.out.println("Ingrese un numero positivo: ");
		int aux = scan.nextInt();
		
		if(aux > 0 && aux <= frutas.size() ){
				frutas.remove(aux-1);
			}else {
				System.err.println("numero invalido");
			}
		for (String fruta : frutas) {
			System.out.print(fruta+" ");
		
		}
		System.out.println(" ");
		System.out.println("El ArrayList contiene "+frutas.size()+" elementos");
	
	}

	
}
