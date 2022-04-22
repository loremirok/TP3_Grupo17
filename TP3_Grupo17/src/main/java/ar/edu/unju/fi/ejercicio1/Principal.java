package ar.edu.unju.fi.ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lectura = new Scanner(System.in);
		int[] arregloDeNumero1 = new int[5];
		int[] arregloDeNumero2 = new int[5];
		boolean continua;
		
		System.out.println("ingrese 5 numeros enteros a ser guardados en el primer arreglo");
		int contador = 0;
		while (contador < 5) {
			do {
				try {
					System.out.print("ingrese valor para el indice "+contador+": ");
					arregloDeNumero1[contador] = lectura.nextInt();
					contador++;
					continua = false;
				} catch (InputMismatchException ex) {
					System.out.println("Debe ingresar un número entero.");
					lectura.nextLine();
					continua = true;
				}
				
			}while(continua);		
		}
		
		System.out.println("ingrese 5 numeros enteros a ser guardados en el segundo arreglo");
		
		for (int i = 0; i < arregloDeNumero2.length; i++) {
	  		do {
				try {
					System.out.println("ingrese valor para para el indice "+i+": ");
					arregloDeNumero2[i] = lectura.nextInt();
					continua = false;
				} catch (InputMismatchException ex) {
					System.out.println("Debe ingresar obligatoriamente un número entero.");
					lectura.nextLine();
					continua = true;
				}
				
			}while(continua);	
		}
		
		lectura.close();
		 System.out.println("los resultados de la división entre los números del primer arreglo y el segundo arreglo son:");
		mostrarDivision(arregloDeNumero1, arregloDeNumero2);

	}
	
	public static void mostrarDivision(int[] arregloDeNumero1, int[] arregloDeNumero2){
		int resultado=0;;
        for(int i=0;i< arregloDeNumero1.length;i++){
        	 for(int j=0;j< arregloDeNumero2.length;j++){
        		 if(i==j) {
        			 try {
        				 resultado=arregloDeNumero1[i]/arregloDeNumero2[j];
        				 System.out.println("el resultado de la division "
        				 +arregloDeNumero1[i]+"/"+arregloDeNumero2[j]+"="+resultado);
        			 }catch(ArithmeticException ex){
        				 resultado=0;
        				 System.out.println("la division "+arregloDeNumero1[i]+"/"+arregloDeNumero2[j]+
        					" produce un Error "+ex.getMessage());		 
        			 }	 
        		 }
        		 
        	 }
        }
	}

}
