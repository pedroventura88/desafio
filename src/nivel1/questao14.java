package nivel1;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class questao14 {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		 
	    double conta, pago;
	 
	    try {
	      System.out.printf("Informe o Valor da conta a ser paga: ");
	      conta = scan.nextDouble();
	 
	      System.out.printf("Informe o Valor Pago....: ");
	      pago = scan.nextDouble();
	 
	      System.out.printf("%s", calculaTroco(conta, pago));
	    }
	    catch (InputMismatchException e) {
	      System.err.printf("\nErro: dados informados inválidos !!!\n");
	    }
	  }
	  
	  public static String calculaTroco(double conta, double pago) {
	    DecimalFormat formatador = new DecimalFormat("###,##0.00");
	    if (pago < conta)
	       return("\nPagamento insuficiente, faltam R$ " + formatador.format(conta - pago) +"\n");
	   else {
	      int nota[] = {50, 20, 10, 5, 2, 1};
	      
	      String result;
	      double troco;
	      int i, vlr, ct;
	 
	      troco = pago - conta;
	      result ="\nTroco = R$"+ formatador.format(troco) +"\n\n";
	 
	// definindo as notas do troco (parte inteira)
	      vlr = (int)troco;
	      i = 0;
	      while (vlr != 0) {
	        ct = vlr / nota[i]; // calculando a qtde de notas
	        if (ct != 0) {
	           result = result + (ct +" nota(s) de R$ "+ nota[i] +"\n");
	           vlr = vlr % nota[i]; // sobra
	        }
	        i = i + 1; // próxima nota
	      }
	 
	      result = result +"\n";

	      return(result);
	    }		

	}

}
