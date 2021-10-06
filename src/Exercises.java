
public class Exercises {
	
	
	public static void main(String[] args) {
		Exercises test = new Exercises ();
		/*
		int[] myArray = {7,7,2,4,5,6,7,7,8,8};
		System.out.println(test.ex1(myArray));
		*/
		System.out.println(test.ex2(false, false));
	}
	
	/* 	Exercise 1
	 * Dado un array de elementos numericos (rango del 1 al 9)
	 * Imprimir el numero con mas ocurrencias, imprimiendo la cantidad de ocurrencias y la primer ocurrencia del mismo.
	 */
	public String ex1 (int [] myArray) {
		//int [] myArray = {1,2,2,4,5,6,7,8,8,8};
		// Creo una matriz para almacenar las ocurrencias y el indice de la primer ocurrencia
				int [][] ocurrencias = new int [2][9];
				
				// For que recorrera por columna, seran 9 columnas ya que el rango es de 1-9
				for (int i=0; i<ocurrencias[0].length; i++) {
					
					int contador = 0;
					int numero = i+1; // Numero del rango 1-9
					boolean firstTime = false;
					
					// For que recorre el array completo, sumando las ocurrencias
					for (int j= 0; j< myArray.length; j++) {
						if (numero == myArray [j]) {
							if (!firstTime) {
								firstTime = true;
								ocurrencias [0][j] = j; // Almaceno la primer ocurrencia
							}
							contador++;			
						}
					}
					ocurrencias [1][i] = contador; // Almaceno el contador			
				}
				
				int mayor=0; // Puede ser 0 el mayor, debido al rango
				int posMayor=-1;
				
				// Busco en la matriz, la mayor ocurrencia y almaceno tanto su indice como su cantidad
				for (int f = 0; f < ocurrencias[0].length; f++) {
					
					if (ocurrencias [1][f] > mayor) {
						mayor = ocurrencias [1][f];
						posMayor = ocurrencias [0][f];
					}		
				}
				
				return "Longest: " + mayor + ", Number: " + myArray [posMayor]; 
				
				
				
	}

	/*	Exercise 2
	 * 	The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. 
	 * 	We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
	 */	
	public boolean ex2 (boolean weekday, boolean vacation) {
		if (!weekday || vacation){
			return true;
		} else
			return false;
	}
	
	/*	Exercise 3
	 * 	Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
	 * 	Dado un int n, devuelve la diferencia absoluta entre n y 21, excepto que devuelve el doble de la diferencia absoluta si n es mayor de 21.
	 */
	public int ex3 (int n) {
		if (n>21) {
			return (n-21)*2;
		} else {
			return 21-n;
		}
	}

}
