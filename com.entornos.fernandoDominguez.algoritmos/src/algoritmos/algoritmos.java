package algoritmos;

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

	static long factorial(int n) {
		if (n == 0)
			return (long) 1;

		return n * factorial(n - 1);
	}

	/**
	 * Metodo que recibe un número entero y devuelve true o false en función de si
	 * es primo o no.
	 * 
	 * @param el numero entero que quiera el usuario
	 * @return si es primo o no
	 * 
	 */

	static boolean primo(int num)

	{
		int contador = 0;

		for (int i = 1; i <= num; i++)

		{

			if (num % i == 0)

				contador++;
		}

		if (contador == 2) {
			return true;
		} else {
			return false;
		}

	}
}
