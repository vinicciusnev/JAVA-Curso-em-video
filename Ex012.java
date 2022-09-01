import java.util.Scanner;

public class Ex012 {
   
   public static void main(String[] args) {
      try (Scanner teclado = new Scanner(System.in)) {
         System.out.print("Digite seu ano de nascimento: ");
         int ano = teclado.nextInt();
         int idade = 2022 - ano;
         String sit = ((idade>=16 && idade<18) || (idade>70))?"VOTO OPCIONAL": "VOTO OBRIGATORIO";
         System.out.println(sit); 
 

         
      }
   }
}
