/**
 * 
 */
package prof.examen;

import java.util.ArrayList;
import java.util.List;

/**
 * @author raul
 *
 */
public class ClaseExamen {

	/**
	 * @param args Integer que sera el numero a evaluar
	 */
	public static List<Integer> primos(int n) throws Exception{
		if(n<=1) {
			throw new EntradaInvalida("EntradaInvalida");
		}
		int num = 2;
		List<Integer> factores = new ArrayList<Integer>();
		//Realizo divisiones sucesivas hasta que el cociente sea 0
        while(n!=1)
        {
        	//Si el resto de la division es 0 lo añado a la lista
             while(n%num==0)
             {
                  factores.add(num);
                  n /= num;
             }
             //Si no hace el resto 0 el divisor sumamos uno a este
             //Con una lista de números primos sería mas eficiente
             num++;
        }
		return factores;
	}

}
