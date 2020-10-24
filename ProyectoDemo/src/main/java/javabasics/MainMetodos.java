package javabasics;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class MainMetodos extends Metodos2{

	public static void main(String[] args) {
		Metodos nombreObjeto = new Metodos();
		Metodos nombreObjeto2 = new Metodos(9, 3);
//		Metodos2 objeto = new Metodos2(); //Herencia

		System.out.println(nombreObjeto2.sumatoria());
		System.out.println(nombreObjeto.sumatoria());
		
		System.out.println(heredar);

		nombreObjeto.mostrarMensaje();

		String elementoGuardado = nombreObjeto.mostrarNombre("Elia");

		System.out.println(elementoGuardado);

		Metodos.prueba();
		
		//Se requiere que los métodos de la clase heredada sean static
		//List<String> listaNombres = objeto.listaDeNombres(); <-- Al heredar ya no es necesario el objeto
		List<String> listaNombres = listaDeNombres();  
		List<Integer> listaNumeros = listaDeNumeros();
		
		System.out.println("For con dos puntos para mostrar los elementos de la lista");
		for(String nombre : listaNombres) {
			System.out.println(nombre);
		}
		
		System.out.println("For con index para mostrar los elementos de la lista");
		for(int indice=0; indice<listaNombres.size(); indice ++) {
			System.out.println(listaNombres.get(indice));
		}
		
		//Muestra en consola los numeros de la lista de Números
		for (int numero : listaNumeros) {
			System.out.println(numero);
		}
		
		//Elimina elementos duplicados de la lista de nombres y los guarda en  la variable nombresSinElementosDuplicados
		List<String> nombresSinElementosDuplicados = listaNombres
				.stream()
				.distinct()
				.collect(Collectors.toList());
		
		//ordena alfabéticamente la lista de nombresSinElementosDuplicados (A-Z)
		Collections.sort(nombresSinElementosDuplicados);
		System.out.println(nombresSinElementosDuplicados);
		
		//ordena alfabéticamente la lista de nombresSinElementosDuplicados en orden inverso (Z-A)
		Collections.sort(nombresSinElementosDuplicados, Collections.reverseOrder());
		System.out.println(nombresSinElementosDuplicados);
		
		//Obtiene el número mayor de la lista
		System.out.println(Collections.max(listaNumeros));
		//Obtiene el número menor de la lista
		System.out.println(Collections.min(listaNumeros));
		
		//Primero se ordena la lista de números y luego se imprime en consola
		Collections.sort(listaNumeros);
		System.out.println("orig"+listaNumeros);
		
		//Primero se ordena (a la inversa) la lista de números y luego se imprime en consola
		Collections.sort(listaNumeros, Collections.reverseOrder());
		System.out.println(listaNumeros);
		
	
		//Eliminar elementos repetidos de una lista de enteros
		Object last = null;
		int numCount = 0;
		Iterator<Integer> i = listaNumeros.iterator();
		
		System.out.println("Eliminar elementos repetidos");
		while(i.hasNext()) {
			Object temp = i.next();
			if (temp.equals(last)) {
				i.remove();
				numCount++; //numCount = numCount +1;
			}else {
				last=temp;
			}
			
		}
		System.out.println(numCount);
		System.out.println(listaNumeros);
		
		
		List <String> nombres1 = listaDeNombres();
		List <String> nombres2 = listaDeNombres2();
		
		Collections.sort(nombres1);
		Collections.sort(nombres2);
		
		boolean isIgual = nombres1.equals(nombres2);
		System.out.println(isIgual);
		
		if(isIgual==true) {
			System.out.println("Las listas son iguales: \n");
			System.out.println("Lista1: "+ nombres1+ " " + 
					" Lista2: " + nombres2+" ");
			}else {
				System.out.println("Las listas no son iguales: \n");
				System.out.println("Lista1: "+ nombres1+ " " + 
						" Lista2: " + nombres2+" ");
			}
	}//main
		
}
	

