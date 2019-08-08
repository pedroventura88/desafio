import java.util.Scanner;
public class questao22 {
	public static void main (String[] args){
		int a = 0;
		int b = 0;
		int n = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor(INTEIRO) para o calculo Fibonacci: ");
		n = sc.nextInt();

		for (a = 0, b = 1; a <= n; b += a, a = b - a){
			System.out.println ("A: "+a);			
		}
	}
}

////a = 0
//b = 1
//--
//b  -> 1 + 0 = 1.
////a -> 1 - 0 = 1.
//--
//b -> 1 + 1 = 2.
////a -> 2 - 1 = 1.
//--
//b -> 2 + 1 = 3.
////a -> 3 - 1 = 2.
//--
//b ->  3 + 2 = 5.
////a -> 5 - 2 = 3. 
//--
//b -> 5 + 3 = 8.
////a -> 8 - 3 = 5.
//--
//b -> 8 + 5 = 13.
////a -> 13 - 5 = 8.
//--
