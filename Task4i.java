import java.util.Scanner;
       public class Task4i {
          public static void main(String[] args) {
          Scanner console = new Scanner(System.in);

          System.out.print("Enter pennies: ");
          int pennies = console.nextInt();

          System.out.print("Enter nickels: ");
          int nickels = console.nextInt();

          System.out.print("Enter dimes: ");
          int dimes = console.nextInt();
 
          System.out.print("Enter quarters: ");
          int quarters = console.nextInt();

          int cents = pennies*1 + nickels*5 + dimes*10 + quarters*25;

          if ( cents == 100)
             System.out.print("Congratulations! You won the game.");
          if ( cents > 100) 
             System.out.print("The amount you entered is more than one dollar");
          if ( cents < 100) 
             System.out.print("The amount you entered is less than one dollar");
      }
   }