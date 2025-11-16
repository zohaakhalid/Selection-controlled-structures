import java.util.Scanner;
        public class Task4j {
           public static void main(String[] args) {
           Scanner console = new Scanner(System.in);

           System.out.print("Enter no of books: ");
           int x = console.nextInt();

           if ( x == 0 )
             System.out.print("0");
           if ( x == 1)
             System.out.print("5");
           if ( x == 2)
             System.out.print("15");
           if ( x == 3)
             System.out.print("30");
           if ( x >= 4)
             System.out.print("60");
       }
     }

