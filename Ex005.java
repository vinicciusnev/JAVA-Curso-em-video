import java.util.Scanner;

public class Ex005 {
   
   public static void main(String[] args) {
      try (Scanner teclado = new Scanner(System.in)) {
         System.out.print("Digite um numero: "); 
         int n1 = teclado.nextInt();
         System.out.print("Digite outro numero: ");  
         int n2 = teclado.nextInt();
         float m = (n1 + n2)/2;
         System.out.println("A media entre os dois numeros é " + m);



      }
      
   }

}

