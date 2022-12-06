import java.util.Scanner;

// 1. Construa um programa que receba um número inteiro positivo informado pelo usuário.
// Caso ele seja par, o programa deve calcular o seu quadrado. Mas, se ele for ímpar, deve
// ser calculado o seu cubo. Ao fim, o programa deve imprimir o valor calculado.

public class questao1 {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite um valor:  ");
        int numeroDigitado = Integer.parseInt(valor.nextLine());

        if(numeroDigitado>0){
            if(numeroDigitado % 2==0){
                System.out.println(numeroDigitado*numeroDigitado);
            }else{
                System.out.println(numeroDigitado*numeroDigitado*numeroDigitado);
            }
        }else{
            System.out.println("numero nao valido favor digite um numero positivo");
        }


      
    }
}
