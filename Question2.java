import java.util.Scanner;

public class Question2
{
  public static void main(String[] Strings) {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */

    Scanner in = new Scanner(System.in);

    double weight = in.nextDouble();

    double height = in.nextDouble();
    

   double BMI = weight / (height * height);
   System.out.print(BMI);
    
    }
}
