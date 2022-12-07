import java.util.Scanner;


public class questao3{



    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] name = new String[7];
        double [] time = new double[7];
        

        for (int i = 0; i < name.length; i++) {
            System.out.println("Digite o nome: ");
            name[i] = teclado.nextline();
            System.out.println("Digite o tempo: ");
            time[i] = teclado.nextDouble();
        }
        System.out.println(name);
        System.out.println(time);
    }
}
