import java.util.Scanner;

public class questao2outra {
  
    public static void main(String[] args) throws Exception {

        try (Scanner teclado = new Scanner(System.in)) {
            String[] paragrafo= new String[10];
            String teste = new String(paragrafo[10]);
            String etset = "";
            
            for (int i = 0; i < paragrafo.length; i++) {
                System.out.println("digite uma frase: ");
                paragrafo[i] = teclado.next();
                System.out.println(paragrafo);
                
                
            }
            
            for (int j = teste.length([10])-1; j >= 0; j--) {
                etset += teste.charAt(j);
                
            }   
            System.out.println(etset);
        } 
        
    }}