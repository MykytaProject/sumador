package sumador;

import java.util.Scanner;

public class MRFunciona {

	public static void main(String[] args) {
		
		ASumar uwu = new ASumar();
		Scanner sc = new Scanner(System.in);
		
		String numero;
		System.out.print("Introduzca el numero por favor: ");
		numero = sc.nextLine();
		
		if(uwu.negativo(numero) != null) {
			System.out.print(uwu.negativo(numero));
		}else if (uwu.sumativo(numero) != null){
			System.out.print(uwu.sumativo(numero));
		}else {
			System.out.print(uwu.total(numero));
		}
		
		sc.close();
	}

}
