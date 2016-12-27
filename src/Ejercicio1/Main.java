package Ejercicio1;

public class Main {

	public static void main(String[] args) {
		double lado,lado2;

		TrianguloEquilatero t1 = new TrianguloEquilatero();
		System.out.println("Triangulo 1");
		System.out.println(t1.toString());
		
		System.out.println("Triangulo 2");
		System.out.println("Escribe un lado");
		lado=LeerTeclado.readDouble();
		TrianguloEquilatero t2 = new TrianguloEquilatero(lado);
		System.out.println(t2.toString());
		
		System.out.println("modificamos el lado del triangulo 1");
		System.out.println("Escribe el nuevo lado");
		lado=LeerTeclado.readDouble();
		t1.setLado(lado);
		System.out.println(t1.toString());
		
		
		System.out.println("modificamos el lado del triangulo 2");
		System.out.println("Escribe el nuevo lado del triangulo 2");
		lado2=LeerTeclado.readDouble();
		t2.setLado(lado2);
		System.out.println(t2.toString());
		
		
		
	}

}
