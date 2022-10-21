import java.text.NumberFormat;
import java.util.Locale;

public class Account {
    private double balance;

    public Account(double balance){
        this.balance = balance;
    }

    //This method performs money deposit function
    public void deposit(double amount){
        balance += amount;
        System.out.println();
        System.out.println("------Deposit successful------");
        System.out.println("Your new balance is "+ getBalance());
    }

    //This method is for money withdraw function
    public void withdraw(double amount){
        if(amount<=balance){
            balance -= amount;
            System.out.println();
            System.out.println("------Withdraw successful-----");
            System.out.println("Your new balance is "+ getBalance());
        }
        else{
            System.out.println();
            System.out.println("----------------Withdraw unsuccessful----------------");
            System.out.println("Your account balance is less than the withdraw amount ");
        }
    }

    //Account balance is formatted to represent as a $ value
    public String getBalance(){
        var formattedBalance = NumberFormat.getCurrencyInstance(Locale.US).format(balance);
        return formattedBalance;
    }
}
