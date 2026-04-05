package constructors;

public class Counter {
    public int count;
    private int initial_value;
    public Counter(int count){
        this.count = count;
        this.initial_value  = count;
    }
    void increment(){count++;}
    void decrement(){count--;}
    void reset(){count = initial_value;}

    public static void main(String[] args) {
        Counter c1 = new Counter(0);
        Counter c2 = new Counter(100);
        c1.increment(); c1.increment();
        c2.decrement(); c2.decrement();
        System.out.println("Values after modification : "+c1.count);
        System.out.println("Values after modification : "+c2.count);
        c1.reset(); c2.reset();
        System.out.println("Reset values : ");
        System.out.println(c1.count);
        System.out.println(c2.count);
    }
}
