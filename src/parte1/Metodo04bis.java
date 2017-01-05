package parte1;

public class Metodo04bis {

	public static void main(String[] args) {
		int n1;
		boolean primo;
		
		System.out.println("Esribe un numero para calcular si es primo (bis)");
		System.out.println("________________________________________________");
		System.out.println("Inserte un número:");
		System.out.println(">");
		n1=Metodo01.pideNumeros();
		primo=Metodo04bis.name(n1);
		if(primo){
			System.out.println("El número "+n1+" es primo");
		}
		else {
			System.out.println("El número "+n1+" no es primo");
		}

	}
public static boolean name(int n) {
	boolean primo;
	primo=true;
    for (int i = 2; i <=n/2; i++) {
    	if (n%i==0) {
			primo=false;
		}	
	}
    return primo;

}
	

	
}


	
	


