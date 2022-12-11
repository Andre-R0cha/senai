import java.util.Scanner;

public class quest3 {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int x = Integer.parseInt(sc.next());

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int y = Integer.parseInt(sc2.next());
        
        System.out.println("valor de x e: " + x + " " + " valor de y e: " + y);
        if (x < y) {
            for (int i = x; i < y; i++) {
                int list = 0;
                list += i + 1;
                System.out.println(" " + list + " ");

            }
        } else {
            for (int j = y; j < x; j++) {
                int listy = 0;
                listy += j + 1;
                System.out.println(" " + listy + " ");

            }
        }

    }

}
