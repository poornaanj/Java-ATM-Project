public class ATMMenu {

    /*This class contains the methods which display different menus
    and messages in the ATM screen */

    public static void welcomeScreen(){
        System.out.println("Welcome to the ATM");
        System.out.println("-------------------");
        System.out.println();
    }

    public static void loginSuccessScreen(){
        System.out.println();
        System.out.println("Login Successful");
        System.out.println("----------------");
    }

    public static void functionsMenu(){
        System.out.println();
        System.out.println("Please select what to proceed with");
        System.out.println("1 - Check Balance");
        System.out.println("2 - Deposit Money");
        System.out.println("3 - Withdraw Money");
        System.out.println("4- Exit");
    }

    public static void invalidLogin(){
        System.out.println("Invalid login : Account Number or Pin Number is not correct");
    }

    public static void accountMenu(){
        System.out.println();
        System.out.println("Please select the account you want to access");
        System.out.println("1 - Savings Account");
        System.out.println("2 - Mobile Account");
        System.out.println("3 - Exit");
    }


}
