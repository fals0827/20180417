import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList <Shape> shape1 = new ArrayList<Shape>();
        shape1.add(new Circle(3));
        Shape s1 = shape1.get(0);
        s1.show();
    }
}
