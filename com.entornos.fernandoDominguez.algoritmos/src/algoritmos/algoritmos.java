package algoritmos;

public class algoritmos {

	/**
	 * Metodo para recibir un numero entero y devolver el numero de Fibonacci de
	 * dicho numero.
	 * 
	 * @param n el numero que quiera el usuario
	 * @return devuelve el numero de Fibonacci de ese numero
	 * @author Fernando
	 * 
	 * @version 1.0
	 * 
	 */

	public static int fibonacci(int n) {
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
	 * Recibe un numero entero y devuelve el factorial de dicho numero.
	 * 
	 * @param n el numero entero que quiera el usuario
	 * @return el factorial de dicho numero
	 */

	public static long factorial(int n) {
		if (n == 0)
			return (long) 1;

		return n * factorial(n - 1);
	}

	/**
	 * Metodo que recibe un numero entero y devuelve true o false en funcion de si
	 * es primo o no.
	 * 
	 * @param num el numero entero que quiera el usuario
	 * @return si es primo o no
	 * 
	 */

	public static boolean primo(int num)

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
