import java.util.InputMismatchException;
import java.util.OptionalDouble;
import java.util.Scanner;

public class Console {

    private static Scanner scanner = new Scanner(System.in);

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
