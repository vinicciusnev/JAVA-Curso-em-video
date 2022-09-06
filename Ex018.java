import java.util.Scanner;

public class Ex018 {
   
   public static void main(String[] args) {
      try (Scanner teclado = new Scanner(System.in)) {
         System.out.print("Digite seu ano de nascimento: ");
         int ano = teclado.nextInt();
         int idade = 2022 - ano;
         System.out.println("Você tem " + idade + " anos !");
         if (idade<16) {
            System.out.print("Não vota !");
         } else if ((idade>=16 && idade<18) || (idade>70)) {
               System.out.print("Voto Opcional");
            } else {
               System.out.print("Voto Obrigatório!");
            }
         }
 

         
      }
   }



