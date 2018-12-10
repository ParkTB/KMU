import java.util.*;
// ************************************************
//   BaseConvert.java
//
//   Converts base 10 numbers to another base
//   (at most 4 digits in the other base).  The
//   base 10 number and the base are input.
// ************************************************

public class BaseConvert
{
   public static void main(String[] args)
   {
      int base;        // the new base
      int base10Num;   // the number in base 10
      int maxNumber;   // the maximum number that will fit
                       // in 4 digits in the new base

      int place0;      // digit in the 1’s place
      int place1;      // digit in the base place
      int place2;      // digit in the base*base place
      int place3;      // digit in the base*base*base place

      String baseBNum = new String(""); // the number in the new base

      // read in the base 10 number and the base
	  Scanner in = new Scanner(System.in);
      System.out.println();
      System.out.println("Base Conversion Program");
      System.out.println();
      System.out.print("Please enter a base (2 - 9): ");
      base = in.nextInt();
      maxNumber = base*base*base*base-1;
      
      // Compute the maximum base 10 number that will fit in 4 digits 
      // in the new base and tell the user what range the number they
      // want to convert must be in
      
      System.out.println("최대 정수 "+ maxNumber);
      System.out.println("Please enter a base 10 number to convert: ");
      base10Num = in.nextInt();
      place0 = base10Num%base;
      place1 = (base10Num/base)%base;
      place2 = base10Num/base/base%base;
      place3 = base10Num/base/base/base%base;
      
      baseBNum = baseBNum+place3;
      baseBNum = baseBNum+place2;
      baseBNum = baseBNum+place1;
      baseBNum = baseBNum+place0;
      System.out.println(baseBNum);
      // Do the conversion (see notes in lab)

      // Print the result (see notes in lab)

    }
}

