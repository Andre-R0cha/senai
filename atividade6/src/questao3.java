import java.util.Scanner;

public class questao3 {


    public static void main(String[] args) throws Exception {
        String nome = "Andre";
        int senha = 12346;

        Scanner senhaDigitada = new Scanner(System.in);
        System.out.println("Digite sua Senha: ");
        int setSenha= Integer.parseInt(senhaDigitada.next());
        if(setSenha==senha){
            System.out.println("Seja Bem Vindo "+nome);
        }else{
            System.out.println("Senha incorreta!"+"\n"+" Você ainda tem 2 tentativas.");
        }
        Scanner senhaDigitada2 = new Scanner(System.in);
        System.out.println("Digite sua Senha: ");
        int setSenha2= Integer.parseInt(senhaDigitada2.next());
        if(setSenha2==senha){
            System.out.println("Seja Bem Vindo "+nome);
        }else{
            System.out.println("Senha incorreta!"+"\n"+" Você ainda tem 1 tentativas.");
        }
        Scanner senhaDigitada3 = new Scanner(System.in);
        System.out.println("Digite sua Senha: ");
        int setSenha3= Integer.parseInt(senhaDigitada3.next());
        if(setSenha3==senha){
            System.out.println("Seja Bem Vindo "+nome);
        }else{
            System.out.println("Senha incorreta!"+"\n"+" Sua conta esta bloqueada."+"\n"+" Favor dirijase a agencia");
        }
    }
    
}
