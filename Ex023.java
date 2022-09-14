import java.util.Scanner;

public class Ex023 {
   
   public static void main(String[] args) {
      try(Scanner t = new Scanner(System.in)) {
         int cc = 0;
         
         do {
            System.out.println(cc);
            cc++;
         } while (cc<4);

      }
   }
}
