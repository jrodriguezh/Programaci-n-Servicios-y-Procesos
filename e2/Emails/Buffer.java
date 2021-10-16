package e2.Emails;

	import java.util.LinkedList;
	import java.util.Queue;

	public class Buffer {
		public final static int MAX_ELEMENTOS = 5;
		
		//Una lista circular es ideal para implementar este ejemplo
		//FIFO
		private Queue<Email> cola = new LinkedList<>();
		
			public synchronized void addMensaje(Email email){
			
			//Si la cola esta llena no debemos introducir ningun elemento más
			while(cola.size() == MAX_ELEMENTOS){//5
				try {
		
					wait();
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
			//Add un elemento a la cola
			cola.offer(email);
			//Notify, notificamos a todos los hilos que esten en estado wait que
			//despierten(tanto los de addMensaje como los de getMensaje)
			notify();
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
						
			if (s.getDestino() == "pikachu@gmail.com") {//Aqui le decimos que si el destino es a Pikachu, que no lo mande y lo avise por consola
				System.out.println("Destinatario baneado (PIKACHU): " + s.toString());
				s = null;
			}
			
			notify();
			return s;
		}
		
		public synchronized void notifyFinish(){
			notify();
		}

}	

