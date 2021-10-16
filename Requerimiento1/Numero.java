package Requerimiento1;

public class Numero extends Thread {

	private long numero;
	private boolean primo=true;

	public Numero(long numero) {
		super();
		this.numero = numero;

	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public boolean isPrimo() {
		return primo;
	}

	public void setPrimo(boolean primo) {
		this.primo = primo;
	}

	@Override
	public String toString() {
		return "Numero [numero=" + numero + ", primo=" + primo + "]";
	}

	@Override
	public void run() {
		long inicio = System.currentTimeMillis();
		if (this.numero == 0 || this.numero == 1 || this.numero == 4) {
			this.primo = false;
		}
		for (int x = 2; x < this.numero / 2; x++) {
			if (this.numero % x == 0)
				this.primo = false;
		}
		long fin = System.currentTimeMillis();
		double tiempo = (fin - inicio);
		
		if(primo) {
			System.out.println("El número: " + numero + " ha sido procesado en el hilo: " + Thread.currentThread().getName()
					+ " durante " + tiempo + " milisegundos y es primo");	
		} else {
			
			System.out.println("El número: " + numero + " ha sido procesado en el hilo: " + Thread.currentThread().getName()
					+ " durante " + tiempo + " milisegundos y no es primo");
		}

	}

}
