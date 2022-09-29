import java.util.Scanner;

public class Ex025 {
   
  
   public static void main(String[] args) {
      try(Scanner sc = new Scanner(System.in)) {
         int n, s = 0;
         int total = -1;
         int impar = 0;
         int par = -1;
         int maisdecem = 0;
         float media;
         
         do {
            System.out.print("Informe um numero: (valor 0 interrompe) ");
            n = sc.nextInt();
            s +=n;
            total++;
            if (n%2==0){
               par++;
            } else {
               impar++;
            }
            if (n>100){
               maisdecem++;
            }
         } while (n != 0);
         media = s / total;
         System.out.println("O somatorio vale " + s);
         System.out.println("Total de Valores: " + total);
         System.out.println("Total de pares: " + par);
         System.out.println("Total de Impares: " + impar);
         System.out.println("Acima de 100: " + maisdecem);
         System.out.println("Média dos valores: " + media);
      }
   }
}
