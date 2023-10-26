package Lista1;

import java.util.*;
import java.text.*;
import java.math.*;

public class exercicio14 {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Informe um valor da massa. Digite -1 para terminar.");
		double massa = scan.nextLong();
		
		while(massa >= 0) {
			long sec = diluicao(massa);
			String tempo = formata(sec);
			
			System.out.println("Tempo de redução: " + tempo);
			System.out.println("Massa inicial: " + massa);
			System.out.println("Tempo de redução: " + tempo);
			
			System.out.println("Informe um valor da massa. Digite -1 para terminar.");
			massa = scan.nextLong();
		}
	}

	private static long diluicao(double massa) {
		int contaCiclos = 0;
		
		while (massa > 0.5) {
			massa /= 2;
			contaCiclos ++;
		}
		
		return contaCiclos * 50;
	}
	
	public static String formata(long sec) {
		long h = sec / 3600;
		sec = sec % 3600;
		long m = sec / 60;
		sec = sec % 60;
		
		DecimalFormat df = new DecimalFormat("00");
		
		return df.format(h) + ":" + df.format(m) + ":" + df.format(sec);
	}
}
