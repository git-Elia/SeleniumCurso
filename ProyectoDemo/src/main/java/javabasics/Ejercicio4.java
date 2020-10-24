package javabasics;

import javax.swing.JOptionPane;

public class Ejercicio4 {

	public static void main(String[] args) {
		// EJERCICIO 4:
		// Modifica la aplicación anterior, para que nos pida el nombre que queremos
		// introducir (recuerda usar JOptionPane), mensaje de Bienvenida de acuerdo al nombre ingresado.

		// System.out.println("Bienvenido - Ejercicio 3");
		// String nombre="Elia";
		
		JOptionPane.showMessageDialog(null, "Bienvenido - Ejercicio 4");

		// Se solicita el valor de la variable nombre
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre");

		
		// Se muestra mensaje de bienvenida por consola, mensaje fijo
		System.out.println("Bienvenid@ " + nombre);
	}

}
