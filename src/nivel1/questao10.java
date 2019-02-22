package nivel1;

import java.util.Scanner;

public class questao10 {

	public static void main(String[] args) {
		
		String nomePiloto;
		double distanciaPercorridaKm, tempoHoras, velMedia;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nDigite o nome do Piloto: ");
		nomePiloto = scan.nextLine();
		
		System.out.println("\nDigite a distância percorrida: ");
		distanciaPercorridaKm = scan.nextDouble();
		
		System.out.println("\nDigite o tempo em horas: ");
		tempoHoras = scan.nextDouble();
		
		velMedia = distanciaPercorridaKm / tempoHoras;
		
		System.out.println("\nA velocidade média do(a) " + nomePiloto + " foi " + velMedia + " km/h");
		
		
		
		
	}

}
