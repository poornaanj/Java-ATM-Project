import java.util.Scanner;

public class Console {

    private static Scanner scanner = new Scanner(System.in);

    public static double readInput(String message){
        System.out.print(message + " : ");
        return scanner.nextDouble();
    }
}
