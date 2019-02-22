package nivel1;

import java.util.Scanner;

public class questao06 {

	public static void main(String[] args) {
		
		double valorAltura, valorBaseMenor, valorBaseMaior, areaTrapezio, juncaoBases, areaQuadrado, volumeCubo;
		
		juncaoBases = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\n############ Questão 06 - Area do Trapézio ############");
		System.out.println("Insira o valor da Altura ");
		valorAltura = scan.nextDouble();
		
		System.out.println("Insira o valor da base maior: ");
		valorBaseMenor = scan.nextDouble();
		
		System.out.println("Insira o valor da base menor: ");
		valorBaseMaior = scan.nextDouble();

		
		juncaoBases = valorBaseMenor + valorBaseMaior;
		
		areaTrapezio = valorAltura * (juncaoBases / 2);
		
		
		System.out.println("\nA área do trapézio é: " + areaTrapezio);
		
		areaQuadrado = valorBaseMenor*valorBaseMenor;
		
		System.out.println("\nA área do Quadrado é: " + areaQuadrado);
		
		volumeCubo = valorAltura*valorAltura*valorAltura;
		
		System.out.println("\nO Volume do cubo é:" + volumeCubo);
		
		
		
		

	}

}
