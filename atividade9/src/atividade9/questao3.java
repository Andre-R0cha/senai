package atividade9;

import java.util.Scanner;

public class questao3 {
	
	static void circulo() {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o valor do raio: ");
		double r = teclado.nextDouble();
		
		double Ac = Math.PI*(r*r);
		System.out.print("area do triangulo e "+Ac);
		}
	static void triangulo() {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o valor da base: ");
		double b = teclado.nextDouble();
		System.out.print("Digite o valor da altura: ");
		double h = teclado.nextDouble();
		
		double At =(b*h)/2;
		System.out.print("area do triangulo e "+At);
		}
	static void retangulo() {
	
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o valor da base: ");
		double b = teclado.nextDouble();
		System.out.print("Digite o valor da altura: ");
		double h = teclado.nextDouble();
		double Ar = b*h;
		System.out.print("area do triangulo e "+Ar);
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Calculo das areas de figuras geometricas:"+"\n"
		+"1. Triangulo"+"\n"+"2. Circulo"+"\n"+"3. Retangulo"+"\n"+"Qual figura deseja calcular a area? " );
		int numeroDigitado  = teclado.nextInt();
		
		if(numeroDigitado==1) {
			triangulo();
		
	}
		if(numeroDigitado==2) {
			circulo();
		}else if(numeroDigitado==3) {
			retangulo();
		}else {
			System.out.print("opcao invalida!"+"\n"+"por favor tente mais tarde");
		}

}}
