import java.util.Scanner;

public class Ex036 {

   public static void main(String[] args) {

      saudacaoPadrao();
      System.out.println("");

      Scanner sc = new Scanner(System.in);

      System.out.print("Informe o seu salario Bruto: ");
      double salarioBruto = sc.nextDouble();
      System.out.print("Digite a quantidade de faltas no mês: ");
      double qtdFaltas = sc.nextInt();
      sc.close();

      double salLiquido = calculoSalario(salarioBruto, qtdFaltas);

      System.out.format("O salario liquido é: R$ %.2f ", salLiquido);
      System.out.println("");

      saudacaoPadrao();

   }

   public static void saudacaoPadrao() {
      System.out.println("");
      System.out.println(
            "Programa de cálculo do salario liquido\nDesenvolvido pela turma de TI\nDisciplina de Fundamentos da Progamação");

   }

   public static double calculoSalario(double salarioBruto, double qtdFaltas) {
      double salarioLiquido = salarioBruto - ((salarioBruto) / 30 * qtdFaltas);
      return salarioLiquido;
   }

}