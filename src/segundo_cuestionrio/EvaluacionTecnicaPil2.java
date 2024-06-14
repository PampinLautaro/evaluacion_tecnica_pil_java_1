package segundo_cuestionrio;

import java.util.ArrayList;
import java.util.List;

public class EvaluacionTecnicaPil2 {
	
	public static void main(String[] args) {
		/*imprimirBienvenidaEvaluacionTecnica();
		imprimirMensajePunto(1);
		// Desarrollo de la consigna 1.
		inicializarCandidatos();
		resolverPunto1();
		imprimirMensajePunto(2);
		// Desarrollo de la consigna 2.
		resolverPunto2();
		imprimirMensajePunto(3);
		// Desarrollo de la consigna 3.
		resolverPunto3();
		imprimirMensajePunto(4);
		// Desarrollo de la consigna 3.
		resolverPunto4();

		| Evaluación técnica java

		imprimirMensajePunto(5);
		// Desarrollo de la consigna 3.
		resolverPunto5();*/
	}
	
	public static void inicializarCandidatos (String[] args) {
		List<Candidato> candidato = new ArrayList<Candidato>();
		candidato.add(new Candidato(3L, "Jhon", "Doe", 2, 5000.00, null));
		candidato.add(new Candidato(7L, "Matias", "Otamendi", 9, 3000.00, null));
		candidato.add(new Candidato(1L, "Joaquin", "Tagliafico", 6, 2000.00, null));
		candidato.add(new Candidato(4L, "Gaston", "Mac Allister", 1, 5000.50, null));
		candidato.add(new Candidato(5L, "Pablo", "DE Paul", 4, 9000.50, null));
		candidato.add(new Candidato(2L, "Lucas", "Di Maria", 7, 6000.00, null));
		candidato.add(new Candidato(10L, "Lionel", "Messi", 10, 10000.10, null));
		candidato.add(new Candidato(9L, "Julian", "Alvarez", 3, 5000.00, null));
		candidato.add(new Candidato(8L, "Lula", "Martinez", 2, 1000.00, null));
		candidato.add(new Candidato(6L, "Agustin", "Dybala", 2, 1000.00, null));
	}
	
	public static void resolverPunto1 (String[] args) {
		System.out.println("lista candidatos = " + candidato);
	}
	
	public static void resolverPunto2 (String[] args) {
		System.out.println("lista candidatos ordenada" + candidato.orderBy());
	}
	
	public static void resolverPunto3 (String[] args) {
		System.out.println("lista candidatos ordenada" + candidato.orderBy(pretensionSalarial));
	}
}

