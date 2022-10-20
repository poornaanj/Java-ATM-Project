import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        User user1 = new User(1234,123,1000);
        Operations operation = new Operations();
        double input;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the ATM");
        System.out.println("-------------------");
        System.out.println();
        System.out.print("Enter your Account Number : ");
        var loginAccount = scanner.nextInt();
        System.out.print("Enter your Pin Number : ");
        var loginPin = scanner.nextInt();

        if(loginAccount== user1.getAccountNumber() && loginPin== user1.getPin()){
            System.out.println();
            System.out.println("Login Successful");
            System.out.println("----------------");
            while(true){
                var answer = ATMMenu.mainMenu();
                switch (answer){
                    case 1:
                        System.out.println("Your balance is " + operation.getBalance());
                        continue;
                    case 2:
                        System.out.print("Enter the amount you want to deposit : ");
                        input = scanner.nextDouble();
                        operation.deposit(input);
                        continue;
                    case 3:
                        System.out.print("Enter the amount you want to withdraw : ");
                        input = scanner.nextDouble();
                        operation.withdraw(input);
                        continue;
                    case 4:
                        System.out.println("Thank you, have a nice day");
                        return;
                    default:
                        System.out.println("Invalid input");
                }
            }
        }
        else
            System.out.println("Invalid login : Account Number or Pin Number is not correct");
    }

}