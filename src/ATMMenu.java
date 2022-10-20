import java.util.Scanner;

public class ATMMenu {

    public static int mainMenu(){
        System.out.println();
        System.out.println("Please select what to proceed with");
        System.out.println("1 - Check Balance");
        System.out.println("2 - Deposit Money");
        System.out.println("3 - Withdraw Money");
        System.out.println("4 - Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter you input : ");
        var input = scanner.nextInt();
        return input;
    }
}
