package Lista1;

import java.util.*;
import java.text.*;
import java.math.*;

public class exercicio1 {

	static Scanner scan = new Scanner (System.in);
	static DecimalFormat df = new DecimalFormat("####0.00");
	
	public static double calculaVolume(double raio) {
		
		return 4/3 * Math.PI * Math.pow(raio, 3);
	}
	
	public static void main(String[] args) {
		System.out.println("Informar raio? S/N");
		String continua = scan.next();
		
		while(continua.equalsIgnoreCase("S")) {
			System.out.println("Informe um valor para o raio da esfera:");
			double raio = scan.nextDouble();
			
			System.out.println("O volume da esfera é: " + df.format(calculaVolume(raio)));
			
			System.out.println("Informe valor? S/N");
			continua = scan.next();
		}
	}

}
