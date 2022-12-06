import java.util.Scanner;

public class questao4 {

    // 4. Crie um programa no qual o usuário informe o código do cargo de um
    // funcionário (ver
    // tabela abaixo) e o seu respectivo salário. Para encerrar a leitura dos dados,
    // defina uma
    // condição de parada (por exemplo, código do cargo igual a zero). Ao fim, o
    // programa deve
    // informar a média salarial dos nutricionistas.

    public static void main(String[] args) throws Exception {

        // codigo 1, 2 , 3
        // enfermeiro
        // nutricionistas
        // medico
        int countMedico;
        int countEnfermeiro;
        int countNutri;
        Double enfermeiro = 0;
        Double nutricionistas = 0;
        Double medico = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite ");
        int x = 0;

        do {

            int opcao = teclado.nextInt();
            switch (opcao) {
                case 1:
                    // enfermeiro
                    enfermeiro += teclado.nextDouble();
                    countEnfermeiro++;
                    break;
                case 2:
                    // nutricionista
                    nutricionistas += teclado.nextDouble();
                    countNutri++;


                    break;
                case 3:
                    // medico
                    medico += teclado.nextDouble();
                    countMedico++;
                    break;

            }
        } while (opcao != -1);

    }

}
