package javabasics;
import javax.swing.JOptionPane;

public class Ejercicio1v2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Bienvenido - Ejercicio 1 versión 2");
		JOptionPane.showMessageDialog(null, "Bienvenido - Ejercicio 1, versión 2" );
	      
	      //Se solicita el valor de la variable numero1 y se convierte el string a valor entero
	      String numero1 =JOptionPane.showInputDialog("Introduce Número 1");
	      int dato_numUno = Integer.parseInt(numero1);
	      
	      //Se solicita el valor de la variable numero2 y se convierte el string a valor entero
	      String numero2 =JOptionPane.showInputDialog("Introduce Número 2");
	      int dato_numDos = Integer.parseInt(numero2);
	      
	      
	      //Se puede hacer la conversión y la suma en la misma línea
	      JOptionPane.showMessageDialog(null, "Resultado Suma = " + (Integer.parseInt(numero1)+Integer.parseInt(numero2)));
	   
	      /*  Forma en que se mostraron los resultados durante la clase 
	      JOptionPane.showMessageDialog(null, "Resultado Suma = " + (dato_numUno + dato_numDos));
	      JOptionPane.showMessageDialog(null, "Resultado Resta = " + (dato_numUno - dato_numDos));
	      JOptionPane.showMessageDialog(null, "Resultado Multiplicación = " + (dato_numUno * dato_numDos));
	      JOptionPane.showMessageDialog(null, "Resultado División = " + (dato_numUno / dato_numDos));
	      JOptionPane.showMessageDialog(null, "Resultado Módulo = " + (dato_numUno % dato_numDos));
	     */ 
	      JOptionPane.showMessageDialog(null, "Num1 = "+dato_numUno+"\nNum2 = "+dato_numDos+"\nResultado Suma = " + (dato_numUno + dato_numDos));
	      JOptionPane.showMessageDialog(null, "Num1 = "+dato_numUno+"\nNum2 = "+dato_numDos+"\nResultado Resta = " + (dato_numUno - dato_numDos));
	      JOptionPane.showMessageDialog(null, "Num1 = "+dato_numUno+"\nNum2 = "+dato_numDos+"\nResultado Multiplicación = " + (dato_numUno * dato_numDos));
	      JOptionPane.showMessageDialog(null, "Num1 = "+dato_numUno+"\nNum2 = "+dato_numDos+"\nResultado División = " + (dato_numUno / dato_numDos));
	      JOptionPane.showMessageDialog(null, "Num1 = "+dato_numUno+"\nNum2 = "+dato_numDos+"\nResultado Módulo = " + (dato_numUno % dato_numDos));
	      


	  }

	}

