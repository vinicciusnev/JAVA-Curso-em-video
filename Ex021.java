import java.util.Scanner;

public class Ex021 {
   
   public static void main(String[] args) {
      try(Scanner t = new Scanner(System.in)) {
         int cc = 0;
         while (cc<10) {
            cc++;
            if (cc == 5 || cc == 7) {
               break;
            }
            System.out.println("Cambalhota " + cc);
            
         }
      }
   }
}
