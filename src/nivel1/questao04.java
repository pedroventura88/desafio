package nivel1;

import java.util.Scanner;

public class questao04 {

	public static void main(String[] args) {
		
		
		int num1;
		int num2;
		int num3;
		double mediaAritmetica;
		double mediaGeometrica;
		double multipilcaN;

		
		
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Digite o primeiro numero: ");
		num1 = scan.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		num2 = scan.nextInt();
		
		System.out.println("Digite o terceiro numero: ");
		num3 = scan.nextInt();
		
		mediaAritmetica = num1 + num2 + num3 / 3;
		multipilcaN = num1 * num2 * num3;
		mediaGeometrica = Math.cbrt(multipilcaN);
		
		System.out.println("A média Aritmética dos 3 números é: "+ mediaAritmetica);
		
		System.out.println("\nA média Geométrica dos 3 números é: "+ mediaGeometrica);
		
		
	}

}
