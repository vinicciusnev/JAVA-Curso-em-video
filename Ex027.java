import java.util.Scanner;

public class Ex027 {
   
   public static void main(String[] args) {
      try(Scanner sc = new Scanner(System.in)) {
         for( int cc = 0; cc <= 100; cc +=10) {
            System.out.println(cc);
         }
      }
   }
}
