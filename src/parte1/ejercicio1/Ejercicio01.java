package parte1.ejercicio1;

import parte1.LeerTeclado;

public class Ejercicio01 {

	public static void main(String[] args) {
		// aceptar numeros hastaque la suma sea supeior a 1000
		int numero,acumulador=0;		
	System.out.println("Escribe números por teclado  hasta que la suma sea superior a 1000");
		do {
			numero=LeerTeclado.readInteger();
			acumulador=acumulador+numero;
		} while (acumulador<=1000);
System.out.println("La suma fué "+acumulador);
	}
}
