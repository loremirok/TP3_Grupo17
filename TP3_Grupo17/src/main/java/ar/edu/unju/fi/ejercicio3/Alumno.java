package ar.edu.unju.fi.ejercicio3;

public class Alumno {
	private String nombre;
	private String apellido;
	private int libretaUniversitaria;
	private double[] nota=new double[5];
	
	public Alumno() {
		// TODO Auto-generated constructor stub
	}

	public Alumno(String nombre, String apellido, int libretaUniversitaria, double[] nota) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.libretaUniversitaria = libretaUniversitaria;
		this.nota = nota;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getLibretaUniversitaria() {
		return libretaUniversitaria;
	}

	public void setLibretaUniversitaria(int libretaUniversitaria) {
		this.libretaUniversitaria = libretaUniversitaria;
	}

	public double[] getNota() {
		return nota;
	}

	public void setNota(double[] nota) {
		this.nota = nota;
	}

	
	public void agregarNota(double calificacion, int posicion) {
        nota[posicion] = calificacion;
    }
	
	public double calcularPromedio() {
		double promedio,suma=0;
		int i;
		for ( i=0; i<nota.length;i++) {
			suma=suma+nota[i];
		}
		promedio=suma/i;
		return promedio;
	}
	
	public double obtenerNotaMaxima() {
		double notaMax=0;
		int i;
		boolean band=true;
		for(i=0;i<nota.length;i++) {
			if(band) {
				notaMax=nota[i];
				band=false;
			}else {
				if(nota[i]>notaMax) {
					notaMax=nota[i];
				}
			}
		}
		return notaMax;
	}
	public String mostrarNotas() {
		String notas = "";
		for (int i = 0; i < this.nota.length; i++) {
			notas += "Nota "+(i+1)+": "+this.nota[i]+" ";
		}
		
		return notas;
	}
	
	
}
