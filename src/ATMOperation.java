import java.util.HashMap;
import java.util.Map;

public class ATMOperation {

    public void atmOperation() {

        ATMMenu.welcomeScreen();

        var loginAccount = (int) Console.readInput("Enter your Account Number");
        var loginPin = (int) Console.readInput("Enter your Pin Number");

        if (isTrueCustomer(loginAccount)) {
            User currentCustomer = identifyCurrentCustomer(loginAccount);
            if(currentCustomer.getPin()==loginPin){
                ATMMenu.loginSuccessScreen();
                accountSelection(currentCustomer);
            }
            else
                ATMMenu.invalidLogin();
        } else {
            ATMMenu.invalidLogin();
        }
    }

    /* This method identify whether the entered account number
    is in the account directory and return true if is available */
    private boolean isTrueCustomer(int loginAccount){
        var users = userDirectory();
        return users.containsValue(loginAccount);
    }

    /*This method  identifies who is the user according to the entered
    account number and return the user object
     */
    private User identifyCurrentCustomer(int loginAccount) {
        var users = userDirectory();
        for (var current : users.entrySet()) {
            if (current.getValue() == loginAccount) {
                return current.getKey();
            }
        }
        return null;
    }

    /*This method defines the selection of account to do the
    transaction */
    private void accountSelection(User customer){
        ATMMenu.accountMenu();
        var selectedAccount = (int)Console.readInput("Enter your response : ",1,3);
        Account account;
        switch (selectedAccount){
            case 1:
                account = new Account(customer.getSavingsBalance());
                bankingOperation(account);
                break;
            case 2:
                account = new Account(customer.getMobileBalance());
                bankingOperation(account);
                break;
            case 3:
                System.out.println("Thank you, have a nice day !!");
                return;
            default:
                System.out.println("Invalid input");
        }
    }

    /*This method defines different transaction operations
     */
    private void bankingOperation(Account account) {
        while (true) {
            ATMMenu.functionsMenu();
            var answer = (int) Console.readInput("Enter your response",1,4);
            switch (answer) {
                case 1:
                    System.out.println("Your balance is " + account.getBalance());
                    continue;
                case 2:
                    account.deposit(Console.readInput("Enter the amount you want to deposit"));
                    continue;
                case 3:
                    account.withdraw(Console.readInput("Enter the amount you want to withdraw"));
                    continue;
                case 4:
                    System.out.println("Thank you, have a nice day !!");
                    return;
                default:
                    System.out.println("Invalid input");
            }
        }
    }

    //This method returns the user directory Map
    private Map<User,Integer> userDirectory(){
        User user1 = new User(1234, 123, 1000,1000);
        User user2 = new User(2345, 234);
        User user3 = new User(3456, 345, 500,0);

        Map<User, Integer> users = new HashMap<>();

        users.put(user1, user1.getAccountNumber());
        users.put(user2, user2.getAccountNumber());
        users.put(user3, user3.getAccountNumber());

        return users;
    }

}
