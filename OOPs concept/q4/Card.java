package q4;

public class Card implements Payable {
    @Override
    public void pay(double amount){
        System.out.println(amount+" Payed through card");
    }

    @Override
    public String getTransactionId(){
        return "card100123";
    }
}
