package Lista3;

import java.util.*;
import java.text.*;

public class while03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat dec = new DecimalFormat("##0.00");
		DecimalFormat dP = new DecimalFormat("R$ ##0.00");
		
		double totalPC = 0;
		double totalPV = 0;
		double totalLucro = 0;
		int contaMaior20 = 0;
		int conta1020 = 0;
		int contaMenor10 = 0;
		System.out.println("Calcular nova mercadoria? Digite x para terminar");
		
		String merc = scan.next();
		
		while (!merc.equalsIgnoreCase("X")) {
			System.out.println("Informe o preço da compra: ");
			double prC = scan.nextDouble();
			
			System.out.println("Informe o preço de venda");
			double prV = scan.nextDouble();
			totalPV += prV;
			double lucro = ((prV - prC)/ prV) * 100;
			System.out.println("O lucro é de R$ " + dP.format(lucro) + "");
			
			if(lucro > 20) {
				contaMaior20++;
			}else if (lucro >= 10) {
				conta1020++;
			}
			else {
				contaMenor10++;
			}
			System.out.println("Calcular nova mercadoria? Digite x para terminar");
			
		}
		System.out.println(
				"Preços de venda: R$ " + dec.format(totalPC) + 
				"\nPreços de venda: R$ " + dec.format(totalPV) +
				"\nLucro total: " + dec.format(totalLucro) +
				"\nMercadoria com lucro menor que 10%: " + contaMenor10 + 
				"\nMercadoria com lucro entre 10% e 20%: " + conta1020 +
				"\nMercadoria com lucro maior que 20%: " + contaMaior20);
	}

}
