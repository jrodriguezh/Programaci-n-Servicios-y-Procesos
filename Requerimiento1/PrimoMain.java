package Requerimiento1;

import java.util.Scanner;

public class PrimoMain {

	public static void main(String[] args) {

		
		//Inicializamos Scanner para poder recoger datos por consola
		
		Scanner sc = new Scanner(System.in);

		
		//Generamos los cuatro hilos, a los cuales les pasaremos un número por consola
		
		System.out.println("Dame el primer número");
		HiloPrimo hilo1 = new HiloPrimo((sc.nextLong()));

		System.out.println("Dame el segundo número");
		HiloPrimo hilo2 = new HiloPrimo((sc.nextLong()));

		System.out.println("Dame el tercer número");
		HiloPrimo hilo3 = new HiloPrimo((sc.nextLong()));

		System.out.println("Dame el cuarto número");
		HiloPrimo hilo4 = new HiloPrimo((sc.nextLong()));

		
		//Inicializamos los hilos, que realizarán el procesamiento de los datos, imprimiendo por consola
		//que hilo ha realizado el procesamiento, si el número introducido es primo y el tiempo de ejecucción del proceso.
		
		hilo1.start();
		hilo2.start();
		hilo3.start();
		hilo4.start();

		//cerramos Scanner.
		
		sc.close();

	}

}
