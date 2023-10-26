package Lista1;

import java.util.*;
import java.text.*;
import java.math.*;

public class exercicio12 {
	static String pergunta = "Qual forma geometrica você deseja calcular o volume?"
			+ "\n(1) Cubo\n(2) Paralelepípedos\n(3)Cilindros"
			+ "\n(4) Esfera\n(5) Cones\n(6) Sair";
	static Scanner scan = new Scanner(System.in);
	static DecimalFormat df = new DecimalFormat("00.00");

	public static void main(String[] args) {
		int opcao = 0;
		System.out.println(pergunta);
		opcao = scan.nextInt();
		while(opcao < 1 || opcao > 6) {
			System.out.println(pergunta);
			opcao = scan.nextInt();
		}
		
		if(opcao == 1) System.out.println("Resultado: " + Calcula_Cubo(retorna_valor()));
		if(opcao == 2) System.out.println("Resultado: " + Calcula_Paralelepipedo());
		if(opcao == 3) System.out.println("Resultado: " + Calcula_Cilindros());
		if(opcao == 4) System.out.println("Resultado: " + Calcula_Esfera(retorna_valor()));
		if(opcao == 5) System.out.println("Resultado: " + Calcula_Cubo(retorna_valor()));
		if(opcao == 6) System.out.println("Programa finalizado.");
	}
	
	private static double Calcula_Cubo(double value) {
		return Math.pow(value, 3);
	}
	
	private static double Calcula_Paralelepipedo() {
		System.out.println("Insira o valor da largura: ");
		double larg = scan.nextDouble();
		System.out.println("Insira o valor do comprimento: ");
		double comp = scan.nextDouble();
		System.out.println("Insira o valor da altura:");
		double alt = scan.nextDouble();
		return larg * comp * alt;
	}
	
	private static double Calcula_Cilindros() {
		System.out.println("Insira o valor do raio: ");
		double r = scan.nextDouble();
		System.out.println("Insira o valor da altura: ");
		double h = scan.nextDouble();
		return Math.PI * Math.pow(r, 2) * h;
	}
	
	private static double Calcula_Esfera(double value) {
		return 4/3 * Math.PI * Math.pow(value, 3);
	}
	private static double retorna_valor() {
		System.out.println("Insira um valor: ");
		double value = scan.nextDouble();
		return value;
	}

}
