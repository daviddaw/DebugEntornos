package parte1.ejercicio2;

import parte1.LeerTeclado;


public class Metodo01 {
	/*1.	Escribir un método que reciba como parámetro dos números y devuelva su  suma.
	 *  Análogamente, crear varios métodos para  la resta, el producto y la división. 
	 *  Escribir un main que pida dos números y una opción entre 1 y 4 
	 *  y según dicha opción invoque al método de suma, resta, producto o división.*/	

	public static void main(String[] args) {
		int n1,n2,menu;
		System.out.println("============================");
		System.out.println("       Menú principal");
		System.out.println(" ");
		System.out.println("============================");
		System.out.println("Inserte un número:");
		System.out.print(">");
		n1=pideNumeros();
		System.out.println("Inserte otro número:");
		System.out.print(">");
		n2=pideNumeros();
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("     Elija una opción:");
		System.out.println(" ");
		System.out.println("============================");
		System.out.println(" ");
		System.out.println("> Pulse 1 para sumarlos");
		System.out.println("> Pulse 2 para restarlos");
		System.out.println("> Pulse 3 para multiplicarlos");
		System.out.println("> Pulse 4 para dividirlos");
		System.out.println(" ");
		System.out.println("============================");
		menu=pideNumeros();
		switch (menu) {
		case 1:System.out.println("Su suma es "+sumaNumeros(n1, n2));

		break;
		case 2:System.out.println("Su resta es "+restaNumeros(n1, n2));

		break;
		case 3:System.out.println("Su multiplicacion es "+multiplicaNumeros(n1, n2));

		break;
		case 4:System.out.println("Su division es "+divideNumeros(n1, n2));

		break;

		default:System.out.println("No has introducido ningun numero de 1 a 4");
		break;
		}
		System.out.println(" ");
	
		System.out.println("Sesión finalizada.");
	}

	
	public static int pideNumeros() {
		int numero;
		do {
			numero=LeerTeclado.readInteger();
			if (numero<0) {
				System.out.println("El numero debe ser positivo");
			}
		} while (numero<0);
		return numero;
	}

	
	public static int sumaNumeros (int n1,int n2) {
		return n1+n2;
	}
	
	
	public static int restaNumeros (int numero1,int numero2) {
		return numero1-numero2;
	}
	
	
	public static int multiplicaNumeros (int a,int b) {
		return a*b;
	}
	
	
	public static double divideNumeros (int x,int y) {
		return  (double)x/y;
	}
}
