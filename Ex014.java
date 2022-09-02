import java.util.Scanner;

public class Ex014 {

   public static void main(String[] args) {
      try (Scanner teclado = new Scanner(System.in)) {
         System.out.print("Digite a primeira Nota: ");
         float n1 = teclado.nextFloat();
         System.out.print("Digite a segunda Nota: ");
         float n2 = teclado.nextFloat();
         float m = (n1 + n2)/2;
         System.out.println(m);
         if (m>=9) {
            System.out.println("Parabéns!");

         }

      }
      

   }
   
}
