import java.util.Scanner;
    public class Task4g {
       public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
 
       System.out.print("Enter length 1: ");
       double length1 = sc.nextDouble();
       System.out.print("Enter width 1: ");
       double width1 = sc.nextDouble();

       System.out.print("Enter length 2: ");
       double length2 = sc.nextDouble();
       System.out.print("Enter width 2: ");
       double width2 = sc.nextDouble();
 
       double area1 = length1 * width1;
       double area2 = length2 * width2;

       if (area1 > area2)
            System.out.print("Rectangle 1 has greater area.");
       if (area2 > area1)
            System.out.print("Rectangle 2 has greater area.");
        else
            System.out.print("Both rectangles have same area.");
     }
   }
       



