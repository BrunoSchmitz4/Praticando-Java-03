package lista_while01;

import java.util.*;
import java.text.*;

public class while03 {
	/*
	 3.	Um comerciante deseja fazer o levantamento do lucro das mercadorias que ele comercializa. 
	 Fazer um programa que determine e escreva quantas mercadorias proporcionam:
	a)	lucro < 10%
	b)	10% <= lucro <= 20%
	c)	lucro > 20%
	Ao final, determine e escreva o valor total de compra e de venda de todas as mercadorias, 
	assim como o lucro total. Este programa deverá calcular o lucro das mercadorias até o momento 
	em que o usuário resolver terminar o programa(nome da mercadoria = “X”).
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Nome do produto: ");
		String prod = scan.next();
		
		System.out.println("Gasto por " + prod + ":");
		double gasto = scan.nextDouble();
		
		System.out.println("Quantidade de " + prod + " comprada:");
		int qtd = scan.nextInt();
		System.out.println("Gasto total com " + prod + ": R$ " + (gasto * qtd));
		double lucro = scan.nextDouble();
		
		
	}

}
