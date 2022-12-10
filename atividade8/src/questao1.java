import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        int valorDigitado = teclado.nextInt();
        int r = 0;
        String binario = "";
        System.out.println("valorDigitado:" + valorDigitado);
        b = Integer.toBinaryString(valorDigitado);
        System.out.println("binario:" + binario);
        System.out.println("conferindo:" + Integer.parseInt(binario, 2));
        System.out.println("......");

    }
}
