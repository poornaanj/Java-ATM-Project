import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int accountNumber = 1234;
        int pinNumber = 123;
        double balance = 0;
        double input;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the ATM");
        System.out.println("-------------------");
        System.out.println();
        System.out.print("Enter your Account Number : ");
        var loginAccount = scanner.nextInt();
        System.out.print("Enter your Pin Number : ");
        var loginPin = scanner.nextInt();

        if(loginAccount==accountNumber && loginPin==pinNumber){
            System.out.println();
            System.out.println("Login Successful");
            System.out.println("----------------");
            while(true){
                var answer = mainMenu();
                switch (answer){
                    case 1:
                        System.out.println("Your balance is " + getBalance(balance));
                        continue;
                    case 2:
                        System.out.print("Enter the amount you want to deposit : ");
                        input = scanner.nextDouble();
                        balance = deposit(input,balance);
                        continue;
                    case 3:
                        System.out.print("Enter the amount you want to withdraw : ");
                        input = scanner.nextDouble();
                        balance = withdraw(input,balance);
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

    public static double deposit(double amount, double balance){
        balance += amount;
        System.out.println("Deposit successful");
        System.out.println("Your new account balance is "+ getBalance(balance));
        return balance;
    }

    public static double withdraw(double amount, double balance){
        balance -= amount;
        System.out.println("Withdraw successful");
        System.out.println("Your new account balance is "+ getBalance(balance));
        return balance;

    }

    public static String  getBalance(double balance){
        var formattedBalance = NumberFormat.getCurrencyInstance(Locale.US).format(balance);
        return formattedBalance;
    }
}