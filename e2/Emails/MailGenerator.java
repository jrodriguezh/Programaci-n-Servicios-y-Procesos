package e2.Emails;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


public class MailGenerator extends Thread {	

	Buffer buffer;
	String threadName;
	
	//invocamos al constructor de una superclase
	public MailGenerator(String threadName, Buffer buffer) {
		super();
		this.threadName = threadName;
		this.buffer = buffer;
		
	}


	public synchronized Email GeneraEmail() {
		Email email = new Email();
		email.setId(generaId());
		email.setDestino(generaDestino());
		email.setRemite(generaRemite());
		email.setAsunto(generaAsunto());
		email.setCuerpo(generaCuerpo());
		return email;
	}
	
	
	public int generaId() {
		int numero = ThreadLocalRandom.current().nextInt(0, 10000);
		return numero;
	}
		
	public String generaDestino() {
		List<String> listaNombres = new ArrayList<String>();
		listaNombres.add("javierromero@company.corp");
		listaNombres.add("sandramartin@company.corp");
		listaNombres.add("arturodelarosa@company.corp");
		listaNombres.add("yagoruiz@company.corp");
		listaNombres.add("enrestosevilla@company.corp");
		listaNombres.add("pikachu@gmail.com");
		
		int numero = ThreadLocalRandom.current().nextInt(0, 6);
		
		return listaNombres.get(numero);
	}
	
	public String generaRemite() {
		List<String> listaNombres = new ArrayList<String>();
		listaNombres.add("compras@company.corp");
		listaNombres.add("marketing@company.corp");
		listaNombres.add("rrhh@company.corp");
		listaNombres.add("buzoncio@company.corp");
		listaNombres.add("ventas@company.corp");
		
		int numero = ThreadLocalRandom.current().nextInt(0, 5);
		
		return listaNombres.get(numero);
	}
	
	public String generaAsunto() {
		List<String> listaNombres = new ArrayList<String>();
		listaNombres.add("Rdo. Proyecto Java");
		listaNombres.add("Rdo. Felicitacion Navidad");
		listaNombres.add("Sdo. Vacaciones");
		listaNombres.add("Rdo. Solicitud Beca");
		listaNombres.add("Sdo. Ascenso");
		
		int numero = ThreadLocalRandom.current().nextInt(0, 5);
		
		return listaNombres.get(numero);
	}
	
	public String generaCuerpo() {
		List<String> listaNombres = new ArrayList<String>();
		listaNombres.add("Cuerpecito");
		listaNombres.add("Cuerpaso");
		listaNombres.add("Cuerpo");
		listaNombres.add("CuerpoEscombro");
		listaNombres.add("CuerpoEspin");
		
		int numero = ThreadLocalRandom.current().nextInt(0, 5);
		
		return listaNombres.get(numero);
		
	}

	//Creamos un bucle aleatorio para que genere emails, los pase por el buffer y lo saque por pantalla
	public void run() {
		while(true) {
		for(int i = 1;i <= 10;i++){
			Email email = GeneraEmail();
						
			buffer.addMensaje(email);
			System.out.println(threadName + " ha generado el email: " + email.toString());
			
			try {
    			Thread.sleep(1500);
    		} catch (InterruptedException e) {
    			e.printStackTrace();
    		}
		}
		}
		
	}
	
	
}
	





