package algoritmos;


public class Principal {

	public static void main(String[] args) {
	
		int numeros[] = new int [5];
		long resultadoFibonacci[] = new long [numeros.length];
		long resultadoFactorial[] = new long [numeros.length];
		boolean resultadoPrimos[] = new boolean [numeros.length];
		
		for (int i=0 ; i<numeros.length ; i++) {
			int aleatorio = (int)(Math.random()*20+1);
			numeros[i] = aleatorio;
		}
		
		for (int i=0 ; i<numeros.length ; i++) {
			resultadoFibonacci[i] = algoritmos.fibonacci(numeros[i]);
		}
		
		for (int i=0 ; i<numeros.length ; i++) {
			resultadoFactorial[i] = algoritmos.factorial(numeros[i]);
			
		}
	
		for (int i=0 ; i<numeros.length ; i++) {
			resultadoPrimos[i] = algoritmos.primo(numeros[i]);
			
		
		}
		
	}

}
