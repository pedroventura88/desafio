import java.util.Scanner;

public class questao15{
	public static void main (String[] args){
		int num = 0;
		int priVal = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um numero: ");
		num = sc.nextInt();
		int contador = num;
		for(int i = priVal; i <= num; i++){
			contador = priVal++;
			if(contador % 3 == 0){
				System.out.println("Multiplo de 3: "+contador);
			}
			if(contador % 5 == 0){
				System.out.println("Multiplo de 5: "+contador);
			}
		}
	}
}