import java.util.Scanner;

public class questao29{
	public static void main (String[] args){
		double x, y, eixoX, eixoY;
		x = 0;
		y = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor de X:");
		x = Double.parseDouble(sc.nextLine());
		
		System.out.println("Informe o valor de Y:");
		y = Double.parseDouble(sc.nextLine());
		
		if (x == 0 && y == 0){
			System.out.println("X e Y sao valores 0. Impossivel determinar um quadrante");
			
		} else if (y == 0){
			System.out.println("Y esta sob o eixo Y. Nao e possivel definir um Quadrante");
			System.out.println("X: "+x);
		} else if (x == 0) {
			System.out.println("X esta sob o eixo X. Nao e possivel definir um Quadrante");
			System.out.println("Y: "+y);
		}
		
		if(x > 0 && y > 0){
			System.out.println("Os valores estao no PRIMEIRO quadrante");
		} else if (x < 0 && y > 0){
			System.out.println("Os valores estao no SEGUNDO quadrante");
		} else if (x < 0 && y < 0){
			System.out.println("Os valores estao no TERCEIRO quadrante");
		} else if (x > 0 && y < 0){
			System.out.println("Os valores estao no QUARTO quadrante");
		} 
		
	}
}