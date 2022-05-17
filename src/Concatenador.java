public class Concatenador {
	
	public static String concatenador(String[] lista) {
		String concatenado = "";
		for (int i = 0; i < lista.length; i++) {
			if (i == lista.length-1) {
				concatenado += lista[i];
			} else {
				concatenado += lista[i] + " ";
			}
		}
		return concatenado;
	}

	public static void main(String[] args) {
		String[] lista = {"CARLOS","EDUARDO","DA","COSTA","XAVIER"};
		System.out.println(concatenador(lista));
		
	}
}
