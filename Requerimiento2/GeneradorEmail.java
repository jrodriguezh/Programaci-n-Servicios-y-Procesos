package Requerimiento2;

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
		listaNombres.add("Lucas@gmail.com");
		listaNombres.add("pikachu@gmail.com");
		listaNombres.add("Juan@gmail.com");
		listaNombres.add("Diego@gmail.com");
		listaNombres.add("Jorge@gmail.com");
		listaNombres.add("Paco@gmail.com");
		listaNombres.add("Mario@gmail.com");
		listaNombres.add("Teresa@gmail.com");
		listaNombres.add("Paula@gmail.com");
		listaNombres.add("Laura@gmail.com");

		int numero = ThreadLocalRandom.current().nextInt(0, 9);

		return listaNombres.get(numero);
	}

	public String generarRemitente() {
		List<String> listaNombres = new ArrayList<String>();
		listaNombres.add("Arturo@gmail.com");
		listaNombres.add("Manolo@gmail.com");
		listaNombres.add("Raquel@gmail.com");
		listaNombres.add("Marcos@gmail.com");
		listaNombres.add("Pedro@gmail.com");
		listaNombres.add("JoseManuel@gmail.com");
		listaNombres.add("Alejandro@gmail.com");
		listaNombres.add("Miriam@gmail.com");
		listaNombres.add("Lucia@gmail.com");
		listaNombres.add("Jesus@gmail.com");

		int numero = ThreadLocalRandom.current().nextInt(0, 9);

		return listaNombres.get(numero);
	}

	public String generarAsunto() {
		List<String> listaNombres = new ArrayList<String>();
		listaNombres.add("URGENTE");
		listaNombres.add("PEDIDO");
		listaNombres.add("ENTREGA");
		listaNombres.add("CIRCULAR");
		listaNombres.add("BIENVENIDO");
		listaNombres.add("PROMOCION");
		listaNombres.add("CAMPAÑA FIN DE TEMPORADA");
		listaNombres.add("CONTACTO");
		listaNombres.add("SOLICITUD DE OFERTA");
		listaNombres.add("REUNION");

		int numero = ThreadLocalRandom.current().nextInt(0, 10);

		return listaNombres.get(numero);
	}

	public String generarCuerpo() {
		List<String> listaNombres = new ArrayList<String>();
		listaNombres.add("Necesitamos este envio URGENTE.");
		listaNombres.add("Por favor, dadnos precio de este material");
		listaNombres.add("Bienvenido a la empresa!");
		listaNombres.add("Esto es una circular sobre el COVID");
		listaNombres.add("Oferta fin de temporada");
		listaNombres.add("Promoción: Vuelta al cole");
		listaNombres.add("Te paso mis datos de contacto");
		listaNombres.add("Tenemos una reunión mañana a las 10:00");
		listaNombres.add("Necesitamos el pedido de este material por la mañana");
		listaNombres.add("Su pedido será entregado el día 20");

		int numero = ThreadLocalRandom.current().nextInt(0, 10);

		return listaNombres.get(numero);
	}
}
