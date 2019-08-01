import java.util.Scanner;
public class questao20{
	public static void main (String[] args){
		int n = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o Numero para Fatorial: ");
		n = sc.nextInt();
		int tmp = n;
		int f = n;
		
		while (n > 1){
			f = f*(n-1);
			n--;
		}
		System.out.println("Fatorial de "+tmp+ " = "+f);
	}
}