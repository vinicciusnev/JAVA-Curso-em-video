import java.util.Arrays;

public class Ex032 {
   
   public static void main(String[] args) {
      int vet[] = {3, 7, 6, 1, 9, 4, 2};
      for(int valor: vet){
         System.out.print(valor + " ");
      }
      System.out.println("");
      int p = Arrays.binarySearch(vet, 1);
      System.out.println("Encontrei o valor na posição " + p);
   }
}
