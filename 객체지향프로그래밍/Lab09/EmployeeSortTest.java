/**
   @version 1.30 2004-02-27
   @author Cay Horstmann
*/

import java.util.*;

public class EmployeeSortTest
{  
   public static void main(String[] args)
   {  
	  ArrayList<Employee> staff = new ArrayList<Employee>();
	  staff.add(new Employee(20071008,"Harry Hacker", 35000));
	  staff.add(new Employee(20010003, "Carl Cracker", 75000));
      staff.add(new Employee(20040001, "Tony Tester", 38000));
      
      Collections.sort(staff);

      // print out information about all Employee objects
      Iterator<Employee> it = staff.iterator();
      while (it.hasNext()) {
    	 Employee a = it.next();
    	 System.out.println("Company Id =" + a.getcompanyid() + ", Name = "+a.getName() + ", salary = " + a.getSalary());
      }
     
   }
}

class Employee implements Comparable<Employee>
{  
   private String name;
   private double salary;
   private int companyid;

   public Employee(int id, String n, double s)
   {  
	  this.companyid = id;
      this.name = n;
      this.salary = s;
   }

   public String getName()
   {  
      return name;
   }
   public int getcompanyid() {
	   return companyid;
   }
   public double getSalary()
   {  
      return salary;
   }

   public void raiseSalary(double byPercent)
   {  
      double raise = salary * byPercent / 100;
      salary += raise;
   }

   /**
      Compares employees by salary
      @param other another Employee object
      @return a negative value if this employee has a lower
      salary than otherObject, 0 if the salaries are the same,
      a positive value otherwise
   */
   public int compareTo(Employee other)
   {  
      if (companyid < other.companyid) return -1;
      if (companyid > other.companyid) return 1;
      return 0;
   }
}



