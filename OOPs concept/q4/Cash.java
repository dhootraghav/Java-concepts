package q4;

public class Cash implements Payable{
    @Override
    public void pay(double amount){
        System.out.println(amount+" Payed through cash");
    }

    @Override
    public String getTransactionId(){
        return "cash12345";
    }
}
