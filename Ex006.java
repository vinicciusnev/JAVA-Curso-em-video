import java.util.Scanner;

public class Ex006 {
   
   public static void main(String[] args) {
      try (Scanner teclado = new Scanner(System.in)) {
         System.out.print("Digite um numero: "); 
         int n1 = teclado.nextInt();
         System.out.print("Digite outro numero: ");  
         int n2 = teclado.nextInt();
         float div = n1 / n2;
         float res = n1 % n2;
         System.out.format("A divisão é %.2f, e o resto da divisão é %.2f", div, res);



      }
      
   }

}

