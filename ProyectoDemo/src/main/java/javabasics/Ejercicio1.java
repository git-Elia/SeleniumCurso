package javabasics;

public class Ejercicio1 {

	public static void main(String[] args) {
		// EJERCICIO 1:
		// Declara dos variables num�ricas (con el valor que desees), muestra por
		// consola la suma, resta, multiplicaci�n, divisi�n

		System.out.println("Ejercicio 1");
		int num1 = 6; 
		int num2 = 2;

		// Suma
		System.out.println(" Suma: " + num1 + "+" + num2 + "=" + (num1 + num2));

		// Resta
		System.out.println(" Resta: " + num1 + "-" + num2 + "=" + (num1 - num2));

		// Multiplicaci�n
		System.out.println(" Multiplicaci�n: " + num1 + "*" + num2 + "=" + (num1 * num2));

		// Divisi�n
		System.out.println(" Divisi�n: " + num1 + "/" + num2 + "=" + (num1 / num2));

		// Mod
		System.out.println(" Modulo o resto de una divisi�n entera.: " + num1 + "%" + num2 + "=" + (num1 % num2));
	}

}
