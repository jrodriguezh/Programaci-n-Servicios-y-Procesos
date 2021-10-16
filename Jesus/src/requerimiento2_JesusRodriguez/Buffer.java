package requerimiento2_JesusRodriguez;

import java.util.LinkedList;
import java.util.Queue;

public class Buffer {

public final static int MAX_ELEMENTOS = 5;
	

	private Queue<Email> cola = new LinkedList<>();
	

	public synchronized void addMensaje(Email email){

		
		if(email.getDestinatario()!=("pikachu@gmail.com")) {
		while(cola.size() == MAX_ELEMENTOS){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		cola.offer(email);
		notify();
	} else {
		System.out.println("Mensaje hacia Pikachu detectado, el Team Rocket ha impedido su envío.");
	}
		
	}
	
	public synchronized Email getMensaje(){
		Email s = null;
		while(cola.size() == 0){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		s = cola.poll();
		notify();
		return s;
	}
	
	
	
}
