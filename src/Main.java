public class Main {

    public static void main(String[] args) {

        User user1 = new User(1234,123,1000);
        bankingFunctions operation = new bankingFunctions(user1.getBalance());

        ATMMenu.welcomeScreen();

        var loginAccount = (int) Console.readInput("Enter your Account Number");
        var loginPin = (int)Console.readInput("Enter your Pin Number");

        if(loginAccount== user1.getAccountNumber() && loginPin== user1.getPin()){
            ATMMenu.loginSuccessScreen();

            while(true){
                ATMMenu.functionsMenu();
                var answer = (int)Console.readInput("Enter your response");
                switch (answer){
                    case 1:
                        System.out.println("Your balance is " + operation.getBalance());
                        continue;
                    case 2:
                        operation.deposit(Console.readInput("Enter the amount you want to deposit"));
                        continue;
                    case 3:
                        operation.withdraw(Console.readInput("Enter the amount you want to withdraw"));
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