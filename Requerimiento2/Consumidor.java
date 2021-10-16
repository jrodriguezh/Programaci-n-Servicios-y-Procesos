package Requerimiento2;

public class Consumidor extends Thread {
	
	public String nombre;
	public Cola cola;
	
	public Consumidor(String nombre, Cola cola) {
		super();
		this.nombre = nombre;
		this.cola = cola;
	}
	
	public void run(){
		while(true) {
			Email mensaje = cola.getMensaje();
			System.out.println(nombre + " ha consumido el mensaje"+ mensaje);
		}
	}
	
	
}
