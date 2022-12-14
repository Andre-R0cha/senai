


public class questao1 {

	
	

    static void somaArray(int[] arrayN) {
        int soma = 0;

        for (int i = 0; i < arrayN.length; i++) {
            soma += arrayN[i];
          
        }
        System.out.print(soma);

    }

    public static void main(String[] args) throws Exception {

        int[] arrayN = { 4, 5, 6 };
        somaArray(arrayN);
        
        

    }

}