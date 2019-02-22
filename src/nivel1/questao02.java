package nivel1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class questao02 {

	public static void main(String[] args) {
		

		float raio;
		float raioQuadrado;
		double area, circunferencia, areaPI, circunferenciaPI;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o numero do Raio: ");
		raio = scan.nextFloat();
		raioQuadrado = raio*raio;
		area = 3.14*raioQuadrado;
		circunferencia = 2*3.14*raio;
		
		
		
		areaPI = Math.PI * raioQuadrado;
		circunferenciaPI = 2*Math.PI*raio;
		System.out.println("-----------------------------------------------------");
		System.out.println("########## Calculo com area sob Variável ##########");
		System.out.println("Area do Circulo: " + area);
		System.out.println("\nCircunferencia do Circulo: " + circunferencia);
		System.out.println("\n-----------------------------------------------------");
		System.out.println("########## Calculo com area sob Constante MathPI ##########");
		System.out.println("Area do Circulo: " + areaPI);
		System.out.println("\nCircunferencia do Circulo: " + circunferenciaPI);
		System.out.println("\n-----------------------------------------------------");
		System.out.println("Diferença entre áreas entre os 2 metodos é de :" + (areaPI - area));
		System.out.println("Diferença entre Circunferências entre os 2 metodos é de :" + (circunferenciaPI - circunferencia));
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String accStr;  
//
//		System.out.println("Enter your Account number: ");
//		try {
//			accStr = br.readLine();
//			
//			
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
	}

}
