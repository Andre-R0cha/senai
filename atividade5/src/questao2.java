import java.util.Scanner;

// 2. Construa um programa que solicite ao usuário dois números positivos. Em seguida, o
// programa deve apresentar o seguinte menu:

//      1. Média ponderada, com pesos 2 e 3, respectivamente
//      2. Quadrado da soma dos 2 números
//      3. Cubo do menor número
//      Escolha uma opção:

// De acordo com a opção informada, o programa deve calcular a operação apresentada no
// menu. Se a opção escolhida for inválida, o programa deve mostrar a mensagem “Opção
// inválida” e ser encerrado.

public class questao2 {

    public static void main(String[] args) throws Exception {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite um valor positivo:  ");
        int numeroDigitado = Integer.parseInt(valor.nextLine());
        if (numeroDigitado < 1) {

            System.out.println("Digite um valor positivo:  ");
        }

        Scanner valor2 = new Scanner(System.in);
        System.out.println("Digite um valor:  ");
        int numeroDigitado2 = Integer.parseInt(valor2.nextLine());
        if (numeroDigitado2 < 1) {

            System.out.println("Digite um valor positivo:  ");
        }
        Scanner opcao = new Scanner(System.in);
        System.out.println("Digite uma opcao:" + "\n" + "1. Média ponderada, com pesos 2 e 3, respectivamente" + "\n"
                + "2. Quadrado da soma dos 2 números" + "\n" + "3. Cubo do menor número");
        int escolha = Integer.parseInt(opcao.nextLine());
        if(escolha>=4){
            System.out.println("opcao invalida");
        }
        if (escolha == 1) {
            int media = (numeroDigitado * 2 + numeroDigitado2 * 3) / (2 + 3);
            System.out.println("Media ponderada = " + media);
        }
        if (escolha == 2) {
            int quadrado = (numeroDigitado + numeroDigitado2) * (numeroDigitado + numeroDigitado2);
            System.out.println("Quadrado = " + quadrado);
        }
        if (escolha == 3) {
            if (numeroDigitado < numeroDigitado2) {
                int cubo = numeroDigitado * numeroDigitado * numeroDigitado;
                System.out.println("Cubo do menor = " + cubo);
            } else {
                int cubo2 = numeroDigitado2 * numeroDigitado2 * numeroDigitado2;
                System.out.println("Cubo do menor = " + cubo2);
            }
       

        }
        

    }
}
