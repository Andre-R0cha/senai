import java.util.Scanner;

public class questao5 {


    //     5. Crie um programa que solicite ao usuário a informação de 3 estaturas. Caso existam
//     estaturas iguais, o programa deve apresentar a mensagem “Há, pelo menos, 2 pessoas
//     com a mesma estatura”. Caso contrário, o programa deve informar a maior estatura.
/**
 * @param args
 */
public static void main(String[] args) {
    
    Scanner n1 = new Scanner(System.in);
    System.out.println("Digite o valor da altura: ");
    int altura1 = Integer.parseInt(n1.nextLine());
    Scanner n2 = new Scanner(System.in);
    System.out.println("Digite o valor da altura: ");
    int altura2 = Integer.parseInt(n2.nextLine());
    Scanner n3 = new Scanner(System.in);
    System.out.println("Digite o valor da altura: ");
    int altura3 = Integer.parseInt(n3.nextLine());

    if(altura1==altura2){
        System.out.println("tem duas alturas iguais!");
    }
    
    if(altura1==altura3){
        System.out.println("tem duas alturas iguais!");
    }
    if(altura2==altura3){
        System.out.println("tem duas alturas iguais!");
    }


    if(altura1>altura2){
        if(altura1>altura3){
            System.out.println("altura maior: "+altura1);
        }
    }else if(altura2>altura3){
        System.out.println("altura maior: "+altura2);
    }else{
        System.out.println("altura maior: "+altura3); 
    }
     
}    
}
