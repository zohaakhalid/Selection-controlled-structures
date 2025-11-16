import java.util.Scanner;
     public class Task4d {
          public static void main(String[] args) {
          Scanner console = new Scanner(System.in);

          System.out.print("Enter two integers: ");
          int num1 = console.nextInt();
          int num2 = console.nextInt();
          if (num1 > num2) {
              System.out.println(num2);}
          else {
              System.out.println(num1);}

          System.out.print("Enter an integer: ");
          int x = console.nextInt();
           if (x>1) {
              System.out.println("1");}
          else if (x<1) {
              System.out.println("-1"); }
         else {
              System.out.print("0");}
      
        System.out.print("Enter three integers: ");
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();
        if( a<=b && a<=c) {
           System.out.println("minimum : " + a);}
        else if ( b<=a && b<=c ) {
           System.out.println("minimum : " + b);}
        else
           System.out.println("minimum : " + c);
        }
       }