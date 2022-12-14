import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;


public class questao3 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String [] name = new String[7];
        double [] time = new double[7];
        
HashMap<String, Double> tabela = new HashMap<String, Double>();

        for (int i = 0; i < name.length; i++) {
            System.out.println("Digite o nome: ");
            name[i] = teclado.next();
            System.out.println("Digite o tempo: ");
            time[i] = teclado.nextDouble();
        }
        System.out.println(name);
        System.out.println(time);
    }//jklehasukhwertsghytnlkiresn;lokgt
    
}
