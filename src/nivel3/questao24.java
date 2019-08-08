import java.util.Scanner;
public class questao24{
	public static void main (String[] args){
		int a = 0;
		int b = 0;
		int i = 0;
		int j = 0;
		int soma = 0;
		int n = 0;
		int cont = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o primeiro valor: ");
		a = sc.nextInt();

		System.out.println("Informe o segundo valor: ");
		b = sc.nextInt();

		System.out.println("Informe valor de NUMERO: ");
		n = sc.nextInt();

		for (i = a, j = b; i <= n; j+=i, i = j - i) {
			if (i % 2 == 0){
				i = j + i;
				System.out.println("Valor de i PAR: "+i);
			}
		System.out.println("Valor de i IMPAR: "+i);
		}
		
	}	
}