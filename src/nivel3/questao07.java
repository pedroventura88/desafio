import java.util.*;
public class questao07{
	public static void main(String[]args){
		int[] num = new int[10];
		int[] numQuadrado = new int[num.length];
		Scanner sc = new Scanner(System.in);

		for (int i = 0;i < num.length; i++) {
			System.out.println("Informe o numero: ");
			num[i] = sc.nextInt();
		}

		for (int i = 0; i < num.length ; i++){
			int quadradoNumIndividual = 0;
			for(int j = 0; j < num[i] ; j++){
				quadradoNumIndividual += num[i];
			}
			numQuadrado[i] = quadradoNumIndividual;
			System.out.println("O quadrado do numero "+num[i]+" e "+ numQuadrado[i]);
		}
	}
}