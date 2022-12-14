package lista10;

import java.util.Scanner;

public class Carro {

	public Carro( double consumo,double combustivel) {
		
		
		
	}
	public double consumo;
	public double combustivel;
	
	
	public void andar() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Quantos km voce quer andar:");
		double km = teclado.nextDouble();
		
		double km_L = km/combustivel;
		
		combustivel = combustivel-km_L;
	
		
	}
public double exibirCombustivel() {
	return combustivel;
	
}
public void abastecer(double litros) {
	combustivel = litros + combustivel;
}
}
