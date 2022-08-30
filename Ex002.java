import java.util.Scanner;


public class Ex002 {


   public static void main(String[] args) {
         try (Scanner teclado = new Scanner(System.in)) {
         System.out.print("Digite o primeiro numero: ");
         int valor1 = teclado.nextInt();
         System.out.print("Digite o segundo numero: ");
         int valor2 = teclado.nextInt();
         int resultado = valor1 + valor2;
         System.out.print("A soma é " + resultado);
      }
      
   }

  
}