import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatadorDeDatas {
	BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

	public static String formatadorDeData(String data) {
		try {
			SimpleDateFormat formatterDDMMYYYY = new SimpleDateFormat("dd/MM/yyyy");
			Date dataFormat = formatterDDMMYYYY.parse(data);
			SimpleDateFormat formatterMMYYYY = new SimpleDateFormat("yyyy MM");
			String mesAno = formatterMMYYYY.format(dataFormat);
			return mesAno;
		} catch(ParseException pe) {} finally {}

		try {
			String[] dataSeparada = data.split(" ");
			String dataCorrigida;
			if (dataSeparada[0].length() > dataSeparada[2].length()) {
				dataCorrigida = (dataSeparada[2] + " " + dataSeparada[1] + " " + dataSeparada[0]);
			} else {
				dataCorrigida = (dataSeparada[0] + " " + dataSeparada[1] + " " + dataSeparada[2]);
			}
			SimpleDateFormat formatterddMMyyyy = new SimpleDateFormat("dd MM yyyy");
			Date dataFormat = formatterddMMyyyy.parse(dataCorrigida);
			SimpleDateFormat formatterMMYYYY = new SimpleDateFormat("yyyy MM");
			String mesAno = formatterMMYYYY.format(dataFormat);
			return mesAno;
		} catch(ParseException pe) {} finally {}
		

		try {
			SimpleDateFormat formatterddMMyyyy = new SimpleDateFormat("ddMMyyyy");
			Date dataFormat = formatterddMMyyyy.parse(data);
			SimpleDateFormat formatterMMYYYY = new SimpleDateFormat("yyyy MM");
			String mesAno = formatterMMYYYY.format(dataFormat);
			return mesAno;
		} catch(ParseException pe) {} finally {}
		
		return "Formato de data inválido";
	}

	public static void main(String[] args) throws ParseException, IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(formatadorDeData(scan.readLine()));
	}
}