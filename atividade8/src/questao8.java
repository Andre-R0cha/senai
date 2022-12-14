import java.util.Scanner;

public class questao8 {
    



    


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
