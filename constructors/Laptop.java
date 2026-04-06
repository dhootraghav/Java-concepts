// consturctor chaining

package constructors;

public class Laptop {
    String brand;
    int ram, storage;
    public Laptop(String brand, int ram, int storage){
        this.brand = brand;
        this.ram = ram;
        this.storage = storage;
    }
    public Laptop(String brand, int ram){
        this(brand, ram, 256);
    }
    public Laptop(String brand){
        this(brand, 8);
    }
    public static void main(String[] args) {
        Laptop l1 = new Laptop("Dell", 6, 512);
        Laptop l2 = new Laptop("Mac", 8);
        Laptop l3 = new Laptop("Asus");
        System.out.println(l1.brand+" "+l1.ram+" "+l1.storage+"\n"+
        l2.brand+" "+l2.ram+" "+l2.storage+"\n"+
        l3.brand+" "+l3.ram+" "+l3.storage);
    }
}
