import java.util.Scanner;
      public class Task4e {
        public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
     
        System.out.print("Enter number 1: ");
        int x = console.nextInt();
        
        System.out.print("Enter number 2: ");
        int y = console.nextInt();

        System.out.print("Enter number 3: ");
        int z = console.nextInt();

        if (x == y && y == z && z == x) {
           System.out.print("3");
         }
        else if (x != y && y == z || x == y && y != z || x == z && y != z && y != x) {
           System.out.print("2");
         }
        else if (x != y && y != z && z != y) {
           System.out.print("0");
         }
    }
  }