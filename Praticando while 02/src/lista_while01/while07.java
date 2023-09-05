package lista_while01;

import java.util.*;
import java.text.*;

public class while07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int value = 1000;
		
		int first = 0;
		int second = 0;
		
		while(value <= 9999) {
			first = value / 100;
			second = value % 100;
			if(((first + second) * (first + second)) == value) {
				System.out.println("Valores legais: " + value);
			}
			value += 1;
		}
		
	}

}
