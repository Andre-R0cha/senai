import java.util.Scanner;

public class questao6 {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner n1 = new Scanner(System.in);
        System.out.println("Digite o valor da altura: ");
        float altura = Float.parseFloat(n1.nextLine());
        Scanner n2 = new Scanner(System.in);
        System.out.println("Digite o valor do peso: ");
        float peso = Float.parseFloat(n2.nextLine());

        float IMC = (peso / (altura) * (altura));
        System.out.println(IMC);
        if (IMC <= 18) {
            System.out.println("Abaixo do peso");
        }
        if (IMC < 25) {
            System.out.println("Peso ideal");
        }
        if (IMC < 30) {
            System.out.println("Peso Sobrepeso");
        }
        if (IMC < 35) {
            System.out.println("Obesidade grau 1");
        }
        if (IMC < 40) {
            System.out.println("Obesidade grau 2");
        } else {
            System.out.println("Obesidade grau 3");
        }

    }
}
