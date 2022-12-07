public class questao {
    

    
import java.util.Iterator;
import java.util.Scanner;

//1. Escreva um programa que lê um array de inteiros e exibe um array de boolean onde,
//cada posição indique true se o elemento da posição correspondente é positivo e false caso
//seja negativo ou zero. Você pode definir os valores do array ou pedir para que o usuário
//digite.



	public static void main(String[] args) throws Exception{
		Scanner teclado = new Scanner(System.in);
		int[] lista = new int[10];
		String resposta =" ";
		
		 for (int i = 0; i < lista.length; i++) {
	            System.out.println("Digite o numero: ");
	            lista[i] = teclado.nextInt();
	        }
		 boolean[] listaResposta = new boolean[10];
		 
		 for (int i = 0; i < lista.length; i++) {
	            resposta = resposta +lista[i]+ " ";
	          
	            if(lista[i]>0) {
	            	 listaResposta[i] = true;
	            }else {
	            	listaResposta[i]= false;
	            }
	        }
	        System.out.println(resposta);
	        for (int i = 0; i < listaResposta.length; i++) {
	        	System.out.print(listaResposta[i]+ " ");
	        }
	       
	}
	

}


