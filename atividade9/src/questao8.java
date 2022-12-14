
import java.util.Scanner;


public class questao8 {
    


    static double valorPagamento(double prestacao, int dias) {
				
        if(dias==0) {
            return prestacao;
                    
        }
        double pagamento = prestacao+(prestacao*0.03)+(dias*0.001);
        return pagamento;
        }
        
    
        public static void main(String[] args) throws Exception {
            Scanner teclado = new Scanner(System.in);
            
            double prestacao;
            double pagamentoDia;

            
            do {
                System.out.print("valor total da prestacao: ");
                prestacao = teclado.nextDouble();

                System.out.print("valor total da prestacao: ");
                int dias = teclado.nextInt();

                    if(prestacao!=0.0){
                        valorPagamento(prestacao, dias);
                                           
                    }

            } while ( prestacao != 0.0);
            
            
            
            
            
            
            // while(true) {
                
            //     Scanner teclado = new Scanner(System.in);
            //     System.out.print("valor total da prestacao: ");
            //     double valor = teclado.nextDouble();
                
            //     System.out.print("valor total da prestacao: ");
            //     int dias = teclado.nextInt();
                
            //     if(valor==0) {
            //         System.out.print("relatorio:"+"\n");
            //         break;
            //     }else {
            //         valorPagamento(valor,dias);
                    
                
                
            // }
            
            
        
            // }
        }
    }

