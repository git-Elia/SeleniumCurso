package javabasics;

import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {
		// EJERCICIO 2:
		// Declara 2 variables numéricas (con el valor que desees), he indica cual es
		// mayor de los dos. Si son iguales indicarlo también. Ves cambiando los valores
		// para comprobar que funciona

		JOptionPane.showMessageDialog(null, "Bienvenido - Ejercicio 2");

		// Se solicita el valor de la variable numero1
		String numero1 = JOptionPane.showInputDialog("Introduce el Número 1");
		int num1 = Integer.parseInt(numero1);

		// Se solicita el valor de la variable numero2
		String numero2 = JOptionPane.showInputDialog("Introduce el Número 2");
		int num2 = Integer.parseInt(numero2);

		if (num1 > num2) {
			JOptionPane.showMessageDialog(null, num1 + " es mayor que " + num2);
		} else {
			if (num1 < num2) {
				JOptionPane.showMessageDialog(null, num1 + " es menor que " + num2);
			} else {
				JOptionPane.showMessageDialog(null, num1 + " es igual que " + num2);
			}
		}

	}

}
