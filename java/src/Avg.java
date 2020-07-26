import java.util.*;

public class Avg
{
   public static void main(String[] args)
   {
      ArrayList<Integer> num = new ArrayList<Integer>();
 
      Scanner in = new Scanner(System.in);
      System.out.println("Please enter a list of numbers: ");
       
      while (in.hasNextInt())
      {
         int input = in.nextInt();
         num.add(input);
      }
 
      if (num.size() == 0)
      {
         System.out.println("No average.");
 
      } 
       
      else
      {
         double sum = 0;
         for (int x : num)
         {
            sum = sum + x;
         }
         double mean = sum / num.size();
         System.out.println("The average is: " + mean);
 
      }
   }
}