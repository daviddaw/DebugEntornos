package parte2.ejercicio1;



public class Main {

	public static void main(String[] args) {
		int n;

		do {
			System.out.println("Introduce un numero positivo o 0 para calcular su factorial ");
			n = parte1.LeerTeclado.readInteger();
		} while (n < 0);
		
		
       System.out.println("factorial calculado mediante metodo iterativo");
       System.out.println("El factorial de " + n + " es "     + factorial(n));
       System.out.println("factorial calculado mediante metodo recursivo");
       System.out.println("El factorial de " + n +  " es "    +factorialRecursivo(n));

	}
	//Metodo iterativo
	public static double factorial (int x){

		double fact=1;
		for (int i=1;i<=x;i++)
			fact*=i;
		return fact;
	}
	
	//Metodo Recursivo
	public static double factorialRecursivo(int n) {
	

		if (n==0) {
			return 1;
		}
		else{
			return n*(factorialRecursivo(n-1));

		}



	}


}

