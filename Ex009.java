import java.util.Scanner;

public class Ex009 {
   
   public static void main(String[] args) {
      try (Scanner teclado = new Scanner(System.in)) {
         System.out.print("Informe um valor: ");
         int num = teclado.nextInt();
         int resto = num % 2; /* Resto da Divisão por 2 */
         float elcubo = (float) Math.pow(num, 3); /* Elevado ao cubo */
         float raizQ = (float) Math.sqrt(num); /* Raiz Quadrada */
         float raizC = (float) Math.cbrt(num); /* Raiz cubica */
         int abs = Math.abs(num); /* Valor absoluto */
         System.out.println("Resto da Divisão por 2: " + resto);
         System.out.println("Elevado ao cubo: " + elcubo);
         System.out.println("Raiz Quadrada: " + raizQ);
         System.out.println("Raiz Cúbica: " + raizC);
         System.out.println("Valor Absoluto: " + abs);


      }

   }
}
