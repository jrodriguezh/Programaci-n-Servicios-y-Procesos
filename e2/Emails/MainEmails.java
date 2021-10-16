package e2.Emails;

import java.util.ArrayList;
import java.util.List;

import e2.Emails.MailGenerator;

public class MainEmails {

public static void main(String[] args) {
	//Creamos los hilos
	Buffer buffer = new Buffer();
		
	MailGenerator p1 = new MailGenerator("MG1",buffer);
	MailGenerator p2 = new MailGenerator("MG2",buffer);
	MailGenerator p3 = new MailGenerator("MG3",buffer);
	
	Dispatcher c1 = new Dispatcher("D1",buffer);
	Dispatcher c2 = new Dispatcher("D2",buffer);
	
	
	//Despertamos hilos
	p1.start();
	p2.start();
	p3.start();
	
	
	//Despertamos productores 
	c1.start();
	c2.start();
	
	}
}


