import java.util.InputMismatchException;
import java.util.OptionalDouble;
import java.util.Scanner;

public class Console {

    // This class is to take the inputs from the user
    private static Scanner scanner = new Scanner(System.in);

    /* readInput is an overridden method which is used to take input.
    Both implementations return a double value
    Second implementation has min and max value. It will loop until the input is in valid range.
     */
    public static double readInput(String message){
        double input = 0;
        try{
            System.out.print(message + " : ");
            input = scanner.nextDouble();
        }
        catch (InputMismatchException e){
            System.out.println("** Invalid input **");
            System.exit(0);
        }
        return input;
    }

    public static double readInput(String message,int min,int max){
        double input = 0;
        while(true){
            try{
                System.out.println(message + " : ");
                input = scanner.nextDouble();
                if(input<min||input>max){
                    System.out.println("The response should be within "+min+" and "+max);
                    continue;
                }
                break;
            }
            catch (InputMismatchException e){
                System.out.println("** Invalid input **");
                System.exit(0);
            }
        }
        return input;
    }
}
