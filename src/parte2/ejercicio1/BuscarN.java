package parte2.ejercicio1;

import parte2.LeerTeclado;

public class BuscarN {
	
	public static void main(String[] args) {
		int n, num;
		boolean encontrado=false;
		System.out.println ("Introduce el n� a buscar");
		n=LeerTeclado.readInteger();
		System.out.println ("Introduce un n� de la serie. 0 para terminar");
		num=LeerTeclado.readInteger();
		while (num!=0)
		{	if (num==n)
				encontrado=true;
			else 
			System.out.println ("Introduce un n� de la serie. 0 para terminar");
			num=LeerTeclado.readInteger();
		}
		if (encontrado)
			System.out.println("El n� "+n+ " estaba en la serie");
		else 
			System.out.println("El n� "+n+ " no estaba en la serie");

	}
}