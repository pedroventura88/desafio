package nivel1;

import java.util.Scanner;

public class questao12 {

	public static void main(String[] args) {
		
		String nomeVend;
		double salarioFixo, percentual, percentPlusTotal, salarioTotal;
		int totalVendas;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o nome do vendedor: ");
		nomeVend = scan.nextLine();
		
		System.out.println("Informe o sal�rio fixo: ");
		salarioFixo = scan.nextDouble();
		
		System.out.println("Informe o valor total de vendas : ");
		totalVendas = scan.nextInt();

		System.out.println("Qual � o % que ele ganha sob o total de vendas");
		percentual = scan.nextDouble();
		
		percentPlusTotal = (totalVendas * percentual)/100;
		
		salarioTotal = salarioFixo + percentPlusTotal;
		
		System.out.println("\nO valor percentual � :" + percentPlusTotal);
		System.out.println(nomeVend + " tem o sal�rio total de : R$" + salarioTotal);
		
		
	}

}
