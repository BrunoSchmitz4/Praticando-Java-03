package lista_while01;

import java.util.*;
import java.text.*;

public class while04 {

	public static void main(String[] args) {
		Scanner  s = new Scanner(System.in);
		DecimalFormat d = new DecimalFormat("R$ #0.00");
		
		
		System.out.println("Adicionar um novo curso? Insira o X para finalizar.");
		String merc =  s.next();
		
		double cod_Curso = 0;
		double cod_CursoMaior = 0;
		double num_vagas = 0;
		double indice = 0;
		double maiorIndice = 0;
		double num_vagas_fem = 0;
		double num_vagas_masc = 0;
		double per_fem = 0;
		double per_masc = 0;
		
		while(!merc.equalsIgnoreCase("X")){
		System.out.println("Insira o código do curso: ");
		 cod_Curso = s.nextDouble();
		
		System.out.println("Insira o números de vagas: ");
		 num_vagas = s.nextDouble();
		
		System.out.println("Insira o número de vagas femeninas: ");
		 num_vagas_fem = s.nextDouble();
		
		System.out.println("Insira o número de vagas masculinas: ");
		 num_vagas_masc = s.nextDouble();
		
		System.out.println("Adicionar um novo curso? Insira o X para finalizar.");
		 merc =  s.next();
		
		 
		 per_fem = (num_vagas_fem * 100) / (num_vagas_fem + num_vagas_masc);	
		 per_masc = (num_vagas_masc * 100) / (num_vagas_masc + num_vagas_fem);
		 
		 indice = (num_vagas_fem + num_vagas_masc) / num_vagas;
		 if(indice > indice) {
			 maiorIndice = indice;
			 cod_CursoMaior = cod_Curso;
		 }
		 if(maiorIndice > 0 && maiorIndice > indice) {
			 System.out.println("O curso " + cod_CursoMaior + " tem o indice de vagas" + "(" + maiorIndice + "), "
			 		+ "maior que o curso " + cod_Curso + ", com um indice de " + indice);
		 }
		}
		
		
		System.out.println("\nSobre o curso" + cod_CursoMaior + "de indice" + maiorIndice);
		System.out.println("\nPreenchidas "+ num_vagas+ " vagas");
		System.out.println("\nPreenchidas "+ num_vagas_fem+ " vagas femininas com o percentual de "+ per_fem+ "%");
		System.out.println("\nPreenchidas "+ num_vagas_masc + " vagas masculinas com o percentual de "+ per_masc+ "%");
		
		if(num_vagas_fem > num_vagas_masc){
			System.out.println("\nExistem mais vagas femininas");
		}
			else
				if(num_vagas_masc > num_vagas_fem) {
					System.out.println("\\nExistem mais vagas masculinas");
				}
				else {
					System.out.println("\\Existe o mesmo número de vagas do sexo masculino e feminino.");
				}
			
		
		}

}
