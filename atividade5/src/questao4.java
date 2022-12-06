import java.util.Scanner;

public class questao4 {
    // 4. Em sua programação semanal, uma rede de televisão apresenta os seguintes
    // telejornais:

    // • Bom Dia Nação, apresentado por Zé PINHEIRO e por Ana Carla ARAÚJO

    // • Jornal Brasileiro, apresentado por Bill BONNER E CARLA VASCONCELOS

    // Crie um programa no qual o usuário informe o sobrenome de um dos
    // apresentadores. Se
    // o sobrenome informado não estiver na lista acima, o programa deve mostrar a
    // mensagem
    // “Apresentador(a) desconhecido(a).”. Em caso positivo, o programa deve mostrar
    // o nome
    // do telejornal apresentado pelo apresentador(a).

    public static void main(String[] args)  {
        String jornalista1="PINHEIRO";
        String jornalista2= "ARAÚJO";
        String jornalista3="BONNER";
        String jornalista4="VASCONCELOS";

        Scanner valor = new Scanner(System.in);
        System.out.println("Digite um sobrenome do seu jornalista: ");
        String nomeDigitado= valor.nextLine();

        switch (nomeDigitado) {
            case "PINHEIRO":
              System.out.println("Bom Dia Nação, apresentado por Zé PINHEIRO e por Ana Carla ARAÚJO");
              break;
            case "ARAÚJO":
              System.out.println("Bom Dia Nação, apresentado por Zé PINHEIRO e por Ana Carla ARAÚJO");
              break;
              case "BONNER":
              System.out.println("Jornal Brasileiro, apresentado por Bill BONNER E CARLA VASCONCELOS");
              break;
              case "VASCONCELOS":
              System.out.println("Jornal Brasileiro, apresentado por Bill BONNER E CARLA VASCONCELOS");
              break;
            default:
              System.out.println("Apresentador(a) desconhecido(a)");
          } 


    }

}
