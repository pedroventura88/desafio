package nivel1;

import java.util.Scanner;

public class questao06 {

	public static void main(String[] args) {
		
		double valorAltura, valorBaseMenor, valorBaseMaior, areaTrapezio, juncaoBases, areaQuadrado, volumeCubo;
		
		juncaoBases = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\n############ Quest�o 06 - Area do Trap�zio ############");
		System.out.println("Insira o valor da Altura ");
		valorAltura = scan.nextDouble();
		
		System.out.println("Insira o valor da base maior: ");
		valorBaseMenor = scan.nextDouble();
		
		System.out.println("Insira o valor da base menor: ");
		valorBaseMaior = scan.nextDouble();

		
		juncaoBases = valorBaseMenor + valorBaseMaior;
		
		areaTrapezio = valorAltura * (juncaoBases / 2);
		
		
		System.out.println("\nA �rea do trap�zio �: " + areaTrapezio);
		
		areaQuadrado = valorBaseMenor*valorBaseMenor;
		
		System.out.println("\nA �rea do Quadrado �: " + areaQuadrado);
		
		volumeCubo = valorAltura*valorAltura*valorAltura;
		
		System.out.println("\nO Volume do cubo �:" + volumeCubo);
		
		
		
		

	}

}
