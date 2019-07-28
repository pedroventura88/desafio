import java.util.*;
public class questao14{
	public static void main (String[] args){
		int nInferior = 0;
		int nSuperior = 0;
		int soma = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o numero Inferior: ");
		nInferior = sc.nextInt();
		System.out.println("Informe o numero Superior: ");
		nSuperior = sc.nextInt();
		int valIntervalo = nSuperior;
		if (nInferior > nSuperior){
			System.out.println("O numero Inferior deve ser MENOR que o superior.");
		} else {
			for (int i = nInferior; i <= nSuperior; i++){
				valIntervalo = nInferior++;
				
				if (valIntervalo % 2 == 0){
					soma += valIntervalo;
				}
				System.out.println("Intervalo de numeros: "+valIntervalo);
			}
		System.out.println("A soma dos valores pares e: "+ soma);
		}
	}
}