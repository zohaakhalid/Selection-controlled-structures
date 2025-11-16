import java.util.Scanner;
      public class Task4h {
          public static void main(String[] args) {
          Scanner console = new Scanner(System.in);

          System.out.print("Enter month: ");
          int month = console.nextInt();

          System.out.print("Enter date: ");
          int day = console.nextInt();

          System.out.print("Enter year: ");
          int year = console.nextInt();

          if (month*day == year)
             System.out.print("Date is magic");
          else
             System.out.print("Date is not magic");
      }
    }
          