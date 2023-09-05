package lista_while01;

import java.util.*;
import java.text.*;

public class while05 {

	public static void main(String[] args) {
		Scanner  scan = new Scanner(System.in);
		DecimalFormat dF = new DecimalFormat("R$ #0.00");

		System.out.println("Quantos números desejas calcular?");
		int qtd = scan.nextInt();
		int rpt = 1;
		
		
		while(rpt <= qtd) {
			int raiz_qtd = 0;
			
			System.out.println("\nInsira a " + rpt + "° raiz:");
			int raiz = scan.nextInt();
			int j = 1;
			
			rpt++;
			
			while(raiz != 0) {
				raiz -= j;
				raiz_qtd += 1;
				j += 2;
				
				if(raiz == 1 || raiz < 0) {
					System.out.println("Esta raiz não é exata.");
					break;
				} else if (raiz == 0){
					System.out.println("O valor da raiz é: " + raiz_qtd);
				}
			}
		}
	}

}
