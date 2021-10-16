package requerimiento2_JesusRodriguez;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class GeneradorEmail {
	
	
	
	public Email generarEmail() {
		Email email = new Email();
		email.setId(generarId());
		email.setDestinatario(generarDestinatario());
		email.setRemitente(generarRemitente());
		email.setAsunto(generarAsunto());
		email.setCuerpo(generarCuerpo());
		return email;
	}
	
	public String generarId() {
		List<String> listaNombres = new ArrayList<String>();
		listaNombres.add("1");
		listaNombres.add("2");
		listaNombres.add("3");
		listaNombres.add("4");
		listaNombres.add("5");
		listaNombres.add("6");
		listaNombres.add("7");
		listaNombres.add("8");
		listaNombres.add("9");
		listaNombres.add("10");
		
		int numero = ThreadLocalRandom.current().nextInt(0, 9);
		
		return listaNombres.get(numero);
	}
	
	public String generarDestinatario() {
		List<String> listaNombres = new ArrayList<String>();
		listaNombres.add("Manolo@gmail.com");
		listaNombres.add("pikachu@gmail.com");
		listaNombres.add("Juan@gmail.com");
		listaNombres.add("Rodolfo@gmail.com");
		listaNombres.add("PequeñoTimmy@gmail.com");
		listaNombres.add("Paco@gmail.com");
		listaNombres.add("Braulia@gmail.com");
		listaNombres.add("Tom@gmail.com");
		listaNombres.add("Paula@gmail.com");
		listaNombres.add("Yosua@gmail.com");	
		
		int numero = ThreadLocalRandom.current().nextInt(0, 9);
		
		return listaNombres.get(numero);
	}
	
	public String generarRemitente() {
		List<String> listaNombres = new ArrayList<String>();
		listaNombres.add("Pepita@gmail.com");
		listaNombres.add("Manolo@gmail.com");
		listaNombres.add("Rodolfo@gmail.com");
		listaNombres.add("Timmy@gmail.com");
		listaNombres.add("Abuela@gmail.com");
		listaNombres.add("Josefa@gmail.com");
		listaNombres.add("Alejandro@gmail.com");
		listaNombres.add("Miriam@gmail.com");
		listaNombres.add("Pedro@gmail.com");
		listaNombres.add("Jesus@gmail.com");	
		
		int numero = ThreadLocalRandom.current().nextInt(0, 9);
		
		return listaNombres.get(numero);
	}
	
	public String generarAsunto() {
		List<String> listaNombres = new ArrayList<String>();
		listaNombres.add("Imp");
		listaNombres.add("Redaccion");
		listaNombres.add("Libro");
		listaNombres.add("Importante");
		listaNombres.add("Prohibido");
		listaNombres.add("Sobre lo de ayer");
		listaNombres.add("Conforme");
		listaNombres.add("Continuamos");
		listaNombres.add("Llamame");
		listaNombres.add("Trabajo");
		
		int numero = ThreadLocalRandom.current().nextInt(0, 9);
		
		return listaNombres.get(numero);
	}
	
	public String generarCuerpo() {
		List<String> listaNombres = new ArrayList<String>();
		listaNombres.add("Estoy seguro de que vas a estar bien. Hablamos.");
		listaNombres.add("Mandame los deberes de esta tarde que no me da tiempo.");
		listaNombres.add("En un lugar de la mancha cuyo nombre no puedo acordarme");
		listaNombres.add("Nunca volveré a pasar hambre");
		listaNombres.add("Se dice Winwardium Leviosa, no leviosaaa");
		listaNombres.add("Nunca vuelvas a escribirme por favor, lo nuestro es alto secreto");
		listaNombres.add("Adelante con el proyecto, cuando quieras, pasate y lo firmamos");
		listaNombres.add("Jamás pensé que lo conseguirías, estoy muy orgulloso, de verdad");
		listaNombres.add("Llamame en cuanto puedas, es algo largo para mandar un email con la información");
		listaNombres.add("¡Me han cogido! Es como un sueño hecho realidad");
		
		int numero = ThreadLocalRandom.current().nextInt(0, 9);
		
		return listaNombres.get(numero);
	}
}
