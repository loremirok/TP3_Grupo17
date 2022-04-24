package ar.edu.unju.fi.ejercicio9;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	
	static ArrayList<Producto> productos = new ArrayList<Producto>();
	
	static Scanner sc = new Scanner(System.in);
	
	public static void Menu() {
		System.out.println("------------ MENU ------------");
		System.out.println("1. Nuevo producto");
		System.out.println("2. Mostrar todos los productos");
		System.out.println("3. Incrementar precio a todos los productos");
		System.out.println("4. Monto total de todos los productos");
		System.out.println("5. Fin");
		System.out.println("Ingrese  una opción: ");
	}
	
	public static void NuevoProducto() {
		System.out.println("Ingrese el código del producto: ");
		int cod = sc.nextInt();
		System.out.println("Ingrese la descripción: ");
		String desc = sc.next();
		System.out.println("Ingrese el precio: ");
		float precio = sc.nextFloat();
		System.out.println("Ingrese marca: ");
		String marca = sc.next();
		Producto p = new Producto(cod,desc,precio,marca);
		productos.add(p);
	}
	
	public static void MostrarProductos() {
		for(Producto p:productos) {
			System.out.println("Codigo: "+p.getCodigo());
			System.out.println("Descripcion: "+p.getDescripcion());
			System.out.println("Precio: "+p.getPrecio());
			System.out.println("Marca: "+p.getMarca()+"\n");
		}
	}
	
	public static void Incrementar() {
		float incremento = (float) 100.25;
		for(Producto p:productos) {
			p.setPrecio(p.getPrecio()+incremento);
		}
	}
	
	public static float MontoTotal() {
		float total = 0;
		for(Producto p: productos) {
			total +=p.getPrecio();
		}
		return total;
	}

	public static void main(String[] args) {
		
		int opc = 0;
		do {
			Menu();
			opc = sc.nextInt();
			switch(opc) {
			
			case 1:
				NuevoProducto();
				break;
			case 2:
				MostrarProductos();
				break;
			case 3:
				Incrementar();
				break;
			case 4:
				System.out.println("El monto total es: "+MontoTotal());
			default:
				System.out.println("--- Fin ---");
		
			}
		}while(opc != 5);
		

	}

}
