import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
     
    Scanner in = new Scanner(System.in);
    Integer noomber;
    
    // Enter username and press Enter
    System.out.println("Enter number"); 
    noomber = Integer.parseInt(in.nextLine());   
       
    System.out.println("Number is: " + noomber*noomber);
    
  }
}
