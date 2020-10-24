package javabasics;

public class Carro {

	static double numero;

	public static void main(String[] args) {
		numero = 4.8;
		int numero2 = 3;
		
		System.out.println(numero+numero2*numero);
		
		String cadenaDeCaracteres;
		cadenaDeCaracteres="Curso de Selenium";
		
		System.out.println(cadenaDeCaracteres+ " con Java");

	//	double numeroConPuntoDecimal;
		boolean verdaderoOfalso;
		
		verdaderoOfalso= cadenaDeCaracteres.equals("Curso de Selenium");
		
		System.out.println(verdaderoOfalso);
		if (verdaderoOfalso==true) {
			System.out.println("El nombre es igual");

		} else {
			System.out.println("El nombre NO es igual");
		}

	}

	/*
	 * public void test() { numero=1;
	 * 
	 * }
	 */
}
