// **********************************************************
//   Temps.java
//
//   This program reads in a sequence of hourly temperature 
//   readings (beginning with midnight) and prints the maximum
//   temperature (along with the hour, on a 24-hour clock, it 
//   occurred) and the minimum temperature (along with the hour
//   it occurred).
// **********************************************************

import java.util.*;

public class Temps
{
    public static void main(String[] args)
    {
	final int HOURS_PER_DAY = 24;

	int temp; // a temperature reading
	int maxtemp = -1000;
	int timeofmax = 0;
	int mintemp = 1000;
	int timeofmin = 0;
	
	// print program heading
	System.out.println();
	System.out.println("Temperature Readings for 24 Hour Period");
	System.out.println();
	
	Scanner in = new Scanner(System.in);

	for (int hour = 0; hour < HOURS_PER_DAY; hour++)
	{
	    System.out.print("Enter the temperature reading at " + hour +
				" hours: ");
	    temp = in.nextInt();
	    if (temp>maxtemp) {
	    	maxtemp = temp;
	    	timeofmax = hour;
	    }
	    if (temp<mintemp) {
	    	mintemp = temp;
	    	timeofmin = hour;
	    }
	}
	System.out.println("maxtemp : "+maxtemp + " time : " + timeofmax);
	System.out.println("mintemp : " + mintemp + " time : " + timeofmin);
	// Print the results
    }
}
