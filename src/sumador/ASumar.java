package sumador;

public class ASumar {
	
	/**
	 * @author Mykyta Ryasny
	 * @version 1.0
	 * 
	 * @param cadena que se le pasa al m�todo para comprobar
	 * si es de un digito o m�s
	 * 
	 * @return un digito o nada si es m�s de un digito
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
	 * @param cadena que se le pasa al m�todo para saber si es negativo
	 * @return devolvemos cadena de texto "Negativ. Siempre negativo" si 
	 * el primer digito es negativo y de no ser as�, no devolvemos nada.
	 */
	public String negativo(String cadena) {
		String numero = cadena;
		char pirmerDigito = numero.charAt(0);
		if (pirmerDigito == '-') {
			return "Negativo. Siempre negativo";
		}
		return null;
	}
	

}
