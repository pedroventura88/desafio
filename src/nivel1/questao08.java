package nivel1;

import java.util.Scanner;

public class questao08 {

	public static void main(String[] args) {
		
		
		int dia, mes, ano;
		String dataUnida;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nDigite o dia: ");
		dia = scan.nextInt();
		
		System.out.println("\nDigite o mês: ");
		mes = scan.nextInt();
		
		System.out.println("\nDigite o ano: ");
		ano = scan.nextInt();
		
		dataUnida = "" + ano + mes + dia;
		
		System.out.println("A data formatada é: " + dataUnida);
		
		
	}

}
