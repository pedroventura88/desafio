import java.util.Scanner;
public class questao18{
	public static void main (String[] args){
	int num = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Informe um Numero: ");
	num = sc.nextInt();
		for (int i = num; i > 0; i--){
			if (num <= 0){
				System.out.println("O numero nao pode ser zero.");
			}
			if(num % i == 0){
				System.out.println(i + " e divisor de "+num);
			}
		}
	}
}