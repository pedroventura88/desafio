import java.util.Scanner;
public class questao21 {
	public static void main (String[] args){
		int n;
		int cont = 0;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("Digite um numero valido (Maior que 0):");
			n = sc.nextInt();
		} while (n <= 0);
		
		for (int i = 1; i <= n; i++){
			if (n % i == 0){
				cont++;
			}			
		}
		if (cont == 2){
			System.out.println("O numero "+n+" e Primo!!");
		} else {
			System.out.println("O numero "+n+" NAO E Primo =(");
		}
	}
}