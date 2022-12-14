import java.util.Scanner;

public class questao9 {

    public static void main(String[] args) throws Exception {

        Scanner dig = new Scanner(System.in);
        String paragrafo = "";

        String etset = "";
        
        System.out.println("digite uma frase: ");
        paragrafo = dig.next();
        String[] texto = paragrafo.split(" ");
        System.out.println();

        for (int j = 0; j < paragrafo.length(); j++) {
            etset = paragrafo.charAt(j) + etset;
        }

        System.out.println(etset);

    }
}