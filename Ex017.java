import java.util.Scanner;

public class Ex017 {
   
   public static void main(String[] args) {
      try(Scanner tela = new Scanner(System.in)) {
         System.out.print("Digite o numero de A: ");
         int numA = tela.nextInt();
         System.out.print("Digite o numero de B: ");
         int numB = tela.nextInt();
         System.out.print("Digite o numero de C: ");
         int numC = tela.nextInt();
         double calcD = (double) Math.pow(numB,2) - 4 * numA * numC;
         System.out.println(calcD);

         if(calcD < 0) {
            System.out.println("Não existem raízes Reais!");
         } else {
            System.out.println("Existem raízes Reais!");
         }

      }
      
   }
}
