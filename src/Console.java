import java.util.Scanner;

public class Console {

    private static Scanner scanner = new Scanner(System.in);

    public static double readInput(String message){
        System.out.println(message);
        return scanner.nextDouble();
    }
}
