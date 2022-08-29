import java.util.Scanner;

public class Ex003 {
   public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      System.out.print("Digite o nome do aluno: ");
      String aluno1 = teclado.next();
      System.out.print("Digite a nota da Primeira unidade: ");
      float nota1 = teclado.nextFloat();
      System.out.print("Digite a nota da Segunda unidade: ");
      float nota2 = teclado.nextFloat();
      System.out.print("Digite a nota da Terceira unidade: ");
      float nota3 = teclado.nextFloat();
      System.out.print("Digite a nota da Quarta unidade: ");
      float nota4 = teclado.nextFloat();
      float resultado = (nota1 + nota2 + nota3 + nota4) / 4;
      System.out.format("O aluno %s ficou com a media de %.2f ", aluno1, resultado);
   }
}
