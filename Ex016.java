import java.util.Scanner;

public class Ex016 {
   
   public static void main(String[] args) {
      try (Scanner tela = new Scanner(System.in)) {
         System.out.print("Digite um NUMERO: ");
         int v = tela.nextInt();
         if (v%2==0){
            System.out.println("PAR");

         } else {
            System.out.println("IMPAR");
         }
      }

      
    }
}
