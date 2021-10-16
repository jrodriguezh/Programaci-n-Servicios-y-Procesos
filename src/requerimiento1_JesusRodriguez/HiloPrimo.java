package requerimiento1_JesusRodriguez;

public class HiloPrimo extends Thread {

	/**
	 * Esta clase se utilizará para ejecutar hilos que procesarán si un número dado
	 * es primo o no, así como el tiempo de ejecución del procesamiento. Para ello,
	 * la extendemos de Thread.
	 * 
	 */

	private long numero;
	private boolean primo = true;

	// Creamos los getter and Setter

	public HiloPrimo(long numero) {
		this.numero = numero;
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setPrimo(boolean primo) {
		this.primo = primo;
	}

	// Sobrescribimos el método toString

	public String toString() {
		return "HiloPrimo [numero=" + numero + ", primo=" + primo + "]";
	}

	/*
	 * El método de inicialización del Hilo realizará la comprobación de si el
	 * número pasado es Primo o no, para ello, comprobará si es divisible por algún
	 * número menor aparte de por si mismo. Además, imprimirá por pantalla el tiempo
	 * de ejecución así como el Hilo que ha procesado el número.
	 */

	public void run() {

		long inicio = System.currentTimeMillis();
		int contador = 2;
		boolean primo = true;
		while ((primo) && (contador != numero)) {
			if (numero % contador == 0)
				primo = false;
			contador++;
		}

		long fin = System.currentTimeMillis();
		double tiempo = (double) (fin - inicio);

		if (primo) {
			System.out.println("El numero procesado por el Hilo: " + Thread.currentThread().getName() + " ha sido el: "
					+ numero + ". El cual SI es Primo. Este proceso ha tardado " + tiempo
					+ " milisegundos en procesarse");
		} else {
			System.out.println("El numero procesado por el Hilo: " + Thread.currentThread().getName() + " ha sido el: "
					+ numero + ". El cual NO es Primo. Este proceso ha tardado " + tiempo
					+ " milisegundos en procesarse");
		}

	}

}
