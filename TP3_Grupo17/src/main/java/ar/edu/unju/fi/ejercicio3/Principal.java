package ar.edu.unju.fi.ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lectura = new Scanner(System.in);
		Alumno unAlumno = new Alumno();

		System.out.print("ingrese nombre de alumno: ");
		String nombre = lectura.nextLine();
		unAlumno.setNombre(nombre);

		System.out.print("ingrese apellido de alumno: ");
		String apellido = lectura.nextLine();
		unAlumno.setApellido(apellido);

		boolean continua;
		do {
			try {
				continua = false;
				System.out.print("ingrese libreta universitaria de alumno: ");
				int lu = lectura.nextInt();
				unAlumno.setLibretaUniversitaria(lu);
			} catch (InputMismatchException ex) {
				System.out.println("Debe ingresar un número entero");
				lectura.nextLine();
				continua = true;
			}
		} while (continua);

		System.out.println("ingrese 5 notas de alumno: ");
		double nota;
		for (int i = 0; i < unAlumno.getNota().length; i++) {
			do {
				try {
					continua = false;
					System.out.print("ingrese nota para indice " + i + ": ");
					nota = lectura.nextDouble();
					if ((nota >= 0) && (nota <= 10)) {
						unAlumno.agregarNota(nota, i);
					} else {
						System.out.println("debe ingresar un numero entre [0,10]");
						lectura.nextLine();
						continua = true;
					}	
				} catch (InputMismatchException ex) {
					System.out.println("Debe ingresar un número entero");
					lectura.nextLine();
					continua = true;
				}
			} while (continua);
		}

		System.out.println("nombre de alumno: "+unAlumno.getNombre());
		System.out.println("apellido de alumno: "+unAlumno.getApellido());
		System.out.println("libreta universitaria de alumno: "+unAlumno.getLibretaUniversitaria());
		System.out.print("notas del alumno: ");
		for (int i = 0; i < unAlumno.getNota().length; i++) {
			System.out.print(unAlumno.getNota()[i]+"  ");
		}
		lectura.close();
		System.out.println();
		System.out.println("el promedio de las notas del alumno es: " + unAlumno.calcularPromedio());
		System.out.println("la nota máxima del alumno es: " + unAlumno.obtenerNotaMaxima());

	}

}
