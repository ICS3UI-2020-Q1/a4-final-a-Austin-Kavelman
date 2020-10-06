import java.util.Scanner;

/**
 *
 * @author Austin Kavelman
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
  // Create a scanner for user input
  Scanner input = new Scanner(System.in);

  int number = (0) % 9;

  int answer;

  do{
    //ask the user to enter a positive interger
    System.out.println("Please enter a positive integer to determine its factors: ");
    answer = input.nextInt();
  if (answer == number);
    System.out.print(number + " ");
  if(answer > 0);
    System.out.println("00");
  }while(number < 0);
    System.out.println("The factors of " + answer + " are:" );
     


  }
}
