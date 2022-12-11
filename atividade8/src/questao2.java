import java.util.Scanner;




public class questao2 {
  
    public static void main(String[] args) throws Exception {
        Scanner dig = new Scanner(System.in);
        String paragrafo = "";
        String etset = "";

        System.out.println("digite uma frase: ");
        paragrafo = dig.next();

        for (int j = 0; j < paragrafo.length(); j++) {
            etset = paragrafo.charAt(j) + etset;

        }

        System.out.println(etset);
        
        
        //outra maneira de fazer o inverso


        Scanner teclado = new Scanner(System.in);
        System.out.println("digite uma frase: ");
        String frase = teclado.next();
        StringBuilder texto = new StringBuilder(frase);
        StringBuilder texto2 = texto.reverse(); 
        System.out.println(texto2);

        
        
        
        
        
       

        
     


   
        
    
}}
