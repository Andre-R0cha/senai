import java.util.Scanner;




// Ler o conjunto de slides "Aula 5 - Variáveis primitivas e controle de fluxo" até a página 19.
// Entregar como resposta a esta atividade uma captura de tela de um programa que: lê três idades e calcula a soma, a subtração e o produto entre elas.
// O programa java deve permitir que o usuário digite as três notas, capturando via teclado e armazenando em variáveis. Utilizar Scanner e o método .nextInt()
// Utilizar os operadores aritméticos para realizar as operações pedidas.
// Utilizar o System.out.println() para exibir o resultado de cada operação.



public class App {
    public static void main(String[] args) throws Exception {
        Scanner valor = new Scanner(System.in);
        System.out.println("digite um numero: ");
        int idade1 =  Integer.parseInt(valor.nextLine());
        Scanner valor2 = new Scanner(System.in);
        System.out.println("digite um numero: ");
        int idade2 =  Integer.parseInt(valor2.nextLine());        
        Scanner valor3 = new Scanner(System.in);
        System.out.println("digite um numero: ");
        int idade3 =  Integer.parseInt(valor3.nextLine());

        System.out.println( "Fazendo a soma das tres idades : " +(idade1+idade2+idade3));
        System.out.println( "Fazendo a subtracao das tres idades : " +(idade1-idade2-idade3));
        System.out.println( "Fazendo o produto das tres idades : " +(idade1+idade2+idade3));
    }
}
