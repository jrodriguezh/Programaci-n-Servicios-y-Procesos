package requerimiento2_JesusRodriguez;

public class ConsumidorEmail extends Thread{

	public String nombre;
	public Buffer cola;
	
	/*
	 * 
	 */
	public ConsumidorEmail(String nombre, Buffer cola){
		super();
		this.nombre = nombre;
		this.cola = cola;
	}
	
	public void run(){
		while(true){
			Email mensaje = cola.getMensaje();
			System.out.println(nombre + " ha consumido el mensaje: " + mensaje);
		}
	}

}
