import java.util.Scanner;

public class questao3 {

    public static void main(String[] args)  {
        String login = "procopio";
        String senha = "12345";
        String login2 = "paiva";
        String senha2 = "54321";
        Scanner valor = new Scanner(System.in);
        System.out.println("digite seu login: ");
        String loginDigitado = valor.nextLine();
        Scanner valor2 = new Scanner(System.in);
        System.out.println("digite sua senha: ");
        String senhaDigitada = valor2.nextLine();

        if (loginDigitado == login && senhaDigitada == senha) {

            System.out.println("seja bem vindo!");

        } else if (loginDigitado == login2 && senhaDigitada == senha2) {

            System.out.println("seja bem vindo!");

        } else {

            System.out.println("login e senha errada!");
        }

        System.out.println(senhaDigitada + loginDigitado);

    }
}