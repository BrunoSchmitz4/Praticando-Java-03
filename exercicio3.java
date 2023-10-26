package Lista1;

import java.util.*;
import java.text.*;
import java.math.*;

public class exercicio3 {

	static Scanner scan = new Scanner (System.in);

	public static void main(String[] args) {
		System.out.println("Insira um valor: ");
		int value = scan.nextInt();
		System.out.println(detectaPrimo(value));
		
		System.out.println("Insira quantas calorias seu prato tem:");
		int valor = scan.nextInt();
		
		
	}
	

 	public static String detectaPrimo(int value) {
		int finder = 0;

		for(int i = 1;i <= value; i++) {
			if (value % i == 0)
				finder ++;
			
			if (finder > 2)
				return (value + " não é primo.");
		}
		return (value + " é primo.");
		
	}
}
