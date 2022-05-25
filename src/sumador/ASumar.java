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
}
