public class Task4a {
      public static void main(String[] args) {
       
      int x = 10;
      int y = 15;
      int z = 20;
  Boolean great = (!(x>10));
  System.out.println("The answer is " + great);
  Boolean wow = (x <= 5 || y < 15);
  System.out.println("The answer is " + wow);
  Boolean hell = ((x != 5) && (y != z));
  System.out.println("The answer is " + hell);
  Boolean damn = (x >= z || (x + y >=z));
  System.out.println("The answer is " + damn);
  Boolean yay = ((x <= y - 2) && (y >= z) || (z - 2 != 20));
  System.out.println("The answer is " + yay);

}
}
      