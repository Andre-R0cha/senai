package atividade9;

import java.util.Scanner;

public class questao4 {
//	4. Faça um programa que use o método valorPagamento para determinar o valor a ser pago por
//	uma prestação de uma conta. O programa deverá solicitar ao usuário o valor da prestação e o
//	número de dias em atraso e passar estes valores para o método valorPagamento, que calculará
//	o valor a ser pago e devolverá este valor ao programa que a chamou. O programa deverá então
//	exibir o valor a ser pago na tela. Após a execução o programa deverá voltar a pedir outro valor
//	de prestação e assim continuar até que seja informado um valor igual a zero para a prestação.
//	Neste momento o programa deverá ser encerrado, exibindo o relatório do dia, que conterá a
//	quantidade e o valor total de prestações pagas no dia. O cálculo do valor a ser pago é feito da
//	seguinte forma. Para pagamentos sem atraso, cobrar o valor da prestação. Quando houver
//	atraso, cobrar 3% de multa, mais 0,1% de juros por dia de atraso.
	
	static double valorPagamento(double valor, int dias) {
				
	if(dias==0) {
		return valor;
				
	}
	double pagamento = valor+(valor*0.03)+(dias*0.001);
	return pagamento;
	}
	
	
	// 0,3*valorPagamento
	
	//0,001*dias dias de atraso
	
	
	
	

	
	
	public static void main(String[] args) throws Exception {
		
		while(true) {
			
			Scanner teclado = new Scanner(System.in);
			System.out.print("valor total da prestacao: ");
			double valor = teclado.nextDouble();
			
			System.out.print("valor total da prestacao: ");
			int dias = teclado.nextInt();
			
			if(valor==0) {
				System.out.print("relatorio:"+"\n");
				break;
			}else {
				valorPagamento(valor,dias);
				
			
			
		}
		
		
	
		}
	}
}
