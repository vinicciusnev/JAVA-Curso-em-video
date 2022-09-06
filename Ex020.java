import java.util.Scanner;

public class Ex020 {
   
   public static void main(String[] args) {
      try(Scanner t = new Scanner(System.in)) {
         System.out.print("Segmento A: ");
         int a = t.nextInt();
         System.out.print("Segmento B: ");
         int b = t.nextInt();
         System.out.print("Segmento C: ");
         int c = t.nextInt();
         if ( a<b+c && b<a+c && c<a+b)  {
            System.out.print("Formam um Triângulo ");
            if (a==b && b==c) {
               System.out.println("equilátero! ");
            } else if (a!=b && b!=c && a!=c) {
               System.out.println("escaleno! ");
            } else {
               System.out.println("isósceles! ");
            }

         } else {
            System.out.println("Não formam um Triângulo! ");
            System.out.println("------");
         }
      }
   }
}
