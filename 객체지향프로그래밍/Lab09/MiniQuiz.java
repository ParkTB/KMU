//********************************************************************
//  MiniQuiz.java       
//
//  Demonstrates the use of a class that implements an interface.
//********************************************************************

import java.util.*;

public class MiniQuiz
{
   //-----------------------------------------------------------------
   //  Presents a short quiz.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {

      askQuestion("What is the capital of Jamaica?",4,"Kingston");

      askQuestion("Which is worse, ignorance or apathy?",10,"I don't know and I don't care");

      
   }
   
   private static void askQuestion(String question, int level, String result) {
	   Question q;
	   String possible;
	   q = new Question (question, result);
	   q.setComplexity(level);
	   System.out.print (q.getQuestion());
	   System.out.println (" (Level: " + q.getComplexity() + ")");
	   Scanner in = new Scanner(System.in);
	   possible = in.next();
	   
	   if (q.answerCorrect(possible))
		   System.out.println("Correct");
	   else
		   System.out.println("No, the answer is " + q.getAnswer());
	   
	   
   }
}
