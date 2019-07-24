import java.util.*;

public class questao08{
	public static void main(String[] args){
		int soma = 0;
		for(int i = 1; i <= 100; i++){
			soma += i;
			System.out.println("Numero: "+i);
		}
		System.out.println("A soma dos numeros e: "+ soma);
	}
}