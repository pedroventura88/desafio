package nivel1;

import java.util.Scanner;

public class questao05 {

	public static void main(String[] args) {
		
		double dividendo, divisor;
		double quociente, resto;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o Primeiro numero: ");
		dividendo = scan.nextInt();
		
		System.out.println("Digite o Segundo numero: ");
		divisor = scan.nextInt();
		
		quociente = dividendo / divisor;
		resto = dividendo % divisor;
		
		System.out.println("Este é o resto: " + resto);
		System.out.println("Este é o quociente: " + quociente);
		
		System.out.println("\n######### Brincadeirinha plus pro Teacher Daniel #########");
		
		if ((dividendo % 2) == 0) {
			System.out.println("- O primeiro numero digitado é Par.");
		} else {
			System.out.println("- O primeiro numero digitado é Impar.");
		}
		
		if ((divisor % 2) == 0) {
			System.out.println("- O segundo numero digitado é Par.");
		} else {
			System.out.println("- O segundo numero digitado é Impar.");
		}
		

	}

}
