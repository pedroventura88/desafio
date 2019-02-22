package nivel1;

import java.util.Scanner;

public class questao09 {

	public static void main(String[] args) {
		
		String dia, mes, ano, resultado, dataComposta; 
//		20180220
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nDigite a data Composta, sem espaços nem barras: ");
		dataComposta = scan.next();
		
		ano = dataComposta.substring(0,4);
		System.out.println("\nO ano é: " + ano);
		mes = dataComposta.substring(4,6);
		System.out.println("\nO mês é: " + mes);
		dia = dataComposta.substring(6,8);
		System.out.println("\nO dia é: " + dia);
		
		

	}

}
