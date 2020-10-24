package javabasics;

public class Ejercicio1 {

	public static void main(String[] args) {
		// EJERCICIO 1:
		// Declara dos variables numéricas (con el valor que desees), muestra por
		// consola la suma, resta, multiplicación, división

		System.out.println("Ejercicio 1");
		int num1 = 6; 
		int num2 = 2;

		// Suma
		System.out.println(" Suma: " + num1 + "+" + num2 + "=" + (num1 + num2));

		// Resta
		System.out.println(" Resta: " + num1 + "-" + num2 + "=" + (num1 - num2));

		// Multiplicación
		System.out.println(" Multiplicación: " + num1 + "*" + num2 + "=" + (num1 * num2));

		// División
		System.out.println(" División: " + num1 + "/" + num2 + "=" + (num1 / num2));

		// Mod
		System.out.println(" Modulo o resto de una división entera.: " + num1 + "%" + num2 + "=" + (num1 % num2));
	}

}
