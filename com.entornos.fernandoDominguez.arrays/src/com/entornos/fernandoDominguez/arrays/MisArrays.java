package com.entornos.fernandoDominguez.arrays;

public abstract class MisArrays {

	
	
	/**
	 * Calcular media aritmética
	 * @param array
	 * @return double media
	 */
	public static double media(int array[]) {
		int suma = 0;
		for (int i = 0; i < array.length; i++) {
			suma += array[i];
		}

		double media = (double) suma / array.length;
		return media;
	}

	
	
	
	
}
