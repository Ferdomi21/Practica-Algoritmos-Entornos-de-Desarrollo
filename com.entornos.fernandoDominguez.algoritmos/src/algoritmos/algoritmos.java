package com.entornos.fernandoDominguez.algoritmos;

public class algoritmos {

	/**
	 * Metodo para recibir un numero entero y devolver el numero de fibonacci de
	 * dicho numero.
	 * 
	 * @author Fernando
	 * 
	 * @version 1.0
	 * 
	 */

	static int fibonacci(int n) {
		int a = 0, b = 1, c;
		if (n == 0)
			return a;
		for (int i = 2; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return b;
	}

	/**
	 * Recibe un número entero y devuelve el factorial de dicho número.
	 * 
	 * @param el numero entero que quiera el usuario
	 * @return el factorial de dicho numero
	 */

	static int factorial(int n) {
		if (n == 0)
			return 1;

		return n * factorial(n - 1);
	}
}
