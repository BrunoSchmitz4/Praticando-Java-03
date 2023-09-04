package lista_while01;

import java.util.*;

public class while01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Valor decimal:");
		
		int val = scan.nextInt();
		
		String seq = "";
		while(val >= 2) {
			int resto = val % 2;
			seq = resto + seq;
			val = val / 2;
		}
		seq = val + seq;
		
		while(seq.length() <= 8) 
			seq = "0" + seq;
			System.out.println(seq);
		
	}

}
