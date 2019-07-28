import java.util.*;

public class questao11{
	public static void main (String[] args){
		int numLoop = 0;
		int numInterno = 0;
		int valorMaior = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a qtd de repeticoes do FOR: ");
		numLoop = sc.nextInt();
		int[] tmp = new int[numLoop];
			for(int i = 0; i < numLoop; i++){
				System.out.println("Informe um numero:");
				tmp[i] = sc.nextInt();
					if (valorMaior <= tmp[i]){
						valorMaior = tmp[i];
					}		
			}
			System.out.println("Valor maior: " + valorMaior);
	}
}