package Requerimiento1;
import java.util.*;

public class TestNumerosPrimos {

	
	
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
				
		
				
		System.out.println("Introduce el primer n�mero:");
		Numero num1 = new Numero(sc.nextLong());
		
		System.out.println("Introduce el segundo n�mero:");
		Numero num2 = new Numero(sc.nextLong());
		
		System.out.println("Introduce el tercer n�mero:");
		Numero num3 = new Numero(sc.nextLong());
		
		System.out.println("Introduce el tercer n�mero:");
		Numero num4 = new Numero(sc.nextLong());
		
		
		sc.close();
		
		num1.start();
		num2.start();
		num3.start();
		num4.start();

	}

}
