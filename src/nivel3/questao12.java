import java.util.*;
public class questao12 {
	public static void main (String[] args){
		int contador = 10;
		int num = 0;
		int nMaior = 0;
		int nMenor = 0;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i <= contador; i++){
			System.out.println("Informe um numero: ");
			num = sc.nextInt();
			if (i == 0){
				nMaior = num;
				nMenor = num;
			}
			 if (num > nMaior){
				nMaior = num;
			}
			 if (num < nMenor){
				nMenor = num;
			}		
		}
	System.out.println("O numero menor e "+nMenor);
	System.out.println("O numero MAIOR e "+nMaior);
	}
}