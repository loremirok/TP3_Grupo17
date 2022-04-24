package ar.edu.unju.fi.ejercicio8;

import java.util.ArrayList;
import java.util.Scanner;

import fi.unju.edu.ar.ejercicio3.Alumno;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
		String opcion;
		
		
		do {
			System.out.println("------------------");
			System.out.println("Menu");
			System.out.println(" ");
			
			System.out.println("1- Nuevo Alumno");
			System.out.println("2- Eliminar ALumno");
			System.out.println("3- Modificar notas alumno");
			System.out.println("4- Mostrar todos los alumnos");
			System.out.println("5- Mostrar los que superan el promedio de 6");
			System.out.println("6- Salir.");
			
			System.out.println("------------------");
			System.out.println("Ingrese una opcion: ");
			
			opcion = scan.next();
			switch (opcion) {
			case "1":
				Alumno alumno = new Alumno();
				System.out.println("Ingrese Nombre: ");
				alumno.setNombre(scan.next());
				System.out.println("Ingrese Apellido: ");
				alumno.setApellido(scan.next());
				System.out.println("Ingrese Libreta Universitaria: ");
				alumno.setLibretaUniversitaria(scan.nextInt());
				double[] nota=new double[5];
				for (int i = 0; i < alumno.getNota().length; i++) {
					System.out.println("Ingrese Nota "+(i+1)+": ");
					nota[i]=(scan.nextDouble());
				}
				alumno.setNota(nota);
				
				listaAlumnos.add(alumno);
				break;
			case "2":
				System.out.println("Ingrese Libreta para eliminar alumno: ");
				for (int i = 0; i < listaAlumnos.size(); i++) {
					if(listaAlumnos.get(i).getLibretaUniversitaria() == scan.nextInt()) {		
						listaAlumnos.remove(listaAlumnos.get(i));
					}
				}
				break;
			case "3":
				
				System.out.println("Ingrese Libreta para Modificar alumno: ");
				int libreta = scan.nextInt();
				
				for (int i = 0; i < listaAlumnos.size(); i++) {
					if(listaAlumnos.get(i).getLibretaUniversitaria() == libreta) {	
						listaAlumnos.get(i).mostrarNotas();
						System.out.println(".............");
						double[] nuevaNota=new double[5];
						for (int j = 0; j < listaAlumnos.get(i).getNota().length; j++) {
							System.out.println("Ingrese Nueva Nota: "+(j+1)+" ");
							nuevaNota[j]=scan.nextDouble();
						} 
						listaAlumnos.get(i).setNota(nuevaNota);
					}
				}
				break;
			case "4":
				for (Alumno alumno3 : listaAlumnos) {
					System.out.println("Nombre: "+ alumno3.getNombre());
					System.out.println("Apellido: "+ alumno3.getApellido());
					System.out.println("Libreta Universitaria: "+ alumno3.getLibretaUniversitaria());
					System.out.println("Notas: "+alumno3.mostrarNotas());
					
					;
					}
					
				
				break;
			case "5":
				for (int i = 0; i < listaAlumnos.size(); i++) {
					
					if(listaAlumnos.get(i).calcularPromedio() >6 ) {		
						for (Alumno alumno4 : listaAlumnos) {
							System.out.println("Nombre: "+ alumno4.getNombre());
							System.out.println("Apellido: "+ alumno4.getApellido());
							System.out.println("Libreta Universitaria: "+ alumno4.getLibretaUniversitaria());
							System.out.println("Notas: "+ alumno4.mostrarNotas());
						}
					}
				}
				break;
			
			default:
				System.out.println("Ingrese una opcion valida");
				break;
			}
		}while(!opcion.equals("6"));

	}

}
