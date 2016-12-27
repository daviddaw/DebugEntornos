package Ejercicio1;

public class TrianguloEquilatero {
private double lado;

public TrianguloEquilatero(double lado) {
	this.lado = lado;
}

public TrianguloEquilatero() {
	lado=1;
}

public double getLado() {
	return lado;
}

public void setLado(double lado) {
	this.lado = lado;
}

public double getAltura() {
	return lado;

}
public double getArea() {
	return lado;

}
public double getPerimetro() {
	return lado;

}

@Override
public String toString() {
	return "TrianguloEquilatero [lado=" + lado + ", getAltura()=" + getAltura()
			+ ", getArea()=" + getArea() + ", getPerimetro()=" + getPerimetro()
			+ "]";
}

}