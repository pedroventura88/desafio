import java.util.Scanner;
public class questao23{
	public static void main (String[] args){
		int a = 0;
		int b = 0;
		int i = 0;
		int j = 0;
		int soma = 0;
		int num = 0;
		int cont = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor: ");
		a = sc.nextInt();

		System.out.println("Informe o segundo valor: ");
		b = sc.nextInt();
		
		System.out.println("Informe o valor de N: ");
		num = sc.nextInt();

		for (i = a, j = b; i <= num; j+=i, i = j - i) {
			cont++;
			if (cont <= 4){
				System.out.println("O "+cont+" numero: "+i);
			}				
			soma+=i;
		}
		
		System.out.println("SOMA: "+soma);
	}
}