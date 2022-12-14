public class questao2 {
   
    
   
	
	
        static void cauculo(int numeroDigitado) {
        
        int i= 1,fatorial = 1;
        while(i<= numeroDigitado) {
            fatorial*=i;
            i+=1;
        }
        System.out.print(fatorial);
        }
        
        
        public static void main(String[] args) {
            
            
            Scanner teclado = new Scanner(System.in);
            
            
            System.out.println("digite um numero: ");
            int numeroDigitado = teclado.nextInt();
            cauculo(numeroDigitado);
            
            
        }
    
    }

