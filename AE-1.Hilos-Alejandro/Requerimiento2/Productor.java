package Requerimiento2;

public class Productor extends Thread{

	public String nombre;
	public Cola cola;
	public Productor(String nombre, Cola cola) {
		super();
		this.nombre = nombre;
		this.cola = cola;
	}
	@Override
	public void run() {
		GeneradorEmail generador = new GeneradorEmail();
		for(int i=1; i<=10;i++) {
			Email email =generador.generarEmail();
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e){
				e.printStackTrace();
			}
			
			System.out.println(nombre + " ha producido el email con el ID: "+email.getId());
			cola.addMensaje(email);
		}
		
		
	}
	
	
	
	
}
