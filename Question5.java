import java.util.ArrayList;
import java.util.Scanner;

public class Question5 {
  public static void main(String[] args) {
    /**
     * Prompt the user for number. This input indicates the number of integers the
     * user will be entering next.
     * Print out the mode (highest occurrence) from the set of integers.
     * e.g.
     * > 5
     * > 2
     * > 4
     * > 1
     * > 3
     * > 4
     * 4
     * 
     * e.g.
     * > 4
     * > 2
     * > 2
     * > 3
     * > 3
     * 2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */

    Scanner in = new Scanner(System.in);
    Integer inputloop;
    inputloop = Integer.parseInt(in.nextLine());

    ArrayList<Integer> container = new ArrayList<Integer>();
    int mode = 0;
    int maxcount = 0;

    if (inputloop != 1) {
      for (int i = 0; i < inputloop; i++) {
        int numb = Integer.parseInt(in.nextLine());
        int thisnumbcount = 1;
        container.add(numb);

        for (int j = 0; j < container.size(); j++) {

          if (container.get(j) == container.get(i))
            thisnumbcount++;

          if (thisnumbcount > maxcount) {
            mode = numb;
            maxcount = thisnumbcount;
          }
        }
      }
      System.out.println(mode);
    }
    else{
      System.out.println("Could not get mode, you only entered one number. Number you've entered: "+ inputloop);
    }
    

  }
}
