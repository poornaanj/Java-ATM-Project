import java.util.HashMap;
import java.util.Map;

public class ATMOperation {


    public static void atmOperation() {
        User user1 = new User(1234, 123, 1000);
        User user2 = new User(2345, 234);
        User user3 = new User(3456, 345, 500);

        Map<User, Integer> users = new HashMap<>();

        users.put(user1, user1.getAccountNumber());
        users.put(user2, user2.getAccountNumber());
        users.put(user3, user3.getAccountNumber());

        ATMMenu.welcomeScreen();

        var loginAccount = (int) Console.readInput("Enter your Account Number");
        var loginPin = (int) Console.readInput("Enter your Pin Number");

        boolean exists = users.containsValue(loginAccount);

        if (exists) {
            User customer=null;
            for(var current : users.entrySet()){
                if(current.getValue()==loginAccount){
                    customer=current.getKey();
                    break;
                }
            }
            if(customer.getPin()==loginPin){
                ATMMenu.loginSuccessScreen();
                bankingFunctions newCustomer = new bankingFunctions(customer.getBalance());

                while(true){
                    ATMMenu.functionsMenu();
                    var answer = (int)Console.readInput("Enter your response");
                    switch (answer){
                        case 1:
                            System.out.println("Your balance is " + newCustomer.getBalance());
                            continue;
                        case 2:
                            newCustomer.deposit(Console.readInput("Enter the amount you want to deposit"));
                            continue;
                        case 3:
                            newCustomer.withdraw(Console.readInput("Enter the amount you want to withdraw"));
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

        } else {
            System.out.println("Invalid login : Account Number or Pin Number is not correct");
        }
    }

}
