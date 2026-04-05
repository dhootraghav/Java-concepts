package q4;

public interface Payable {
    abstract void pay(double amount);
    abstract String getTransactionId();
}
