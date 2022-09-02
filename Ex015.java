import java.util.Scanner;

public class Ex015 {

   public static void main(String[] args) {
      try (Scanner t = new Scanner(System.in)) {
         System.out.print("Digite o seu ano de Nascimento: ");
         int an = t.nextInt();
         int id = 2022 - an;
         System.out.println("Sua idade é " + id);
         if (an>=18) {
            System.out.println("Maior de idade!");
         } else {
            System.out.println("Menor de idade!");
         }
      }

   }
   
}
