package Lista1;

import java.math.*;
import java.text.*;
import java.util.*;

public class exercicio5 {

	// Incompleto
	 
	static Scanner scan = new Scanner (System.in);
	static DecimalFormat df = new DecimalFormat("00");
	
	public static String tempo(int sec) {
		int h = sec / 3600;
		sec %= 3600;
		int m = sec / 60;
		sec %= 3600;
		
		String time = h + ":" + m + ":" + sec;
		
		return df.format(h) + ":" + df.format(m) + ":" + df.format(sec);
	}
	
	public static void main(String[] args) {
		System.out.println("Informe tempo de processo? S/N");
		String continua = scan.next();
		
		while (continua.equalsIgnoreCase("S")) {
			System.out.println("Informe o tempo de processo em segundos");
			int sec = scan.nextInt();
			
			while (sec < 0) {
				System.out.println("valor negativo inválodp, informe o tempo de processo em segundos");
				sec = scan.nextInt();
			}
			
			String t = tempo(sec);
			
			System.out.println("O tempo de processo é: " + t);
			System.out.println("Informar notas? S/N");
			continua = scan.next();
			
		}
		System.out.println("FIM");
	}

}
