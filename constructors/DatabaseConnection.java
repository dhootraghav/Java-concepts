// singleton(only one object can exist)

package constructors;

public class DatabaseConnection {
    static DatabaseConnection instance;
    private DatabaseConnection(){System.out.println("Connection created");}
    public static DatabaseConnection getInstance(){
        if(instance == null){
            instance = new DatabaseConnection();
        }
        return instance;
    }
    public static void main(String[] args) {
        DatabaseConnection dc1 = DatabaseConnection.getInstance();
        DatabaseConnection dc2 = DatabaseConnection.getInstance();
        DatabaseConnection dc3 = DatabaseConnection.getInstance();
        System.out.println(dc1 == dc2);
        System.out.println(dc2 == dc3);
    }
}