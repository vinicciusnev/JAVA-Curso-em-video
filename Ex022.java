import java.util.Scanner;

public class Ex022 {
   public static void main(String[] args) {
      try(Scanner t = new Scanner(System.in)) {
         System.out.print("Digite um numero: ");
         int n = t.nextInt();
         int f = 1;
         int c = n;

         while (c>=1) {
            f *= c;
            c--;
         }
         System.out.println(f);
      }
   }
}
