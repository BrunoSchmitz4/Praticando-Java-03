package lista_while01;

import java.util.*;
import java.text.*;

public class while02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("##.00");
		
		double f = 50;
		while(f <= 150) {
			System.out.println(f + "° -> C°:" + df.format((f - 32) * 5/9)  + "°");
			f ++;
		}
	}

}
