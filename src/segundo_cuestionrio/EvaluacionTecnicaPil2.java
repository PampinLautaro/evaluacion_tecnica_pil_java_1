package segundo_cuestionrio;

import java.util.ArrayList;
import java.util.Arrays;
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
	
	public List<Candidato> inicializarCandidatos() {
		List<Candidato> candidatos = new ArrayList<Candidato>();
		candidatos.add(new Candidato(3L, "Jhon", "Doe", 2, 5000.00, Arrays.asList(new Tecnologias(1L, "Java"), new Tecnologias(2L, "Angular"), new Tecnologias(3L, "SQL"))));
		candidatos.add(new Candidato(7L, "Matias", "Otamendi", 9, 3000.00, Arrays.asList(new Tecnologias(8L, "NodeJS"), new Tecnologias(1L, "Java"))));
		candidatos.add(new Candidato(1L, "Joaquin", "Tagliafico", 6, 2000.00, Arrays.asList(new Tecnologias(7L, "MongoDB"), new Tecnologias(4L, "NoSQL"))));
		candidatos.add(new Candidato(4L, "Gaston", "Mac Allister", 1, 5000.50, Arrays.asList(new Tecnologias(5L, "Vue"), new Tecnologias(3L, "SQL"), new Tecnologias(1L, "Java"))));
		candidatos.add(new Candidato(5L, "Pablo", "DE Paul", 4, 9000.50, Arrays.asList(new Tecnologias(1L, "Java"))));
		candidatos.add(new Candidato(2L, "Lucas", "Di Maria", 7, 6000.00, Arrays.asList(new Tecnologias(1L, "Java"), new Tecnologias(2L, "Angular"), new Tecnologias(3L, "SQL"))));
		candidatos.add(new Candidato(10L, "Lionel", "Messi", 10, 10000.10, Arrays.asList(new Tecnologias(3L, "SQL"), new Tecnologias(5L, "Vue"), new Tecnologias(1L, "Java"))));
		candidatos.add(new Candidato(9L, "Julian", "Alvarez", 3, 5000.00, Arrays.asList(new Tecnologias(4L, "NoSQL"), new Tecnologias(7L, "MongoDB"), new Tecnologias(3L, "SQL"), new Tecnologias(1L, "Java"))));
		candidatos.add(new Candidato(8L, "Lula", "Martinez", 2, 1000.00, Arrays.asList(new Tecnologias(6L, ".Net"), new Tecnologias(1L, "Java"), new Tecnologias(2L, "Angular"))));
		candidatos.add(new Candidato(6L, "Agustin", "Dybala", 2, 1000.00, Arrays.asList(new Tecnologias(1L, "Java"), new Tecnologias(6L, ".Net"), new Tecnologias(2L, "Angular"))));
		return candidatos;
	}
	
	public void resolverPunto1 (List<Candidato> candidatos) {
		/*candidatos.forEach(System.out::println);*/
		System.out.println("lista candidatos = " + candidatos);
	}
	
	public void resolverPunto2 (List<Candidato> candidatos) {
		candidatos.stream().sorted((cand1, cand2) -> cand1.compareTo(cand2))
		.forEach(cand -> System.out.println(cand.getPretensionSalarial() + " " + cand.getNombre() + " " + cand.getApellido()));;
	}
	
	public void resolverPunto3 (List<Candidato> candidatos) {
		candidatos.stream().sorted((cand1, cand2) -> cand2.getPretensionSalarial().compareTo(cand1.getPretensionSalarial()))
        .forEach(cand -> System.out.println(cand.getPretensionSalarial() + " " + cand.getNombre() + " " + cand.getApellido()));
	}
}

