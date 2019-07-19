import java.util.Scanner;

public class questao30{
	public static void main (String[] args){
	int ano;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Informe o ano: ");
	ano = sc.nextInt();
	
		if(ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0){
			System.out.println("O ano e Bissexto");
		} else {
			System.out.println("O ano NAO E Bissexto");
		}
	}
}