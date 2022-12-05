import java.util.Scanner;
import java.util.function.DoubleUnaryOperator;
public class questao4 {
    
    public static void main(String[] args) throws Exception {
        int salario = 1500;

        Scanner funcionario = new Scanner(System.in);
        System.out.println("Nome do funcionario: "); 
        String name = funcionario.nextLine();
        Scanner valor = new Scanner(System.in);
        System.out.println("digite quantidade de vendas: ");           
        int vendas = Integer.parseInt(valor.nextLine());
        int valorVendas= vendas*200;
        Scanner totalDeVendas = new Scanner(System.in);
        System.out.println("digite valor total das vendas: ");           
        int vendasTotal = Integer.parseInt(totalDeVendas.nextLine());
        Double porcentagenVendas = (double) (vendasTotal*5/100);
        System.out.println( name  +" "+(valorVendas+salario+ porcentagenVendas));

    }
}
