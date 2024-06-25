package model;

public class Pelicula {
	String nombre;
	int fechaDeLanzamiento;
	int duracionEnMinutos;
	boolean includidoEnElPlan;
	double sumaDelasEvaluaciones;
	int totalDeLasEvaluaciones;

	void muestraFichaTecnica() {
		System.out.println("El nombre de la pelicula es: " + nombre);
		System.out.println("Su fecha de lanzamiento es: " + fechaDeLanzamiento);
		System.out.println("Su duracion en minutos es: " + duracionEnMinutos);
	}
	void evalua(double nota) {
		sumaDelasEvaluaciones=sumaDelasEvaluaciones+nota;
		totalDeLasEvaluaciones++;
	}
	double calculaMedia() {
		return sumaDelasEvaluaciones/totalDeLasEvaluaciones;
	}
}
