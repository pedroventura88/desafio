import java.util.Scanner;
public class questao19 {
	public static void main (String[] args){
		int a = 0;
		int b = 0;
		int resto = 0;
		int divisor = 0;
		int dividendo = 0;
		int mdc = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor para A: ");
		a = sc.nextInt();

		System.out.println("Informe o valor para B: ");
		b = sc.nextInt();
		
			if (a > b){
				dividendo = a;
				divisor = b;
			} else {
				dividendo = b;
				divisor = a;
			}
		
		do{
			resto = dividendo % divisor;

				if(resto != 0){
					dividendo = divisor;
					divisor = resto;
				}

		} while (resto != 0);

			mdc = divisor;
			if (mdc == 1){
				System.out.println("A e B sao primos entre si");
			} else {
				System.out.println("A e B NAO sao primos entre si");
			}
	
	}
}