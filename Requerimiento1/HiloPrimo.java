package Requerimiento1;


public class HiloPrimo extends Thread{

/**
 * Esta clase se utilizará para ejecutar hilos que procesarán si 
 * un número dado es primo o no, así como el tiempo de ejecución del procesamiento.
 * @author Jesus RH
 * 
 */
	
	private long numero;
    private boolean primo = true;
    
    
 /*
  * @param 
  */
    
	public HiloPrimo(long numero) {
		this.numero = numero;
	}

// Creamos los getter and Setter
	
	public long getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}



	public boolean isPrimo() {
		return primo;
	}


	public void setPrimo(boolean primo) {
		this.primo = primo;
	}
	
	
	//Sobrescribimos el método toString
	
	public String toString() {
		return "HiloPrimo [numero=" + numero + ", primo=" + primo + "]";
	}

	
	/*
	 * @param A este metodo
	 */
	
	public void run() { //Voy u
		
		long inicio = System.currentTimeMillis();
		int contador = 2;
		boolean primo=true;
		while ((primo) && (contador!=numero)){
		  if (numero % contador == 0)
		    primo = false;
		  contador++;
		}
		
		long fin = System.currentTimeMillis();
        double tiempo = (double) (fin - inicio);
        
		if (primo) {
			System.out.println("El numero procesado por el Hilo: " + Thread.currentThread().getName() + " ha sido el: " + numero + 
					". El cual SI es Primo. Este proceso ha tardado " + tiempo + " milisegundos en procesarse");
		} else {
			System.out.println("El numero procesado por el Hilo: " + Thread.currentThread().getName() + " ha sido el: " + numero + 
					". El cual NO es Primo. Este proceso ha tardado " + tiempo + " milisegundos en procesarse");
		}
		
	}




	
}
