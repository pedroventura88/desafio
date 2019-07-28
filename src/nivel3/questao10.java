import java.util.*;

public class questao10{
	public static void main (String[] args){
		int soma = 0;
		int result = 0;
		int loop = 100;
		for(int i = 1; i<= loop; i++){
			soma+= i;
			System.out.println("Numero: "+ i);
		}
		result = soma / loop;
	System.out.println("A soma dos numeros sera: "+ soma);
	System.out.println("A media dos numeros e: "+ result);
	}
}