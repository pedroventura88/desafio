package nivel1;

import java.util.Scanner;

public class questao11 {

	public static void main(String[] args) {
		
		String funcionario;
		int nHoraTrab, numeroFilhos, numeroFilhoSoma;
		double valorHora, salario, salarioAcrescimo, total, totalSalcomFilho;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nDigite o nome do Funcionário: ");
		funcionario = scan.nextLine();
		
		
		System.out.println("\nDigite o numero de horas trabalhadas no mês: ");
		nHoraTrab = scan.nextInt();
		
		System.out.println("\nDigite o numero filhos que o funcionário tem: ");
		numeroFilhos = scan.nextInt();
		
		System.out.println("\nDigite o valor que este funcionário recebe por Hora: ");
		valorHora = scan.nextDouble();
		
		salario = (valorHora * nHoraTrab);
		System.out.println("\nSalario sem acrescimo: " + salario);
		
		salarioAcrescimo = (salario * 3)/100;
		
		totalSalcomFilho = salarioAcrescimo * numeroFilhos;
		
		total = salario + totalSalcomFilho;
		
		System.out.println("\nO valor do salário com o acrescimo dos filho fica em: " + total);
		
		

	}

}
