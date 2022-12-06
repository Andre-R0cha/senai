import java.util.Scanner;

public class questao1 {




    public static void main(String[] args) throws Exception {
        Scanner valor1 = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int numero1= Integer.parseInt(valor1.next());
        Scanner valor2 = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int numero2= Integer.parseInt(valor2.next());

        if(numero1<numero2){
            System.out.println("a soma dos numeros digitados e "+(numero1+numero2));

        }else{
            System.out.println("Error 404!");
        }

       
    }
}
