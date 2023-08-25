package Lista3;

import java.util.*;

public class while01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		//int x = 1;
		
		//while (x <= 1000) {
			//if(x % 2 != 0) { System.out.println("X: " + (x));};
			//x ++;
		//}
		
		//int y = 1;
		//while(y <= 1001) {
			//System.out.println("Y: " + y);
			//y += 2;
		//}
		
		System.out.println("Insira um valor entre 0 e 10");
		int value = scan.nextInt();
		while(value < 0 || value > 10) {
			System.out.println("Insira um valor entre 0 e 10:");
			value = scan.nextInt();
		}
		System.out.println("Valor inserido: " + value);
	}

}
