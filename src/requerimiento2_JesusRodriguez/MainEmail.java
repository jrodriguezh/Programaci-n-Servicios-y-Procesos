package requerimiento2_JesusRodriguez;

public class MainEmail {

	public static void main(String[] args) {
		
		Buffer cola = new Buffer();
		
		ProductorEmail p1 = new ProductorEmail("Productor 1",cola);
		ProductorEmail p2 = new ProductorEmail("Productor 2",cola);
		ProductorEmail p3 = new ProductorEmail("Productor 3",cola);
		
		ConsumidorEmail c1 = new ConsumidorEmail("Consumidor 1",cola);
		ConsumidorEmail c2 = new ConsumidorEmail("Consumidor 2",cola);
		
		p1.start();
		p2.start();
		p3.start();
		
		c1.start();
		c2.start();
	}

	}


