import java.util.Scanner;

public class Ex028 {
   
   public static void main(String[] args) {
      try(Scanner sc = new Scanner(System.in)) {
         System.out.print("Quer começar a contar a partir de quanto ? ");
         int inicio = sc.nextInt();
         System.out.print("Quer finalizar a contagem em quanto ? ");
         int fim = sc.nextInt();
         System.out.print("Quer contar pulando de quanto em quanto ? ");
         int passo = sc.nextInt();
         

         for(int cc = inicio; cc <= fim; cc += passo) {
            System.out.println(cc);
         }
      }
   }
}
