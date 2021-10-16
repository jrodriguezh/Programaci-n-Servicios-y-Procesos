package NumeroPrimo;

import java.util.Date;
	
public class Primo implements Runnable{		//Implementamos la clase runable 
	private long Numero, contador, i;
	private float Tiempo;
	private String Posicion, PrimoSN;  
		
	public Primo(int Numero, String Posicion){	//creamos las clases y las llamamos por parametro
		this.Numero = Numero;
		this.Posicion = Posicion;	}
	
		public synchronized void esPrimo () {	//Lo sincronizamos para que los hilos trabajen a la vez y sea más eficiente
	
		Date IniTiempo = new Date();
		Date FinTiempo;
        contador = 0;
                 
        for(i = 1; i <= Numero; i++) {	 //Creamos el bucle para revisar si es primo o no
           
            if((Numero % i) == 0) {
                contador++;}
            }        
       
        if(contador%2==0)  {//Comprueba si es primo o no
           	PrimoSN="Si";
        }else{
        	PrimoSN="No"; }
                
        FinTiempo = new Date();
        Tiempo = (float) (FinTiempo.getTime() - IniTiempo.getTime()) / 1000;
        
        System.out.println(	//Le decimos lo que tiene que poner por consola
        		"El " + Posicion + " numero (" + Numero + ") " + 
                PrimoSN + " es primo, se ha procesado en el hilo: " + Thread.currentThread().getName() + 
                " y ha tardado "+ Tiempo + " segundos");	}
	
	@Override
	public void run() {//forzamos al compilador a comprobar si sobreescribe correctamente el metodo
		esPrimo();
	}
	
}
