import java.util.Scanner;

public class questao4 {
    
 /*4. Faça um programa que use o método valorPagamento para determinar o valor a ser pago por
    uma prestação de uma conta. O programa deverá solicitar ao usuário o valor da prestação e o
    número de dias em atraso e passar estes valores para o método valorPagamento, que calculará
    o valor a ser pago e devolverá este valor ao programa que a chamou. O programa deverá então
    exibir o valor a ser pago na tela. Após a execução o programa deverá voltar a pedir outro valor
    de prestação e assim continuar até que seja informado um valor igual a zero para a prestação.
    Neste momento o programa deverá ser encerrado, exibindo o relatório do dia, que conterá a
    quantidade e o valor total de prestações pagas no dia. O cálculo do valor a ser pago é feito da
    seguinte forma. Para pagamentos sem atraso, cobrar o valor da prestação. Quando houver
    atraso, cobrar 3% de multa, mais 0,1% de juros por dia de atraso.*/


    


    static double valorPagamento(double prestacao, int dias) {
				
        if(dias==0) {
            return prestacao;
                    
        }
        double pagamento = prestacao+(prestacao*0.03)+(prestacao*(dias*0.01));
        return pagamento;
        }
        
    
        public static void main(String[] args) throws Exception {
            Scanner teclado = new Scanner(System.in);
            
            double prestacao;
            
            double pagamentoTotal = 0.0;
            
            do {
                System.out.print("valor total da prestacao: ");
                prestacao = teclado.nextDouble();

                System.out.print("Dias em atraso: ");
                int dias = teclado.nextInt();

                    if(prestacao!=0.0){
                        
                        
                        double pagamentoDia = valorPagamento(prestacao, dias); 
                        pagamentoTotal += pagamentoDia;

                        System.out.println(pagamentoDia);

                    }

            } while ( prestacao != 0.0);

    
                        System.out.println(pagamentoTotal);
}}
