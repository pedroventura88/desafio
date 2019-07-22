import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class questao31 {

	public static void main(String[] args) {
		String data;
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		df.setLenient(false);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a data: ");
		data = sc.nextLine();
		
		try {
			Date dataParse = df.parse(data);
			System.out.println("DATA VALIDA!!");
		} catch (ParseException e) {
			System.out.println("DATA INVALIDAAA!!");
		}

	}

}
