package abs_and_interfaces.q1;

public class Test {
    public static void main(String[] args) {
        Printable[] printable = new Printable[2];
        printable[0] = new Document();
        printable[1] = new Image();
        for(int i=0;i<2;i++){
            printable[i].print();
        }
    }
}

