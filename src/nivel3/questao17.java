import java.util.Scanner;
public class questao17{
	public static void main (String[] args){
		int numIni = 1;
		int contNegativo = 0;
		int numPositivo = 0;
		int cont = 0;
		int num = 0;
		Scanner sc = new Scanner(System.in);
		
		for (int i = numIni; i <= 20; i++){
			System.out.println("informe um numero: ");
			num = sc.nextInt();
			if (num > 0){
				numPositivo = num;
				cont+= numPositivo;
			}
			if (num < 0) {
				contNegativo++;
			}
		}
		System.out.println("A soma dos positivos e: "+cont);
		System.out.println("O total de negativos e: "+contNegativo);
	}
}