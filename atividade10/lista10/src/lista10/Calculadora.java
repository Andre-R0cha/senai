package lista10;

public class Calculadora {

	public Calculadora(double op1, double op2) {
		// TODO Auto-generated constructor stub
	}

	public double op1;
	public double op2;
	
	public double somar() {
		return op1+op2;
	}
public double subitrair() {
		return op1-op2;
	}
public double multiplicar() {
	return op1*op2;
}
public double dividir() {
	return op1/op2;
}
public double calcularPotencia() {
	return Math.pow(op2, op1);
}
	
	
}
