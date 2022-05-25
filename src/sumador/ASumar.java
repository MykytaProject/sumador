package sumador;

public class ASumar {
	
	/**
	 * @author Mykyta Ryasny
	 * @version 1.0
	 * 
	 * @param cadena que se le pasa al método para comprobar
	 * si es de un digito o más
	 * 
	 * @return un digito o nada si es más de un digito
	 */
	public String sumativo(String cadena) {
		String numero = cadena;
        if (numero.length() == 1) {
            return (numero + " = " + numero);
        }
        return null;
	}
	/**
	 * @author Mykyta Ryasny
	 * @version 1.0
	 * @param cadena que se le pasa al método para saber si es negativo
	 * @return devolvemos cadena de texto "Negativ. Siempre negativo" si 
	 * el primer digito es negativo y de no ser así, no devolvemos nada.
	 */
	public String negativo(String cadena) {
		String numero = cadena;
		char pirmerDigito = numero.charAt(0);
		if (pirmerDigito == '-') {
			return "Negativo. Siempre negativo";
		}
		return null;
	}
	
	public int total(String cadena) {
		int suma = 0;

        for (int i = 0; i < cadena.length(); i++) {
            // Cadena de un dígito.
            char digito = cadena.charAt(i);
            suma = suma + Integer.parseInt(String.valueOf(digito));
            //Conversión de caracter a entero
        }
        return suma;
	}
}
