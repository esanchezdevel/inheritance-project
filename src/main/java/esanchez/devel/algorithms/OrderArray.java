package esanchez.devel.algorithms;

import java.util.Arrays;
import java.util.Collections;

public class OrderArray {

	public static void main(String[] args) {
		
		String[] origin = {"This", "is", "a", "test"};
		
        //imprimimos por pantalla el arreglo de strings
        System.out.println("Arreglo sin orden:");
        for (String str : origin) {
            System.out.println(str);
        }
 
        System.out.println();
 
        //ordenamos en forma natural el arreglo de strings y lo imprimimos por pantalla
        System.out.println("Orden natural:");
        Arrays.sort(origin);
        for (String str : origin) {
            System.out.println(str);
        }
 
        System.out.println();
 
        //ordenamos en forma inversa el arreglo de strings y lo imprimimos por pantalla
        System.out.println("Orden inverso:");
        Arrays.sort(origin, Collections.reverseOrder());
        for (String str : origin)  {
            System.out.println(str);
        }
	}
}
