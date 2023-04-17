package com.entornos.fernandoDominguez.arrays;

import java.util.Arrays;

public abstract class MisArrays {

	/**
	 * Calcula media aritmética
	 * 
	 * @param array en el cual nos pasara un numero para calcular la media
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
	 * Calcula la mediana (si es par utilizamos los dos numeros centrales,impar
	 * solamente el numero central)
	 * 
	 * @param array en el cual nos pasará un numero para calcular la mediana
	 * @return mediana
	 */
	public static double mediana(int[] array) {
		Arrays.sort(array);
		double mediana;
		int mitad = array.length / 2;

		if (array.length % 2 == 0) {
			mediana = (double) (array[mitad - 1] + array[mitad]) / 2;
		} else {
			mediana = (double) array[mitad];
		}
		return mediana;
	}

	/**
	 * Calcula el numero maximo de una serie de numeros
	 * @param array de numeros entero para calcular el maximo
	 * @return valor máximo
	 */
	public static int maximo(int[] array) {
		int maximo = array[0];
		for (int i = 1; i < array.length; i++) {
			if (maximo < array[i]) {
				maximo = array[i];
			}
		}
		return maximo;
	}
	/**
	 * Calcula el numero minimo de una serie de numeros
	 * @param array de numero entero para calcular el minimo
	 * @return valor minimo
	 */
	public static int minimo(int[] array) {
		int minimo = array[0];
		for (int i = 1; i < array.length; i++) {
			if (minimo > array[i]) {
				minimo = array[i];
			}
		}
		return minimo;
	}




}
