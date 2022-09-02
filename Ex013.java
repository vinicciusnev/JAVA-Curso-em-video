import java.util.Scanner;

public class Ex013 {
   
   public static void main(String[] args) {
      try (Scanner teclado = new Scanner(System.in)) {
         System.out.print("ADVINHE UM NUMERO ENTRE 1 A 5: ");
         int num = teclado.nextInt();
         double n = 1 + Math.random() * (6 - 1);
         int valor = (int) n;
         String f1 = "ACERTOU";
         String f2 = "ERROU ! Eu pensei em " + valor;
         String res = (valor == num)?f1:f2;
         System.out.println(res);

      }

   }
}
