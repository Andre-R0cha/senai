import java.util.Scanner;
import java.util.Arrays;

public class questao2 {

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner medicamento = new Scanner(System.in);
        line[] nomeRemedio = new line[5];
        int[] valor = new int[5];

        System.out.println("Digite o nome do remedio: ");
        nomeRemedio[0] = medicamento.nextLine();
        System.out.println("Digite um valor: ");
        valor[0] = medicamento.nextInt();
        System.out.println("Digite o nome do remedio: ");
        nomeRemedio[1] = medicamento.nextLong();
        System.out.println("Digite um valor: ");
        valor[1] = medicamento.nextInt();
        System.out.println("Digite o nome do remedio: ");
        nomeRemedio[2] = medicamento.nextLong();
        System.out.println("Digite um valor: ");
        valor[2] = medicamento.nextInt();
        System.out.println("Digite o nome do remedio: ");
        nomeRemedio[3] = medicamento.nextLong();
        System.out.println("Digite um valor: ");
        valor[3] = medicamento.nextInt();
        System.out.println("Digite o nome do remedio: ");
        nomeRemedio[4] = medicamento.nextLong();
        System.out.println("Digite um valor: ");
        valor[4] = medicamento.nextInt();
        System.out.println("Digite o nome do remedio: ");
        nomeRemedio[5] = medicamento.nextLong();
        System.out.println("Digite um valor: ");
        valor[5] = medicamento.nextInt();
       

    }
}
