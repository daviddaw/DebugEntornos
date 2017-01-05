package parte1;


public class Metodo05 {

	public static void main(String[] args) {
		System.out.println("Usando el método del apartado 4, obtener todos los primos del 2 a N introducido por teclado.");
		System.out.print("");
		System.out.println("____________________________________________________________________________________________");
		int n1;
		boolean primo;
		System.out.println("Inserte un número:");
		System.out.print(">");
		n1=Metodo01.pideNumeros();
		System.out.println("Estos son los primos hasta "+n1);
        for (int i = 2; i <=n1; i++) {
        	primo=Metodo04bis.name(i);
        	
			if (primo) {	
				System.out.println(i);
			}
		}
		System.out.println();
		System.out.println("Sesión finalizada");
	}


}
