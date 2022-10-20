public class User {

    private int accountNumber;
    private int pin;
    private double balance;

    public User(int accountNumber, int pin, double balance){
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }

    public User(int accountNumber,int pin){
        this(accountNumber,pin,0);
    }

    public double getBalance(){
        return balance;
    }
}
