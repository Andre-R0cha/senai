import java.util.Scanner;

//2. Escreva um programa que lê um array de inteiros e faça a troca dos números ímpares
//de cada posição por zero. Ao final, o programa deve exibir os valores do array. Você pode
//definir os valores do array ou pedir para que o usuário digite.



public class questao2 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int[] lista = new int[10];
		String resposta ="";
		String[] listaResposta = new String[10];
		 for (int i = 0; i < lista.length; i++) {
	            System.out.println("Digite o numero: ");
	            lista[i] = teclado.nextInt();
	        }
		 
		 for (int i = 0; i < lista.length; i++) {
//	            resposta = resposta +lista[i]+ " ";
	            
	            if(lista[i]%2==0) {
	            	resposta += lista[i]+" ";
	            	
	            }else {
	            			resposta += "0"+ " ";
	            }
	            
		 
		 }
		 System.out.print(resposta);
		 
		
		
	}
}
