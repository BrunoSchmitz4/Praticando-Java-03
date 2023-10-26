package Lista1;

import java.util.*;
import java.text.*;
import java.math.*;

public class exercicio13 {
	static Scanner scan = new Scanner(System.in);
	static DecimalFormat df = new DecimalFormat("00.00");
	
	public static void main(String[] args) {
		System.out.println("Informe um valor. Digite -1 para terminar");
		int valor = scan.nextInt();
		
		while(valor >= 0) {
			String lista = perfeito(valor);
			if (lista.equals("")) {
				System.out.println("Não é número perfeito.");
			} else {
				System.out.println("O número " + valor + " é perfeito. Lista de divisores: " + lista);
			}
			
			System.out.println("Informe um valor. Digite -1 para terminar.");
			valor = scan.nextInt();
		}
	}
	
	public static String perfeito(int val) {
		int soma = 0;
		String divisores = "";
		
		for (int i = 1; i < val; i++) {
			if (val % i == 0) {
				soma += i;
				divisores += "-" + i;
			}
		}
		if(soma == val) return divisores;
		return "";
	}

}
