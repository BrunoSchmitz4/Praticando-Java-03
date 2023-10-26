package Lista1;

import java.util.*;
import java.text.*;
import java.math.*;

public class exercicio15 {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Informar mais um lote? S/N");
		String continua = scan.next();
		int qtd10 = 0; int qtd15 = 0; int qtd20 = 0; int qtd25 = 0; int naoCabe = 0;

		while(continua.equalsIgnoreCase("S")) {
			System.out.println("Informe a quantidade: ");
			int qtd = scan.nextInt();
			System.out.println("Informe as medidas da caixa: \n\n");
			System.out.println("Informe largura: ");
			int lar = scan.nextInt();
			System.out.println("Informe altura: ");
			int alt = scan.nextInt();
			System.out.println("Informe comprimento: ");
			int com = scan.nextInt();
			double maiorD = maiorDiagonal(lar, alt, com);
			
			if (cabe(maiorD, 10)) {
				qtd10 += qtd;
			} else if (cabe (maiorD, 15)) {
				qtd15 += qtd;
			} else if (cabe (maiorD, 20)) {
				qtd20 += qtd;
			} else if (cabe (maiorD, 25)) {
				qtd25 += qtd;
			} else naoCabe+= qtd;
			
			System.out.println("Informar mais um lote? S/N");
			continua = scan.next();
		}
		
		// falta completar
		System.out.println("Necessidade de compra.");
		System.out.println("Necessidade de compra.");
		System.out.println("Necessidade de compra.");
		System.out.println("Necessidade de compra.");
		System.out.println("Necessidade de compra.");
	}

	public static double maiorDiagonal(int a, int b, int c) {
		return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
	}
	
	public static boolean cabe(double maiorDiagonal, int raio) {
		if (maiorDiagonal <= raio) return true;
		return false;
	}
}
