import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) throws Exception {
        Scanner valor = new Scanner(System.in);
        System.out.println("digite um numero: ");           
        int primeiroValor = Integer.parseInt(valor.nextLine());
        Scanner valor2 = new Scanner(System.in);
        System.out.println("digite um numero: ");       
        int segundoValor = Integer.parseInt(valor2.nextLine());
        System.out.println("a. a soma dos dois valores =  "+(primeiroValor+segundoValor));
        System.out.println("b. o produto entre eles = "+(primeiroValor*segundoValor));

    }
}
