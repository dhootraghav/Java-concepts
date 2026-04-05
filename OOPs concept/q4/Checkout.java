package q4;

public class Checkout{
    public void process_payment(Payable p, double amount){
        p.pay(amount);
        System.out.println("Transaction id : "+p.getTransactionId());
    }
    public static void main(String[] args) {
        Checkout checkout = new Checkout();
        checkout.process_payment(new Card(), 10000);
        checkout.process_payment(new Cash(), 5000);
        checkout.process_payment(new Upi(), 7500);
    }
}
