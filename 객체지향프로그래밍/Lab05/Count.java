// **********************************************************
//   Count.java
//
//   This program reads in strings (phrases) and counts the 
//   number of blank characters and certain other letters
//   in the phrase.
// **********************************************************

import java.util.*;

public class Count
{
  public static void main(String[] args)
  {
	  
      Scanner in = new Scanner(System.in); // standard input
      String phrase;    // a string of characters
      int countBlank;   // the number of blanks (spaces) in the phrase 
      int length;       // the length of the phrase
      char ch;          // an individual character in the string
      
      while(true) {
    	  
    	  int counta = 0, counte = 0, counts = 0, countt = 0;
      
      
      // Print a program header
    	  System.out.println();
    	  System.out.println("Character Counter");
    	  System.out.println();

      // Read in a string and find its length
    	  System.out.print("Enter a sentence or phrase: ");
    	  phrase = in.nextLine();
    	  length = phrase.length();
    	  if (phrase.equals("quit")) {
    		  System.out.println("End");
    		  break;
    	  }
    		
      // Initialize counts
    	  countBlank = 0;
      
    	  for (int i = 0; i < length; i++) {
    		  ch = phrase.charAt(i);
    		  switch(ch) {
    		  case 'a': case 'A':
    			  counta += 1;
    			  break;
    		  case 'e': case 'E':
    			  counte += 1;
    			  break;
    		  case 's': case 'S':
    			  counts += 1;
    			  break;
    		  case 't': case 'T':
    			  countt += 1;
    			  break;
    		  case ' ':
    			  countBlank += 1;
    			  break;
 
    		  }
    	  }
      // a for loop to go through the string character by character
      // and count the blank spaces

      // Print the results
    	  System.out.println();
    	  System.out.println("Number of blank spaces: " + countBlank);
    	  System.out.println("Number of a: " + counta);
    	  System.out.println("Number of e: " + counte);
    	  System.out.println("Number of s: " + counts);
    	  System.out.println("Number of t: " + countt);
    	  System.out.println();
      }
  }
}
