package com.entornos.fernandoDominguez.arrays;

public class MisArrays {

	/**
	 * Método que realiza la media aritmetica en una array de numeros
	 * 
	 * @param 
	 * @return devuelve la media de una serie de numeros
	 * @author Fernando
	 * 
	 * @version 1.0
	 * 
	 * 
	 */
	int a1[];
	int a2[];
	int a3[];

	public double media(int a1[]) {

		int suma = 0;
		a1 = new int[8];

		for (int x = 0; x < a1.length; x++) {
			suma += a1[x];
		}
		double media = suma / a1.length;
		return media;
	}

}
