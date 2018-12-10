import java.text.SimpleDateFormat;
import java.util.*;

// An exploration of basic input and output.
class BasicIO {

   // Reads and processes string input.
   public static void main(String[] args) {

      Scanner stdin = new Scanner(System.in);
      Date now = new Date();
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd��");
      String n = sdf.format(now);

      // get first input
      System.out.print("Enter your name: ");
      String name = stdin.nextLine();
      
      System.out.print("Enter your ages: ");
      int years = stdin.nextInt();
      
      System.out.print("Enter your height: ");
      int height = stdin.nextInt();      

      // display output on console
      System.out.printf(n + " ���� " + name + "(" + years + ")�� Ű�� " + height + "cm �Դϴ�.\n");
      System.out.print("days = " +years*365);
      
     

   }  // method main

}  // class BasicIO
