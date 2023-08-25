package Lista3;

import java.util.*;

public class while02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//String resposta = "";
		
		//while(!resposta.equalsIgnoreCase("s")) {
			//System.out.println("Informar valor?(S/N): ");
			//resposta = scan.next();
			//System.out.println(resposta);
			
		//}
		
		
		//System.out.println("Informe um valor: (S/N)");
		//String resp1 = scan.next();
		
		//while(resp1 != "S" || resp1 != "s") {
			//System.out.println("Informe um valor: (S/N)");
			//resp1 = scan.next();
		//};
		
		// versão do prof
		
		System.out.println("Infromar valor? S/N");
		String resp = scan.next();
		int soma = 0;
		while(!resp.equalsIgnoreCase("S")) {
			System.out.println("Informe um valor: ");
			int valor = scan.nextInt();
			soma += valor;
			
			System.out.println("Informar vvalor? s/n");
			resp = scan.next();
		}
		System.out.println("Soma: " + soma);
	}

}
