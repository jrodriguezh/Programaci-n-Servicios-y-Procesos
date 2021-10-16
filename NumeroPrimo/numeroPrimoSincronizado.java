package NumeroPrimo;

import java.util.Scanner;

public class numeroPrimoSincronizado{
	
    public static void main(String[]args){
    	//Creamos la variable donde se guardaran los numeros pedidos 
    	
    	Scanner sc = new Scanner(System.in);
    	
    	//Se piden 4 numeros por pantalla
    	System.out.print("Ingresa el primer numero: ");
    	Primo Primo1 = new Primo(sc.nextInt(),"primer");
        
        System.out.print("Ingresa el segundo numero: ");
        Primo Primo2 = new Primo(sc.nextInt(),"segundo");
        
        System.out.print("Ingresa el tercer numero: ");
        Primo Primo3 = new Primo(sc.nextInt(),"tercer");
        
        System.out.print("Ingresa el cuarto numero: ");
        Primo Primo4 = new Primo(sc.nextInt(),"cuarto");
             
        //Se crean los hilos
        Thread t1 = new Thread(Primo1);
		Thread t2 = new Thread(Primo2);
		Thread t3 = new Thread(Primo3);
		Thread t4 = new Thread(Primo4);
		
		//Se despiertan los hilos
		t1.start();
		t2.start();
		t3.start();
		t4.start();
        
    }
}