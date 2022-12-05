import java.util.Scanner;

// 6. Construa um programa que solicite que o usuário informe 2 números inteiros positivos. O programa
// deve calcular:
// a) O cubo do segundo número
// b) A média geométrica entre o primeiro e o segundo número, isto é,

public class questao6 {
    public static void main(String[] args) throws Exception {
        Scanner valor = new Scanner(System.in);
        System.out.println("digite um numero: ");
        int valor1 =  Integer.parseInt(valor.nextLine());
        Scanner valors = new Scanner(System.in);
        System.out.println("digite um numero: ");
        int valor2 =  Integer.parseInt(valors.nextLine());
        System.out.println(valor1 +valor2);
    }
}
