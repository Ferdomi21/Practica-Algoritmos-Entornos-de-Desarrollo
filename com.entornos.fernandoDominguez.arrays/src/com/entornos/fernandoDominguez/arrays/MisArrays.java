package com.entornos.fernandoDominguez.arrays;

import java.util.Arrays;

public abstract class MisArrays {

	/**
	 * Calcular media aritmética
	 * 
	 * @param array en el cual nos pasará un numero para calcular la media
	 * @return media aritmetica
	 */
	public static double media(int array[]) {
		int suma = 0;
		for (int i = 0; i < array.length; i++) {
			suma += array[i];
		}

		double media = (double) suma / array.length;
		return media;
	}

	/**
	 * Calcular la mediana (si es par utilizamos los dos numeros centrales,impar solamente el numero central)
	 * 
	 * @param array en el cual nos pasará un numero para calcular la mediana
	 * @return mediana
	 */
	public static double mediana(int[] array) {
		Arrays.sort(array);
		double mediana;
		int mitad = array.length / 2;

		if (array.length % 2 == 0) {
			mediana = (double)(array[mitad - 1] + array[mitad]) / 2;
		} else {
			mediana = (double)array[mitad];
		}
		return mediana;
	}

}
