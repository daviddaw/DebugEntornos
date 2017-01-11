package parte2.ejercicio1;



public class Main {

	public static void main(String[] args) {
		int n;

		do {
			System.out.println("Introduce un numero positivo o 0 para calcular su factorial ");
			n = parte1.LeerTeclado.readInteger();
		} while (n < 0);
        //metodo iterativo
		System.out.println("El factorial de " + n + " es "     + factorial(n));
		//metodo recursivo
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
		System.out.println("n vale "+n);

		if (n==0) {
			System.out.println("vuelta");
			return 1;
		}
		else{
			System.out.println("bajando n="+n);
			System.out.println("resultado del factorial "+n*(factorialRecursivo(n-1)));

			return n*(factorialRecursivo(n-1));

		}



	}


}

