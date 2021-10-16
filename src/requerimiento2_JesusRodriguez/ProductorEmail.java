package requerimiento2_JesusRodriguez;

public class ProductorEmail extends Thread{
	public String nombre;
	public Buffer cola;
	
	public ProductorEmail(String nombre, Buffer cola){
		super();
		this.nombre = nombre;
		this.cola = cola;
	}
	

	
	public void run(){
		GeneradorEmail ge = new GeneradorEmail();
		for(int i = 1;i <= 10;i++){
			Email email = ge.generarEmail();
			try {
				Thread.sleep(500);//simulacion de tarea que tarda 500 milisegungdos
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(nombre + " ha producido el email con el ID: " + email.getId());
			cola.addMensaje(email);
		}
	}

}
