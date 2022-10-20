import java.text.NumberFormat;
import java.util.Locale;

public class bankingFunctions {
    private double balance;

    public bankingFunctions(double balance){
        this.balance = balance;
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposit successful");
        System.out.println("Your new balance is "+ getBalance());
    }

    public void withdraw(double amount){
        balance -= amount;
        System.out.println("Withdraw successful");
        System.out.println("Your new balance is "+ getBalance());
    }

    public String getBalance(){
        var formattedBalance = NumberFormat.getCurrencyInstance(Locale.US).format(balance);
        return formattedBalance;
    }
}
