package nivel1;

import java.util.Scanner;

public class questao03 {

	public static void main(String[] args) {
		
		float raio;
		float raioQuadrado;
		double altura;
		double volume;
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o Raio: ");
		raio = scan.nextFloat();
		raioQuadrado = raio*raio;
		
		
		System.out.println("Digite a altura: ");
		altura = scan.nextFloat();
		
		volume = Math.PI * raioQuadrado * altura;
		
		System.out.println("O valor do Volume para o raio " + raio + ", e altura " + altura + " é de: " + volume);
	}

}
