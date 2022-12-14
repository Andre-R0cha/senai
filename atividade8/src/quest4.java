import java.util.Scanner;


public class quest4 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a nota do aluno: ");
        String texto = teclado.nextLine();

        
        String[] novoTexto = texto.split(" ");

        double media = 0;
       
        for (String i : novoTexto) {
           
            double nota = Double.parseDouble(i);

            if(nota>70){
                    media++;
                    System.out.println(media);
            }

        }
        double result = (media/5)*100;
        System.out.printf("%.3f%%", result);
        
       

    }
}
