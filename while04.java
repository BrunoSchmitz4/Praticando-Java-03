package Lista3;

import java.util.*;

import java.text.*;

public class while04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		DecimalFormat dF = new DecimalFormat("R$ #0.00");
		
		double cod_Curso = 0;
		double numero_vaga = 0;
		double num_cand_masc = 0;
		double num_cand_fem = 0;
		double per_fem = 0;
		double per_masc = 0;
		
		System.out.println("Adicionar um novo curso? Insira X para finalizar:");
		String merc = scan.next();
		
		while (!merc.equalsIgnoreCase("X")) {
			
			System.out.println("Insira o código do curso:");
			cod_Curso = scan.nextDouble();
			
			System.out.println("Insira o número de vagas:");
			numero_vaga = scan.nextDouble();
			
			System.out.println("Insira o número de vagas masculinas:");
			num_cand_masc = scan.nextDouble();
			
			System.out.println("Insira o número de vagas femininas:");
			num_cand_fem = scan.nextDouble();
			
			System.out.println("Adicionar um novo curso? Insira X para finalizar:");
			merc = scan.next();
			per_fem = ((numero_vaga - num_cand_fem)/ numero_vaga) * 100;
			per_masc = ((numero_vaga - num_cand_masc)/ numero_vaga) * 100;
			
		}
		if(num_cand_masc > num_cand_fem) {
			System.out.println("\nHá mais vagas masculinas do que femininas no curso " + cod_Curso);
		}else if(num_cand_masc == num_cand_fem) {
			System.out.println("\nO número de vagas masculinas é o mesmo que de vagas femininas no curso " + cod_Curso);
		}else {
			System.out.println("\nHá mais vagas femininas do que masculinas no curso " + cod_Curso);
		}
		
		System.out.println("\nTotal de vagas: " + numero_vaga);
		System.out.println("\nVagas masculinas: " + num_cand_masc);
		System.out.println("\nVagas femininas: " + num_cand_fem);
		System.out.println("\nPercentual de vagas femininas: " + per_fem + "%");
		System.out.println("\nPercentual de vagas masculinas: " + per_masc + "%");
		
	}

}
