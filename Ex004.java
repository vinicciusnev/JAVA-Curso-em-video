import java.util.Scanner;


public class Ex004 {

  
   public static void main(String[] args) {
      try (Scanner teclado = new Scanner(System.in)) {     
         System.out.print("Digite o seu ano de nascimento: ");
         int anoNascimento = teclado.nextInt();
         System.out.print("Digite o ano atual: ");
         int anoAtual = teclado.nextInt();
         int suaidade = anoAtual - anoNascimento;
         System.out.println("sua idade atual é " + suaidade);
   
      }



   }
   
   
}
