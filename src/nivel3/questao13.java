import java.util.*;

public class questao13{
	public static void main (String[] args){
		int numLoop = 10;
		Scanner sc = new Scanner(System.in);
		int[] tmp = new int[10];
			for(int i = 0; i < numLoop; i++){
				System.out.println("Informe um numero:");
				tmp[i] = sc.nextInt();		
			}
			Arrays.sort(tmp);
			System.out.println("Maior Valor: " + tmp[tmp.length -1]);
			System.out.println("Segundo Maior: " + tmp[tmp.length -2]);
	}
}