package javabasics;

import javax.swing.JOptionPane;

public class Ejercicio5 {

	public static void main(String[] args) {
		// EJERCICIO 5:
		// Haz una aplicaci�n que calcule el �rea de un c�rculo(pi*R2). El radio se
		// pedir� por teclado (recuerda pasar de String a double con
		// Double.parseDouble). Usa la constante PI y el m�todo pow de Math.

		JOptionPane.showMessageDialog(null, "Bienvenido - Ejercicio 5");
		//final double PI = 3.1416;
		double area;

		// Se solicita el valor del radio
		String valor = JOptionPane.showInputDialog("Introduce el valor del radio");
		double radio = Double.parseDouble(valor);
		
		area=Math.PI*Math.pow(radio, 2);

		JOptionPane.showMessageDialog(null, "El �rea del c�rculo con radio "+radio+" es = "+area);
	}

}
