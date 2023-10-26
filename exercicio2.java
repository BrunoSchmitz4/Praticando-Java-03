package Lista1;

import java.util.*;
import java.text.*;
import java.math.*;


public class exercicio2 {

	static Scanner scan = new Scanner (System.in);
	static DecimalFormat df = new DecimalFormat("####0.00");
	
	public static double calculaMedia (double n1, double n2, double n3, String tipo) {
		if (tipo.equalsIgnoreCase("A"))
			return (n1 + n2 + n3) / 3;
		if (tipo.equalsIgnoreCase("P"))
			return (n1 * 0.5 + n2 * 0.3 + n3 * 0.2);
		return -1;
	}
	
	public static void main (String[] args) {
		System.out.println("Informar notas? S/N");
		String continua = scan.next();
		
		while (continua.equalsIgnoreCase("S")) {
			System.out.println("Informe nota 1");
			double nota1 = scan.nextDouble();
			System.out.println("Informe nota 2");
			double nota2 = scan.nextDouble();
			System.out.println("Informe nota 3");
			double nota3 = scan.nextDouble();
			
			System.out.println("Informe o tipo de média [A]Aritmetica [p]Ponderada");
			String tp = scan.next();
			
			double media = calculaMedia(nota1, nota2, nota3, tp);
			if (media == -1) {
				System.out.println("Não foi possível calcular a média");
			} else {
				System.out.println("A média é: " + df.format(media));
			}
			
			System.out.println("Informar notas? S/N");
			continua = scan.next();
		}
		
	}

}
