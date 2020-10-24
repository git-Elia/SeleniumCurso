package javabasics;

import javax.swing.JOptionPane;

public class Ejercicio6 {

	public static void main(String[] args) {
		// EJERCICIO 6:
		// Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no
		// lo es, también debemos indicarlo.

		JOptionPane.showMessageDialog(null, "Bienvenido - Ejercicio 6");

		// Se solicita el valor de la variable numero1
		String valor = JOptionPane.showInputDialog("Introduce un Número");
		int num = Integer.parseInt(valor);

		int divisible;
		divisible = num % 2;

		if (divisible == 0) {
			JOptionPane.showMessageDialog(null, "El número "+ num + " es divisible entre 2");
		} else {
			JOptionPane.showMessageDialog(null, "El número "+ num + " no es divisible entre 2");
		}
	}

}
