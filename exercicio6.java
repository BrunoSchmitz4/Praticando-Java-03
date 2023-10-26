package Lista1;

import java.util.*;
import java.text.*;
import java.math.*;

public class exercicio6 {
	static Scanner s = new Scanner(System.in);
	static DecimalFormat df = new DecimalFormat("");
	
	public static int tempo(int anos, int meses, int dias) {
		return (anos * 365) + (meses * 30) + dias;
	}
	public static void main(String[] args) {
		System.out.println("Informar tempo de vida de uma pessoa S/N");
		String continua = s.next();
		
		while(continua.equalsIgnoreCase("S")) {
			System.out.println("Informe quantos anos de vida");
			int a = s.nextInt();
			System.out.println("Informe quantos meses");
			int m = s.nextInt();
			System.out.println("Informe quantos dias");
			int d = s.nextInt();
			
			System.out.println("Esta pessoa tem: " + tempo(a, m, d) + " dias de vida");
					
			System.out.println("Informar notas? S/N");
			continua = s.next();
		}
		System.out.println("FIM");
	}

}
