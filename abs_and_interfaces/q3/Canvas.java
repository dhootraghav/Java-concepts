package abs_and_interfaces.q3;

public class Canvas implements Drawable, Resizable{
    @Override
    public void draw(){
        System.out.println("Drawing...");
    }
    public void resize(int factor){
        System.out.println("Resizing to "+ factor +"...");
    }
    public static void main(String[] args) {
        Canvas c = new Canvas();
        c.draw();
        c.resize(5);
    }
}
