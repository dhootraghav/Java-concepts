package q4;

public class Upi implements Payable {
    @Override 
    public void pay(double amount){
        System.out.println(amount+" Payed through upi payment");
    }

    @Override
    public String getTransactionId() {
        return "UPI0123";
    }
}
