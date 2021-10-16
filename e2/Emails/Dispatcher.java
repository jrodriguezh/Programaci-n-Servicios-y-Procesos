package e2.Emails;

public class Dispatcher extends Thread {

	String threadName;
	Buffer buffer;
	
	public Dispatcher (String threadName, Buffer buffer){
		super();
		this.threadName = threadName;
		this.buffer = buffer;
	
	}
	
	public void run(){
			Email email = buffer.getMensaje();
			for(int i = 1;i <= 10;i++){
				System.out.println(threadName + " ha enviado el mensaje: " + email.toString());
						
			try {
    			Thread.sleep(500);
    		} catch (InterruptedException e) {
    			e.printStackTrace();
    		}
			
		}
}

}