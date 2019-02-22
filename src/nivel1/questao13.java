package nivel1;

import java.util.Scanner;

public class questao13 {

	public static void main(String[] args) {
		
		double valChopp, valPizzaGrande, valCobertura, totalConta,totalPorCliente, gorjeta, totalComGorjeta;
		int clientes, qtdChopp, qtdPizzaGrande, qtdCobertura;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de clientes na mesa: ");
		clientes = scan.nextInt();
		
		System.out.println("Quantos chopps pediram? ");
		qtdChopp = scan.nextInt();
		
		System.out.println("Quantas coberturas pediram? ");
		qtdCobertura = scan.nextInt();
		
		System.out.println("Quantas pizzas pediram? ");
		qtdPizzaGrande = scan.nextInt();
		
		valChopp = qtdChopp * 8.80;
		valPizzaGrande = qtdPizzaGrande * 40.00;
		valCobertura = qtdCobertura * 1.50;
		
		totalConta = valChopp + valPizzaGrande + valCobertura;
		
		gorjeta = (totalConta*10)/100;
		
		totalComGorjeta = totalConta + gorjeta;
		
		totalPorCliente = totalComGorjeta / clientes;
		
		System.out.println("\n#####################################################");
		System.out.println("\nO valor total da conta S/ GORJETA é de R$ "+ (totalConta));
		System.out.println("\nO valor pago de Gorjeta ao garçom foi de R$ "+ gorjeta);
		System.out.println("\nO valor total da conta COM GORJETA é de R$ "+ (totalComGorjeta));
		System.out.println("\nComo são " + clientes + " na mesa, cada um irá pagar R$ " +totalPorCliente);
		
		
		
	}

}
