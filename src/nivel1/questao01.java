package nivel1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class questao01 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();

		int hora = cal.get(Calendar.HOUR_OF_DAY);
		int minutos = hora * 60;
		int segundos = minutos * 60;
		
		
		
		System.out.println("Hora: "+ hora);
		System.out.println("Quantidade de minutos: " + minutos);
		System.out.println("Quantidade de segundos: " + segundos);

	}

}
