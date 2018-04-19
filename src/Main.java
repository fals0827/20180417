import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList <Shape> shape1 = new ArrayList<Shape>();

        System.out.println("圓形 ");
        System.out.print("請輸入半徑 r :");
        shape1.add(new Circle(scn.nextInt()));

        System.out.println("矩形");
        System.out.print("請輸入 寬 :");
        int weight = scn.nextInt();
        System.out.print("請輸入 長 :");
        int height = scn.nextInt();
        shape1.add(new Rectangle( weight , height));

        System.out.println("三角形");
        System.out.print("請輸入 a 邊長 :");
        int a = scn.nextInt();
        System.out.print("請輸入 b 邊長 :");
        int b = scn.nextInt();
        System.out.print("請輸入 c 邊長 :");
        int c = scn.nextInt();
        System.out.print("請輸入 a 邊高 :");
        int h = scn.nextInt();
        shape1.add(new Triangle( a , b , c , h ));
        System.out.println("============================");
        for (int i = 0 ; i < 3 ; i ++){
            Shape nShape = shape1.get(i);
            nShape.show();
        }
    }
}
