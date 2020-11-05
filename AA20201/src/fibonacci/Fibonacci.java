/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author Phoenix Azrael
 */
public class Fibonacci {
    public static long fibonacci(long posicion) {
	long siguiente = 1, actual = 0, temporal = 0;
	for (long x = 1; x <= posicion; x++) {
            // Si no quieres imprimirla, comenta la siguiente línea:
            System.out.print(actual + ", ");
            temporal = actual;
            actual = siguiente;
            siguiente = siguiente + temporal;
	}
	// Si no quieres imprimirla, comenta la siguiente línea:
	System.out.println(actual);
	return actual;
    }
}
