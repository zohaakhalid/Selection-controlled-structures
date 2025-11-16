import java.util.Scanner;
        public class Task4f {
           public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);

           System.out.print("Enter a number from 1-10: ");
           int num = sc.nextInt();
 
           String roman = "";
           switch (num) {
             case 1 : roman = "I"; break;
             case 2 : roman = "II"; break;
             case 3 : roman = "III"; break;
             case 4 : roman = "IV"; break;
             case 5 : roman = "V"; break;
             case 6 : roman = "VI"; break;
             case 7 : roman = "VII"; break;
             case 8 : roman = "VIII"; break;
             case 9 : roman = "IX"; break;
             case 10 : roman = "X"; break;
          default:
             System.out.println("Error: Num must be between 1 and 10.");
        }
          System.out.println("Roman numeral: " + roman);
     }
   }