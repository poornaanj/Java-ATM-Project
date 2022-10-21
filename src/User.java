public class User {

    private int accountNumber;
    private int pin;
    private double savingsBalance;
    private double mobileBalance;

    public User(int accountNumber, int pin, double savingsBalance, double mobileBalance){
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.savingsBalance = savingsBalance;
        this.mobileBalance = mobileBalance;
    }

    public User(int accountNumber,int pin){
        this(accountNumber,pin,0,0);
    }

    public double getSavingsBalance(){
        return savingsBalance;
    }
    public double getMobileBalance() {
        return mobileBalance;
    }
    public int getPin() {
        return pin;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
