package nivel1;

import java.util.Scanner;

public class questao07 {

	public static void main(String[] args) {
		
		double angulo, seno, cosseno, tangente, AngRadiano;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o angulo: ");
		angulo = scan.nextDouble();
		
		AngRadiano = (Math.PI/180) * angulo;
		
		seno = Math.sin(AngRadiano);
		System.out.println("\nO valor do seno é: " + seno );
		
		cosseno = Math.cos(AngRadiano);
		System.out.println("\nO valor do cosseno é: " + cosseno );
		
		tangente = Math.tan(AngRadiano);
		System.out.println("\nO valor da Tangente é: " + AngRadiano );
	
		
	}

}
