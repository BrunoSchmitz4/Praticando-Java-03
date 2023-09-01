package Lista3;

import java.util.*;

import java.text.*;

public class while04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		DecimalFormat dF = new DecimalFormat("R$ #0.00");
		
		System.out.println("Escreva um valor: ");
		double miau = scan.nextDouble();
		
		
		System.out.println(dF.format(miau));
	}

}
