import java.util.Scanner;
public class questao16{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int contPar = 0;
		int contImpar = 0;
		int priNum = 1;
		System.out.println("Informe um numero.: (Ex.: 200)");
		int num = sc.nextInt();
		int contador = num;
		for(int i = priNum; i <= num; i++){
			contador = priNum++;
			if(contador % 2 == 0){
				contPar++;
			} else {
				contImpar++;
			}
		}
		System.out.println("Existem "+contPar+" numeros pares.");
		System.out.println("Existem "+contImpar+" numeros Impares.");
	}
}