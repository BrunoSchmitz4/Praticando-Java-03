package Lista1;

import java.util.*;
import java.text.*;
import java.math.*;

public class conjunto_exercicios {

	static Scanner scan = new Scanner(System.in);
	static DecimalFormat df = new DecimalFormat("00.00");
	static String exer = "Escolha o exercício à desejado"
								+ "\n1) Volume esfera |"
								+ " 2) Média Ari/Pon |"
								+ "\n3) Detecta primo |"
								+ "\n0) Sair";

	// Meu camarada, o Main! :) <3
	public static void main(String[] args) {
		
		System.out.println(exer);
		int option = scan.nextInt();
		call_func(option);

	}
	
	// Exercício 01
	public static void exer_one(double raio) {
		double vol = (4/3 * Math.PI * Math.pow(raio, 3));
		System.out.println("Valor do raio: " + df.format(vol));
	}
		
	// Exercício 02
	public static void exer_two(double value) {
		double n1 = 0;
		double n2 = 0;
		double n3 = 0;
		System.out.println("Insira a 1° nota:");
		n1 = scan.nextDouble();
		System.out.println("Insira a 2° nota:");
		n2 = scan.nextDouble();
		System.out.println("Insira a 3° nota:");
		n3 = scan.nextDouble();
		
		// Média Aritmética
		if(value == 1) System.out.println("Média aritmética: " + df.format(((n1 + n2 + n3) /3)));
		// Média Ponderada
		else System.out.println("Média ponderada: " + df.format( n1 * 0.5 + n2 * 0.3 + n3 * 0.2 ));
	}
	
	// Exercício 03
	public static void exer_thr(double value) {
		int finder = 0;

		for(int i = 1;i <= value; i++) {
			if (value % i == 0)
				finder ++;
		}
		if (finder > 2) System.out.println(value + " não é primo.");
		else System.out.println(value + " é primo.");
	}
	
	public static void exer_ele(double value) {
		
	}
	
	// Chama a função desejada pelo usuário
		public static void call_func(int option) {
			while((option < 0) || (option > 15)) {
				System.out.println(exer);
				option = scan.nextInt();	
			}
			
			// Prepara exercício 1
			if(option == 1) {
				System.out.println("Insira o valor do raio:");
				double value = scan.nextDouble();
				while(value <= 0) {
						System.out.println("Insira um valor maior que 0 para o raio:");
						value = scan.nextDouble();
				}
				looper(value, option);	
			}
			
			// Prepara exercício 2
			if(option == 2) {
				System.out.println("Escolha uma média à calcular: \nA)Aritmética;\nP)Ponderada");
				String tipo_media = scan.next();
				double value = 0;
				while((!tipo_media.equalsIgnoreCase("A")) && (!tipo_media.equalsIgnoreCase("P"))) {
					System.out.println("Escolha uma média à calcular: A)Aritmética;\nP)Ponderada");
					tipo_media = scan.next();
				}
				if(tipo_media.equalsIgnoreCase("A")) looper(1, option);
				else if (tipo_media.equalsIgnoreCase("P")) looper(2, option);
			}
			
			// Prepara exercício 3
			if(option == 3) {
				System.out.println("Insira um valor:");
				double value = scan.nextDouble();
				while(value <= 0) {
					System.out.println("Insira um valor:");
					value = scan.nextDouble();
				}
				looper(value, option);
			}
			
			// Prepara exercício 4
			if(option == 4) {
				double values[] = new double[3];
				double a = 0.0;
				double b = 0.0;
				double c = 0.0;
				System.out.println("Insira o valor de A:");
				a = scan.nextDouble();
				System.out.println("Insira o valor de B:");
				b = scan.nextDouble();
				System.out.println("Insira o valor de C:");
				c = scan.nextDouble();
				// A continuar...
			}
			
			if(option == 12) {
				int cont = 0;
				String continuar = "";
				int value = 0;
				System.out.println("Quer prosseguir?(S/N) (" + (30 - cont) + " adições restantes)");
				while(!continuar.equalsIgnoreCase("N") && cont <= 30) {
					System.out.println("Insira um valor abaixo: ");
					value = scan.nextInt();
				}
			}
		}
	
	// Intermédio entre funções que as chama
	public static void looper(double value, int option) {
		boolean val_check = false;
		if(value >= 0) val_check = true;

		if(val_check && option == 1) exer_one(value);
		if(val_check && option == 2) exer_two(value);
		if(val_check && option == 3) exer_thr(value);
//		if(val_check && option == 4) exer_fou(value);
		
		// Questões da segunda lista
//		if()
		call_func(-1);
	}

}
