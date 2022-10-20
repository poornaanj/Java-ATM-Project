import java.text.NumberFormat;
import java.util.Locale;

public class Operations {

    User user1 = new User(1234,123);
    private double balance = user1.getBalance();

    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposit successful");
    }

    public void withdraw(double amount){
        balance -= amount;
        System.out.println("Withdraw successful");
    }

    public String getBalance(){
        var formattedBalance = NumberFormat.getCurrencyInstance(Locale.US).format(balance);
        return formattedBalance;
    }
}
