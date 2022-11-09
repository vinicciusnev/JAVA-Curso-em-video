import java.util.Arrays;

public class Ex031 {

   public static void main(String[] args) {
      int n[] = { 3, 5, 1, 8, 4 };
      Arrays.sort(n);
      for (int valor : n) {
         System.out.print(valor + " ");
      }
   }
}
