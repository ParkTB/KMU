public class StudentScores 
{ 
    private final int MAX_STUDENTS = 100;  
    private int numStudents; 
    private student students[];
    public StudentScores() {
    	students = new student[MAX_STUDENTS];
    	numStudents = 0;
    }
    public void add(String name, int score) 
    { 
    	
        if (numStudents >= MAX_STUDENTS) 
           return; // not enough space to add new student score 
        students[numStudents] = new student(name, score);
        numStudents = numStudents + 1;
    } 

    public String getHighest() 
    { 
      if (numStudents == 0) 
          return null; 

      int highest = 0; 

      for (int i = 1; i < numStudents; i++) 
      {
         if (students[i].score > students[highest].score) 
        	 highest = i; 
      }
      return students[highest].name; 
    } 

    public String getLowest() 
    { 
      if (numStudents == 0) 
         return null; 

      int lowest = 0; 

      for (int i = 1; i < numStudents; i++) 
         if (students[i].score < students[lowest].score) 
            lowest = i; 

      return students[lowest].name; 
    } 
} 
