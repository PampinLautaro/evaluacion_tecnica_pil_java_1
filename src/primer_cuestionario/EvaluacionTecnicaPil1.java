package primer_cuestionario;

public class EvaluacionTecnicaPil1 {

	public static void main(String[] args) {
		System.out.println("bienvenida evaluacion tecnica pil 1 \n");
		
		System.out.println("1. Declará al menos tres variables con tipos de datos primitivos.");
		 
		boolean b;
		double d;
		int i;
		
		System.out.println("\n2. A las variables declaradas anteriormente asignales un valor\n"
				+ "		*y realizá al menos dos cálculos matemáticos utilizando -operadores\n"
				+ "		*aritméticos-.");
		
		b = false;
		d = 67.67;
		i = 3;
		
		double suma = d + i;
		double multiplicacion = d*i;
		
		System.out.println("\n3. Planteá tres condiciones lógicas que cumplan con lo siguiente:\r\n"
				+ "		* a. Condición verdadera --> Imprimí por pantalla el resultado de los\r\n"
				+ "		cálculos anteriores.\r\n"
				+ "		* Condición falsa --> Imprimí por pantalla un mensaje de error.\r\n"
				+ "		* b. Condición verdadera --> Siempre que se cumpla, incrementá un valor\r\n"
				+ "		hasta que éste llegue al doble de su valor inicial.\r\n"
				+ "		* Antes de realizar esta condición, imprimí el valor inicial\r\n"
				+ "		de la variable que vas a modificar.\r\n"
				+ "\r\n"
				+ "		1\r\n"
				+ "\r\n"
				+ "		| Evaluación técnica java\r\n"
				+ "\r\n"
				+ "		* Finalmente, imprimí por pantalla el valor final.\r\n"
				+ "		* c. Iteración --> Realizá N cantidad de impresiones, siendo N un tercio del\r\n"
				+ "		valor de la variable del punto 'b'.\r\n"
				+ "		****/");
		b = i > d || suma > i;
		if(b == true) {
			System.out.println("suma = " + suma);
			System.out.println("multiplicacion = " + multiplicacion);
		}else {
			System.out.println("error");
		}
		
		int j = 6;
		int k = (j*2);
		System.out.println("j = " + j);
		System.out.println("k = " + k);
			for(int l = 1; l <= (k/3); ++l) {
					System.out.println("l = " + l);
			}
	}
}
