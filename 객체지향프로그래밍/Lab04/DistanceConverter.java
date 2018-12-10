public class DistanceConverter 
{ 
    public static void main(String args[]) 
    { 
       final double yards = 3.5; 
       final double feet = yards * 3; 
       final double inches = feet * 12; 
       System.out.format("%s yards are %s feet \n", yards, feet);
       System.out.format("%s yards are %s inches", yards, inches);
    }
} 
