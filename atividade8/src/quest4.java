import java.util.Scanner;
import java.util.ArrayList;

public class quest4 {
    public static void main(String[] args) throws Exception{
       

        Scanner teclado = new Scanner(System.in);



        ArrayList<Double> notas = new ArrayList<Double>();        
        for (int i = 0; i < 1; i++) {
           System.out.println("Digite a nota do aluno: ");
           notas.add ( teclado.nextDouble());
           
        }

        for (Double i : notas) {
            System.out.println(" "+notas+" ");
          }

         String nota =  String.valueOf(notas);
         String[] notasAlunos = nota.split(" ", 1);
         System.out.println(notas);





//         // for (int j = 0; j < nota.length; j++) {
//         //     notas[]= 
//         // }
       
// System.out.println(" "+a+" "+b+" "+c+" "+d+" "+e+" ");




// for (String x : arrOfStr)
//     System.out.println(" "+x+" ");

//     ArrayList<String> cars = new ArrayList<String>();
//     cars.add("Volvo");
//     cars.add("BMW");
//     cars.add("Ford");
//     cars.add("Mazda");
//     for (int i = 0; i < cars.size(); i++) {
//       System.out.println(cars.get(i));
//     }
  
//     for (String i : cars) {
//         System.out.println(" "+cars+" ");
//       }

     


        


    }
}
