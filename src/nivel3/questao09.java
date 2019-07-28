import java.util.*;

public class questao09{
	public static void main (String[] args){
		int quadrado = 0;
		for(int i = 1; i<= 100; i++){
			quadrado += (i * i);
			System.out.println("Numero: "+ i);
		}
	System.out.println("A soma dos quadrados sera: "+ quadrado);
	}
}